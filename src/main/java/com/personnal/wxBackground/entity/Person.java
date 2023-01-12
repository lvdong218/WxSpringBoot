package com.personnal.wxBackground.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {

    /**
     * 姓名
     */
    private String name;

    /**
     * 薪资
     */
    private Double salary;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

    /**
     * 所在城市
     */
    private String city;

    public Person(String name,Double salary,Integer age,String sex,String city){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.sex = sex;
        this.city = city;
    }
}
