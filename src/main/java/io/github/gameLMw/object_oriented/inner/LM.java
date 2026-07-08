package io.github.gameLMw.object_oriented.inner;

//外部类
class LM {

    public int age = 10;
    public static String name = "LM";

    //静态的成员内部类
    static class Dog {
        public void show() {
            System.out.println(name);
        }
    }

    //非静态的成员内部类
    class Bird {
        public void show() {
            System.out.println(age);
        }
    }

    public void method() {
        //局部内部类
        class InnerClass1 {

        }
    }

    public LM() {
        //局部内部类
        class InnerClass1 {

        }
    }

    {
        //局部内部类
        class InnerClass1 {

        }
    }
}
