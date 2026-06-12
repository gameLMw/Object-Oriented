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

