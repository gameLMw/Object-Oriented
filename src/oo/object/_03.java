package oo.object;

/*
* toString()
* 1.默认返回对象地址值
* 2.对于String,File,Date和包装类等，返回具体内容
* */

public class _03 {
    public static void main(String[] args) {
        Use u = new Use();
        System.out.println(u.toString());
        System.out.println(u);

        String s = new String("hello");
        System.out.println(s);
        System.out.println(s.toString());
    }
}

class Use {
    private String name;
    private int age;

    public Use() {
    }
    public Use(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 重写toString()
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // idea 自动生成,alt+insert->toString()
}
