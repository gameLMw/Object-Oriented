package oo.block;

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
