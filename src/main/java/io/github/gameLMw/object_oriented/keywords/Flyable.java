package io.github.gameLMw.object_oriented.keywords;

//接口
interface Flyable {
    //全局常量
    public static final int MAX_SPEED = 7900;
    //可以省略public static final
    int MIN_SPEED = 1;

    //只能是抽象方法(可以省略public abstract)
    void fly();
}
