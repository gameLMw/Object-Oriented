package oo.keywords;

/*
* 抽象类 abstract
* 抽象类 不能实例化，可包含抽象方法
* 抽象方法 只有声明，没有方法体，必须在子类中实现
*
* 不能用abstract修饰私有方法，静态方法，final方法，final的类
* */

public class _03 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
    }
}

// 抽象类
abstract class Animal {
    String name;
    int age;

    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void eat();
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("骨头");
    }
}