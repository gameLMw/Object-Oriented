package io.github.gameLMw.object_oriented.javabean;

/*
 * javabean
 * 1. 类是公共的
 * 2. 有一个无参数的公共的构造器
 * 3. 有属性，且属性有对应的getter和setter方法
 * */

import java.util.Date;

public class _01 {
    public _01() {

    }

    private int id;
    private String name;
    private String email;
    private Date birth;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
