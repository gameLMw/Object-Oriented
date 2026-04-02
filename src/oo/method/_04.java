package oo.method;

/*
* 单列传递
* */

public class _04 {
    public static void main(String[] args) {
        test t1 = test.getInstance();
        test t2 = test.getInstance();
        System.out.println(t1 == t2);//true
    }
}

// 饿汉式
/*class test{
    //类的构造器私有化
    private test(){

    }

    //在类的内部创建当前对象
    //此属性必须是static的
    private static test t = new test();

    //通过类名.方法名()获取对象
    public static test getInstance(){
        return t;
    }
}*/

// 懒汉式
class test{
    //类的构造器私有化
    private test(){

    }

    //在类的内部创建当前对象
    //此属性必须是static的
    private static test t = null;

    //通过类名.方法名()获取对象
    public static test getInstance(){
        if(t == null){
            t = new test();
        }
        return t;
    }
}

/*
* 区别
* 饿汉式：线程安全，但效率低
* 懒汉式：线程不安全，但效率高
* 饿汉式：类加载时创建对象，但可能造成内存浪费
* 懒汉式：类加载时创建对象，但可能造成方法重复定义
*
* 解决懒汉式线程安全问题：D:\code\java_application\src\multithreading\threadsafemore\_01.java
* */