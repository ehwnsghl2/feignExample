package com.brandjunhoe.feigntwoservice;

/**
 * Create by DJH on 2021/10/05.
 */
public class User {

    private String name;

    private int age;

    private String sex;

    public User(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }
}
