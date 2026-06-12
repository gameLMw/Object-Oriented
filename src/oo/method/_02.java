package oo.method;

public class _02 {
    public static void main(String[] args) {
        // 值传递

        // 基本数据类型
        int m = 10;
        int n = m;// 传递的是数据
        System.out.println(m + " " + n);
        n = 20;
        System.out.println(m + " " + n);

        // 数组
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = a;// 传递的是地址
        System.out.println(a[0] + " " + b[0]);
        a[0] = 100;
        System.out.println(a[0] + " " + b[0]);

        // 对象
        A a1 = new A();
        a1.m = 10;
        A a2 = a1;
        System.out.println(a1.m + " " + a2.m);
        a1.m = 100;
        System.out.println(a1.m + " " + a2.m);
    }

    public void add(int m) {
        m++;
    }
}

