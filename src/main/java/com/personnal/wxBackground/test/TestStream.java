package com.personnal.wxBackground.test;

import com.personnal.wxBackground.entity.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * stream流处理
 */
public class TestStream {


    public void test1(){
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("张三", 1000.0, 20, "男", "北京"));
        personList.add(new Person("李四", 2000.0, 21, "男", "南京"));
        personList.add(new Person("王五", 3000.0, 20, "女", "合肥"));
        personList.add(new Person("赵六", 4000.0, 22, "男", "四川"));
        personList.add(new Person("孙七", 5000.0, 25, "女", "上海"));
        //查看最高工资
        System.out.println(personList.stream().max(Comparator.comparingDouble(Person::getSalary)).get().getSalary());
    }
}
