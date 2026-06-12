package oo.keywords;

class Chinese {
    //非静态变量，实例变量
    String name;
    int age;

    //静态变量,类变量
    static String nation = "CHN";

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
