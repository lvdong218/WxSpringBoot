package com.personnal.wxBackground;

import com.personnal.wxBackground.entity.Person;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@SpringBootTest
class WxBackgroundApplicationTests {

	/**
	 * stream流学习
	 */
	@Test
	public void streamStudy() {
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("张三", 1000.0, 20, "男", "北京"));
		personList.add(new Person("李四", 2000.0, 21, "男", "南京"));
		personList.add(new Person("王五", 3000.0, 20, "女", "合肥"));
		personList.add(new Person("赵六", 4000.0, 22, "男", "四川"));
		personList.add(new Person("孙七", 5000.0, 25, "女", "上海"));
		//查看最高工资
		System.out.println("查看工资最高人薪资为:"+personList.stream().max(Comparator.comparingDouble(Person::getSalary)).get().getSalary());

		long count = personList.stream().filter(p->p.getSalary()>2000).count();
		System.out.println("查看薪资大于2000人数为:"+count);

		Double allCount = personList.stream().parallel().mapToDouble(Person::getSalary).sum();
		System.out.println("查看薪资总和:"+allCount);
	}

	public static void main(String[] args) {
		WxBackgroundApplicationTests tests = new WxBackgroundApplicationTests();
		tests.streamStudy();
	}

}
