package io.github.gameLMw.object_oriented.method;

// 懒汉式
class test {
    //类的构造器私有化
    private test() {

    }

    //在类的内部创建当前对象
    //此属性必须是static的
    private static test t = null;

    //通过类名.方法名()获取对象
    public static test getInstance() {
        if (t == null) {
            t = new test();
        }
        return t;
    }
}
