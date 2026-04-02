package oo.keywords;

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
* 使基本数据类型具备类的特征
* 
* 互相转换
* 1. 为什么
*       一些场景下，需要把基本数据类型转换成对象类型，列如：add(Object obj)
*       包装类，不能+，-，*，%运算，需要把基本数据类型转换成对象类型
* */

public class _06 {
    public static void main(String[] args) {
        //基本数据类型转换成对象类型
        //1. 使用包装类的构造方法（但jdk9中已弃用）
//        int a=10;
//        Integer i= new Integer(a);
        //2. 使用包装类的静态方法valueOf（）
        int a=10;
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
        String str1 =String.valueOf(a7);
        System.out.println(str1);//“10”

        //2. 使用+
        String str2 = a7+"";

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

