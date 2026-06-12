package oo.keywords;

/*
 * 接口  interface
 *
 * 接口的理解：接口本质是标准，规范。
 *
 * 可以声名：
 *       属性：必须使用pubic static final修饰
 *       方法：jdk8之前：声名抽象方法，必须使用public abstract
 *             jdk8：声明静态方法，默认方法。
 *                       接口中声明的静态方法只能被接口访问，不能使用其实现类访问
 *                       接口中声明的默认方法可以被实现类继承
 *             jkd9 ：声名私有方法
 * 不能声明：构造器，代码块
 *
 * 修饰符 class A extends B implements C,D{}
 * A相较于B，是子类
 * A相对于C，是实现类
 *
 * 类针对于接口的多实现，一定程度上弥补了类的单继承的局限性
 *
 * 接口与接口可以有继承关系
 *
 * 接口的多态性：接口名 变量名 = new 实现类对象();
 * */

public class _04 {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);
        Bullet b1 = new Bullet();
        b1.fly();
        b1.attack();

        Flyable f1 = new Bullet();
        f1.fly();
    }
}

