package io.github.gameLMw.object_oriented.keywords;

/*
 * 枚举 enum
 * 继承与java.lang.Enum  。不能继承其他类
 * */

public class _05 {
    public static void main(String[] args) {
        //jdk5之前定义枚举的方法
        System.out.println(Season.SPRING);

        //jdk5之后定义枚举的方法
        System.out.println(Season1.SPRING);

        //测试方法
        //toString()
        //输出枚举对象
        System.out.println(Season1.SPRING.toString());
        System.out.println(Season1.SUMMER.toString());

        //name()
        //输出枚举对象变量名
        System.out.println(Season1.SPRING.name());
        System.out.println(Season1.SUMMER.name());

        //vlaues()
        //获取枚举对象
        Season1[] values = Season1.values();
        for (Season1 season : values) {
            System.out.println(season);
        }

        //valueOf(String objName)
        //参数：枚举对象变量名
        //返回枚举对象，没有直接报错
        String objName = "SPRING";
        Season1 season = Season1.valueOf(objName);
        System.out.println(season);

        //ordinal()
        //返回当前枚举对象在枚举对象数组中是第几个声名的对象
        System.out.println(Season1.SPRING.ordinal());

        //枚举类实现接口1，在枚举类中实现
        Season1.SPRING.show();

        //枚举类实现接口2，在具体的每个枚举属性中实现
        Season1.SPRING.show();
        Season1.SUMMER.show();
    }
}

