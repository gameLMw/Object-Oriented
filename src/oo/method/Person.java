package oo.method;

/*
*this：代表当前对象
* */

public class Person {
    // 属性
    public String name;
    public int age;
    public double height;

    // 构造器
    public Person(double height, int age, String name) {
        this.height = height;
        this.age = age;
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public Person(int age, double height) {
        this.age = age;
        this.height = height;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
    }

    public Person(double height) {
        this.height = height;
    }

    public Person() {
    }

    // 方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
