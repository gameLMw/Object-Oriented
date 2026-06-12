package oo.keywords;

/*
 * final 常量
 * 1.final修饰类，不能被继承
 * 2.final修饰方法，不能被重写
 * 3.final修饰变量，不能被修改，只能在显性初始化，代码块初始化，构造器初始化中赋值
 * */

public class _02 {
    public static void main(String[] args) {
        final int a = 10;
        System.out.println(a);

//        a = 20;//错误。java: 无法为 final 变量 a 分配值
//        System.out.println(a);
    }
}
