package io.github.gameLMw.object_oriented.object;

/*
 * equals()
 * Object类的equals()默认比较两个对象的地址值是否相同
 * String、File、Date和包装类等重写了equals()，比较的是具体内容
 * User类也重写了equals()，比较的是name和age的值
 * 只能用于引用数据类型
 * */

public class _02 {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();

        System.out.println(u1.equals(u2)); // true，因为name都为null，age都为0

        User u3 = new User("张三", 20);
        User u4 = new User("张三", 20);
        System.out.println(u3.equals(u4)); // true，因为name和age都相同

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.equals(s2)); // true，String重写了equals()
    }

}


