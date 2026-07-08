package io.github.gameLMw.object_oriented.keywords;

/*
 * 包装类，基本数据类型，String相互转换
 *
 * 包装类
 * 基本数据类型            包装类
 * byte                  Byte
 * short                 Short
 * int                   Integer
 * long                  Long
 * float                 Float
 * double                Double
 * char                  Character
 * boolean               Boolean
 *
 * 自动装箱：将基本数据类型自动转换为对应的包装类对象
 * 自动拆箱：将包装类对象自动转换为对应的基本数据类型
 *
 *  1. 自动装箱/拆箱的触发时机
 *  赋值时
 *  Integer obj = 10;    // 装箱
 *  int num = obj;       // 拆箱
 *
 *  运算时
 *  Integer a = 10;
 *  a = a + 5;           // 先拆箱a，计算后再装箱
 *
 *  方法调用时
 *  public void method(Integer i) {}
 *  method(10);          // 装箱
 *
 *
 * 2. Integer缓存池（重要！）
 *   范围：-128 到 127
 *   这个范围内的整数会被缓存，重复使用同一对象
 *   超出范围会创建新对象
 *
 *  Integer a = 127;
 *  Integer b = 127;
 *  System.out.println(a == b);  // true（缓存）

 *  Integer c = 128;
 *  Integer d = 128;
 *  System.out.println(c == d);  // false（新对象）
 * */

public class _06 {
    public static void main(String[] args) {
        //基本数据类型转换成对象类型
        //1. 使用包装类的构造方法（但jdk9中已弃用）
//        int a=10;
//        Integer i= new Integer(a);
        //2. 使用包装类的静态方法valueOf（）
        int a = 10;
        Integer a2 = Integer.valueOf(a);
        System.out.println(a2);

        //包装类转换成基本数据类型
        //使用包装类的成员方法xxxValue()
        Integer a3 = 10;//自动装箱
        int a4 = a3.intValue();
        System.out.println(a4);

        //自动拆箱
        int a5 = a3;
        Integer a6 = a5;

        //基本数据类型转换成String
        //1. 使用包装类的静态方法valueOf()
        int a7 = 10;
        String str1 = String.valueOf(a7);
        System.out.println(str1);//“10”

        //2. 使用+
        String str2 = a7 + "";

        //String转换成基本数据类型,包装类
        //1. 使用包装类的静态方法parseXxx()
        String str3 = "10";
        int a8 = Integer.parseInt(str3);
        System.out.println(a8);

        //特别的
        String str4 = "123a";
        int a9 = Integer.parseInt(str4);//报错：java.lang.NumberFormatException: For input string: "123a"
        System.out.println(a9);
    }
}

