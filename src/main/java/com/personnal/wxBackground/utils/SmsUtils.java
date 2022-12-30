package com.personnal.wxBackground.utils;

import com.alibaba.fastjson.JSONObject;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;

import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * 短信工具类
 * @author HenryZou
 * @version 1.2.0
 *
 */
public class SmsUtils {
	/**
	 * 配置参数
	 * @since 1.0.0
	 */
	private static Properties prop;
	/**
	 * 短信服务提供商名称
	 * 		中国网建：smschinese
	 * 		启瑞云：qirui
	 * @since 1.0.0
	 */
	private static String smsServerName;
	/**
	 * 中国网建短信服务提供商名称
	 * @since 1.0.0
	 */
	private static final String SMS_CHINESE = "smschinese";
	/**
	 * 启瑞云短信服务提供商名称
	 * @since 1.0.0
	 */
	private static final String QIRUI = "qirui";
	
	/**
	 * 加载配置文件
	 * @since 1.0.0
	 */
	static {
		prop = new Properties();
		try {
			prop.load(SmsUtils.class.getResourceAsStream("/sms.properties"));
			smsServerName = prop.getProperty("smsServerName");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 发送短信
	 * @param mobile 发送手机号
	 * @param smsText 信息内容
	 * @return 状态码
	 * @throws ClientProtocolException
	 * @throws Exception
	 * @since 1.0.0
	 */
	public static Map<String, Object> sendSms(String mobile, String smsText) throws ClientProtocolException, Exception {
		Integer code;
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("success", false);
		if(SMS_CHINESE.equals(smsServerName)) {
			code = sendSmsOfSmsChinese(mobile, smsText);
			if(code > 0) {
				result.put("success", true);
			}
		} else if(QIRUI.equals(smsServerName)) {
			JSONObject json = sendSmsOfQirui(mobile, smsText);
			if(json.getBooleanValue("success")) {
				code = 1;
	        } else {
	        	code = json.getInteger("r");
	        }
			if(code == 1) {
				result.put("success", true);
				result.put("id", json.getString("id"));
			}
		} else {
			code = null;
		}
		result.put("code", code);
		result.put("msg", getMsg(code));
		return result;
	}
	
	/**
	 * 获取错误码对应信息
	 * @param errcode 错误码
	 * @return 错误码对应信息
	 * @since 1.0.0
	 */
	public static String getMsg(Integer errcode) {
		String msg;
		if(SMS_CHINESE.equals(smsServerName)) {
			msg = getErrorMsgOfSmsChinese(errcode);
		} else if(QIRUI.equals(smsServerName)) {
			msg = getErrorMsgOfQirui(errcode);
		} else {
			msg = null;
		}
		return msg;
	}
	
	//------中国网建------
	/**
	 * 中国网建发送短信
	 * @param mobile 发送手机号
	 * @param smsText 信息内容
	 * @return 状态码
	 * @throws ClientProtocolException
	 * @throws Exception
	 * @since 1.0.0
	 */
	public static Integer sendSmsOfSmsChinese(String mobile, String smsText) throws ClientProtocolException, Exception {
		String uid = prop.getProperty("uid");
		String key = prop.getProperty("key");
		String charset = prop.getProperty("charset").toUpperCase();
		if(null != uid && !"".equals(uid) && null != key && !"".equals(key) && null != charset && !"".equals(charset)) {
			List<NameValuePair> formParams = 
					Form.form().add("Uid", uid)
							   .add("Key", key)
							   .add("smsMob", mobile)
							   .add("smsText", smsText)
							   .build();
			String res = Request.Post("http://" + getUrlPrefixOfSmsChinese(charset) + ".api.smschinese.cn")
								.setHeader("Content-Type", "application/x-www-form-urlencoded;charset=" + charset)
								.bodyForm(formParams, Charset.forName(charset))
								.execute() //发送请求
								.returnContent() //接受响应
								.asString(); //获取响应的字符串格式，并设置编码格式
			return Integer.parseInt(res);
		} else {
			throw new NullPointerException("uid、key和charset至少有一个为null或者空串");
		}
	}

	/**
	 * 获取中国网建URL前缀
	 * @return URL前缀
	 * @since 1.0.0
	 */
	private static String getUrlPrefixOfSmsChinese(String charset) {
		if("GBK".equals(charset)) {
			return "gbk";
		} else if("UTF-8".equals(charset)) {
			return "utf8";
		} else {
			throw new RuntimeException("未识别charset");
		}
	}
	
	/**
	 * 获取中国网建错误码对应信息
	 * @param errcode 错误码
	 * @return 错误码对应信息
	 * @since 1.0.0
	 */
	public static String getErrorMsgOfSmsChinese(Integer errcode) {
		switch (errcode) {
		case -1:
			return "没有该用户账户";
		case -2:
			return "接口密钥不正确";
		case -21:
			return "MD5接口密钥加密不正确";
		case -3:
			return "短信数量不足";
		case -11:
			return "该用户被禁用";
		case -14:
			return "短信内容出现非法字符";
		case -4:
			return "手机号格式不正确";
		case -41:
			return "手机号码为空";
		case -42:
			return "短信内容为空";
		case -51:
			return "短信签名格式不正确";
		case -52:
			return "短信签名太长";
		case -6:
			return "IP限制";
		default:
			if(errcode > 0) {
				return "已发送"+errcode+"条";
			}
			return "未知错误";
		}
	}
	
	//------启瑞云------
	/**
	 * 启瑞云发送短信
	 * @param mobile 发送手机号
	 * @param smsText 信息内容
	 * @return 发送结果
	 * @throws ClientProtocolException
	 * @throws Exception
	 * @since 1.0.0
	 */
	public static JSONObject sendSmsOfQirui(String mobile, String smsText) throws ClientProtocolException, Exception {
		String apiKey = prop.getProperty("apiKey");
		String apiSecret = prop.getProperty("apiSecret");
		if(null != apiKey && !"".equals(apiKey) && null != apiSecret && !"".equals(apiSecret)) {
			StringBuilder sb = new StringBuilder("http://api.qirui.com:7891/mt");
	        sb.append("?dc=15");
	        sb.append("&sm=").append(URLEncoder.encode(smsText, "utf8"));
	        sb.append("&da=").append(mobile);
	        sb.append("&un=").append(apiKey);
	        sb.append("&pw=").append(apiSecret); 
	        sb.append("&tf=3&rd=1&rf=2");   //短信内容编码为 urlencode+utf8
			String request = sb.toString();
	        String respStr = Request.Get(request) //发送get方式的http请求
					.execute() //发送请求
					.returnContent() //接受响应
					.asString(); //获取响应的字符串格式，并设置编码格式
	        return JSONObject.parseObject(respStr);
		} else {
			throw new NullPointerException("apiKey或apiSecret为null或者空串");
		}
	}
	
	/**
	 * 启瑞云获取短信接收结果
	 * @return 接收结果集合
	 * @throws ClientProtocolException
	 * @throws Exception
	 * @since 1.2.0
	 */
//	public static List<SMSSendResult> getResultOfQirui() throws ClientProtocolException, Exception {
//		String apiKey = prop.getProperty("apiKey");
//		String apiSecret = prop.getProperty("apiSecret");
//		if(null != apiKey && !"".equals(apiKey) && null != apiSecret && !"".equals(apiSecret)) {
//			StringBuilder sb = new StringBuilder("http://api.qirui.com:7891/mo");
//	        sb.append("?un=").append(apiKey);
//	        sb.append("&pw=").append(apiSecret); 
//	        sb.append("&tf=3&rf=2");   //短信内容编码为 urlencode+utf8
//	        String respStr = Request.Get(sb.toString()) //发送get方式的http请求
//					.execute() //发送请求
//					.returnContent() //接受响应
//					.asString(); //获取响应的字符串格式，并设置编码格式
//	        JSONObject result = JSONObject.parseObject(respStr);
//	        List<SMSSendResult> resultList = new ArrayList<SMSSendResult>();
//	        if(result.getBooleanValue("success")) {
//	    		JSONArray jsonArray = result.getJSONArray("data");
//	    		for (Object object : jsonArray) {
//	    			JSONObject jsonObject;
//	    			if(object instanceof JSONObject) {
//	    				jsonObject = (JSONObject) object;
//	    			} else {
//	    				jsonObject = JSONObject.parseObject(JSONObject.toJSONString(object));
//	    			}
//	    			String code = jsonObject.getString("su");
//	    			resultList.add(new SMSSendResult(jsonObject.getString("id"), 
//	    					code.equals("DELIVRD") ? "接收成功" : "接收失败", code));
//	    		}
//	        }
//	        return resultList;
//		} else {
//			throw new NullPointerException("apiKey或apiSecret为null或者空串");
//		}
//	}
	
	/**
	 * 获取启瑞云错误码对应信息
	 * @param errcode 错误码
	 * @return 错误码对应信息
	 * @since 1.0.0
	 */
	public static String getErrorMsgOfQirui(Integer errcode) {
		switch (errcode) {
		case 1:
			return "发送成功";
		case 9002:
			return "未知命令";
		case 9012:
			return "短信消息内容错误";
		case 9013:
			return "目标地址错误";
		case 9014:
			return "短信内容太长";
		case 9015:
			return "路由错误";
		case 9016:
			return "没有下发网关";
		case 9017:
			return "定时时间错误";
		case 9018:
			return "有效时间错误";
		case 9019:
			return "无法拆分或者拆分错误";
		case 9020:
			return "号码段错误";
		case 9021:
			return "消息编号错误，这个和 PacketIndex 参数有关";
		case 9022:
			return "用户不能发长短信(EsmClass 错误)";
		case 9023:
			return "ProtocolID 错误";
		case 9024:
			return "结构错误，一般是指长短信";
		case 9025:
			return "短信编码错误";
		case 9026:
			return "内容不是长短信";
		case 9027:
			return "签名不对";
		case 9028:
			return "目标网关不支持长短信";
		case 9029:
			return "路由拦截";
		case 9030:
			return "目标地址(手机号)太多";
		case 9031:
			return "目标地址(手机号)太少";
		case 9032:
			return "发送速度太快";
		case 9101:
			return "验证失败，一般和用户名/密码/IP 地址相关";
		case 9102:
			return "没有填写用户名";
		case 9103:
			return "名字没找到";
		case 9104:
			return "IP 地址不对";
		case 9105:
			return "超过最大连接数，就是 tcp 连接数，http 也是一样的";
		case 9106:
			return "协议版本错误";
		case 9107:
			return "帐号无效，比如过期/禁用";
		case 9401:
			return "计费错误";
		case 9402:
			return "非法内容";
		case 9403:
			return "黑名单";
		case 9404:
			return "丢弃";
		case 9405:
			return "Api 帐号丢失";
		case 9406:
			return "配置拒绝，就是帐号设置了拒绝标记";
		case 9407:
			return "帐号没有生成时间,这个属于非法帐号";
		case 9408:
			return "消息超时，超过短信或帐号或系统设置的生存时间";
		case 9409:
			return "由约束规则拒绝";
		case 9410:
			return "状态报告超时";
		case 9411:
			return "状态报告";
		case 9412:
			return "帐号无效";
		case 9413:
			return "重发拦截";
		case 9414:
			return "转发时丢弃，比如该通道已经废弃";
		case 9415:
			return "人工审核失败";
		case 9416:
			return "可能是诈骗信息";
		case 9417:
			return "不匹配模板";
		case 9418:
			return "拒绝审核（审核功能可能关闭）";
		case 9419:
			return "超过该手机号码的日发送次数限制";
		case 9501:
			return "非法目标地址，即手机号";
		case 9502:
			return "消息无法投入队列";
		case 9601:
			return "上行路由失败";
		case 9602:
			return "超过最大重试";
		case 9701:
			return "通知失败";
		case 9702:
			return "处理配置错误";
		case 9801:
			return "投递地址错";
		case 9802:
			return "无法连接到服务器";
		case 9803:
			return "投递发送数据失败";
		case 9804:
			return "投递接收结果失败";
		case 9902:
			return "网关无此能力";
		case 9903:
			return "二进制数据太长了；如网关没有特别说明，一般不能超过 140";
		case 9904:
			return "网关不支持 EsmClass 字段，或等同字段";
		case 9905:
			return "网关不支持 ProtocolID 字段，或等同字段";
		case 9906:
			return "网关不支持 UDHI 字段，或等同字段";
		case 9907:
			return "网关支持 Letter 字段发送，但短信记录没有 letter";
		case 9908:
			return "网关不存在";
		case 9909:
			return "网关没有应答";
		case 9910:
			return "网关不支持该短信编码";
		case 9911:
			return "区域错误";
		default:
			return "未知错误";
		}
	}

}
