package oo.extend;

import oo.method.Person;

/*
* 多态性指的是父类引用指向子类对象
* */

public class _02 {
    public static void main(String[] args) {
        // 多态性之前
        Person p1 = new Person();
        Man m1 = new Man();
        // 多态性之后
        Person p2 = new Man();
        p2.eat();

        /*多态性的应用：虚拟方法调用
        *
        * 调用方法时
        *       编译时，认为是父类方法
        *       执行时，实际会调用子类重写父类的方法
        * 简称为：编译看左边，执行看右边
        *
        * 使用前提：
        *       1. 要有继承关系
        *       2. 要有方法重写
        *
        * 多态的应用场景：适用方法，不适用属性
        *
        * 优点：
        * 1. 避免了内存的浪费
        * 2. 避免了方法大量的重复定义
        * */

        //优点
        _02 a = new _02();
        a.show(new Man());
        a.show(new Woman());
    }
    public void show(Person p){
        p.eat();
    }
}

class Man extends Person{
    public void eat(){
        System.out.println("男人吃");
    }
}

class Woman extends Person{
    public void eat(){
        System.out.println("女人吃");
    }
}
