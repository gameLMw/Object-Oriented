package io.github.gameLMw.object_oriented.constructor;

import io.github.gameLMw.object_oriented.Person;

public class _01 {
    /*构造器
     * 作用
     * 1.搭配new 创建对象
     * 2.在创建对象时，会给对象的相关属性赋值
     * 3.
     * 4.
     *
     * 声名：访问修饰符 类名(参数列表){}
     * 没有构造器时，java会默认添加一个无参构造器,且添加的构造器与默认访问修饰符一致
     *
     *
     *
     * */
    public static void main(String[] args) {
        Person p1 = new Person(1.65, 19, "LM");
        System.out.println(p1.name);
    }
}
