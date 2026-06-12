package oo.method;

public class _01 {
    // 可变参数
    public static void main(String[] args) {
        _01 a = new _01();
        a.print();
        a.print(1, 2, 3);
        a.print(1, 2);
    }

    public void print(int... nums) {
        System.out.println("hello");

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
