package oo.inner;

/*
* 内部类 InnerClass
* 将一个类定义在另一个类中，则该类称为内部类
*
* 内部类的分类：
* 1. 成员内部类:直接声名在外部类中
*       使用static修饰的，静态内部类
*       不使用static修饰的，非静态内部类
* 2. 局部内部类：声名在方法中，构造器中，代码块中
*       匿名的局部内部类
*       非匿名的局部内部类
*
* 内部类声明不能直接写执行语句（如 System.out.println()、赋值语句等）
* */

public class _01 {
    public static void main(String[] args) {
        //非静态的成员内部类的使用
        Person p = new Person();
        p.new Bird().show();

        //静态的成员内部类使用
        Person.Dog b = new Person.Dog();
        b.show();

    }
}

//外部类
class Person{

    public int age=10;
    public static String name="LM";

    //静态的成员内部类
    static class Dog{
        public void show(){
            System.out.println(name);
        }
    }
    //非静态的成员内部类
    class Bird{
        public void show(){
            System.out.println(age);
        }
    }

    public void method(){
        //局部内部类
        class InnerClass1{

        }
    }

    public Person(){
        //局部内部类
        class InnerClass1{

        }
    }

    {
        //局部内部类
        class InnerClass1{

        }
    }
}
