package oo.extend;

import oo.method.Person;

/*
* extends：  继承
* 方法重写： 子类重写父类的方法
* super:    子类访问父类的成员变量和方法
* */

public class _01 {
    public static void main(String[] args) {
        student s = new student();
        s.eat();
        s.sleep();
    }
}

class student extends Person{
    public void eat(){
        System.out.println("食堂吃饭");
        super.sleep();
    }
}


