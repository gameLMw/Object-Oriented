package io.github.gameLMw.object_oriented.inner;

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
        LM p = new LM();
        p.new Bird().show();

        //静态的成员内部类使用
        LM.Dog b = new LM.Dog();
        b.show();

        System.out.println("------------");
        new LM.Dog().show();
    }
}

