package io.github.gameLMw.object_oriented.block;

/*代码块
 *
 * 代码块的修饰:只能是static
 *
 * 代码块的分类：
 * 1.静态代码块：static修饰的代码块
 * 2.非静态代码块：没有static修饰的代码块
 *
 * 具体使用：
 * 1. 非静态代码块 (实例代码块)
 * 作用:
 *       在创建对象时执行,每次创建对象都会运行一次
 *       优先于构造方法执行
 *       用于初始化所有构造方法的公共代码
 *       可以访问实例变量和实例方法
 *
 * 2. 静态代码块
 * 作用:
 *      在类首次被加载到JVM时执行,且只执行一次
 *      优先于任何实例的创建和静态方法的调用
 *      用于初始化静态变量或执行类级别的初始化操作
 *      只能访问静态成员,不能访问实例成员
 *
 * 区别：如果第二次创建对象， 只有非静态代码块会执行
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