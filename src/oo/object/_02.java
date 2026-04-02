package oo.object;

/*
* equals()
* 没重写比较两个对象地址值是否相同
* 对于String,File,Date和包装类等，比较两个对象的具体内容是否相同
* 只能用于引用数据类型
* */

public class _02 {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();

        System.out.println(u1.equals(u2));

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1.equals(s2));
    }

}



class User{
    private String name;
    private int age;

     public User() {
     }

     public User(String name, int age) {
         this.name = name;
         this.age = age;
     }

     // 重写equals()
      @Override
      public boolean equals(Object obj) {
          if(this == obj) {
              return true;
          }
          if(obj instanceof User) {
              User u = (User)obj;
              return this.name.equals(u.name) && this.age == u.age;
//              if( this.name.equals(u.name) && this.age == u.age){
//                  return true;
//              }else {
//                  return false;
//              }

          }
          return false;
          /*
          * 1.判断对象地址值是否相同
          * 2.判断对象内容是否相同
          * */
      }

      //idea 自动生成,alt+insert->equals()
}
