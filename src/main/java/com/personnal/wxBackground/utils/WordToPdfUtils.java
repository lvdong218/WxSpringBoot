package com.personnal.wxBackground.utils;

import com.aspose.words.Document;
import com.aspose.words.License;
import com.aspose.words.SaveFormat;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
  * @classname WordToPdfUtils
  * @desc word转pdf工具
  * @author lvdong
  * @version 1.0.0
  * @since：2022/6/23 11:00
*/
public class WordToPdfUtils {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PdfToPictureUtils.class);

    /**
     * 引入去除水印配置
     * 暂不需要也无水印 具体部署之后若有问题再进行引入
     * @return
     */
    public static boolean getLicense() {
        boolean result = false;
        try {;
            InputStream is = WordToPdfUtils.class.getClass().getClassLoader().getResourceAsStream("license.xml"); // license.xml应放在..\WebRoot\WEB-INF\classes路径下
            License aposeLic = new License();
            aposeLic.setLicense(is);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static boolean doc2pdf(String inPath, String outPath) {
//        if (!getLicense()) { // 验证License 若不验证则转化出的pdf文档会有水印产生
//            return false;
//        }
        FileOutputStream os = null;
        try {
            long old = System.currentTimeMillis();
            File file = new File(outPath); // 新建一个空白pdf文档
            String wordPath = file.getParent();
            int dot = file.getName().lastIndexOf('.');
            //获取word名
            String wordName = file.getName().substring(0, dot);
            String pdfPrefix = wordPath + File.separator + wordName;
            StringBuffer imgFilePath;
            imgFilePath = new StringBuffer();
            imgFilePath.append(pdfPrefix);
            imgFilePath.append(".pdf");
            os = new FileOutputStream(imgFilePath.toString());
            Document doc = new Document(inPath); // Address是将要被转化的word文档
            doc.save(os, SaveFormat.PDF);// 全面支持DOC, DOCX, OOXML, RTF HTML, OpenDocument, PDF,
            // EPUB, XPS, SWF 相互转换
            long now = System.currentTimeMillis();
            //转化用时
            log.info("pdf转换成功，共耗时："+ + ((now - old) / 1000.0) + "秒");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }finally {
            if (os != null) {
                try {
                    os.flush();
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        doc2pdf("D:\\upload\\人力资源总监工具书（950页）.docx","D:\\upload\\人力资源总监工具书（950页）.pdf");
    }
}
