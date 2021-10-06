package com.branjunhoe.feignoneservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Create by DJH on 2021/10/05.
 */
public class User {

    private String name;

    private int age;

    private String sex;

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
