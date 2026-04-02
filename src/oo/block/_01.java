package oo.block;

/*代码块
 *
 * 代码块的修饰:只能是static
 *
 * 代码块的分类：
 * 1.静态代码块：static修饰的代码块
 * 2.非静态代码块：没有static修饰的代码块
 *
 * 具体使用：
 * 1.静态代码块：类加载时执行
 * 2.非静态代码块：每创建一个对象时执行,只能访问静态成员变量和静态成员方法
 * */

public class _01 {
    public static void main(String[] args) {
        System.out.println(Demo.count);
        System.out.println(Demo.count);
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        d1.eat();
    }
}

class Demo {
    private int age;
    private String name;

    static int count = 1;

    public Demo() {

    }


    public void eat() {
        System.out.println("吃饭");
    }

    //非静态代码块
    {
        System.out.println("非静态代码块");
    }

    //静态代码块
    static {
        System.out.println("静态代码块");
    }

}
