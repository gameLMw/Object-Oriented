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

