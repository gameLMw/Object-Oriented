package oo.keywords;

/*
 * static 静态
 * 不能使用this，不能使用super
 * */

public class _01 {
    public static void main(String[] args) {

        System.out.println(Chinese.nation);

        Chinese c1 = new Chinese();
        c1.name = "张三";
        c1.age = 18;
        c1.nation = "中国";

        Chinese c2 = new Chinese();
        c2.name = "李四";
        c2.age = 19;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.nation);
        System.out.println(c2.nation);
    }
}

