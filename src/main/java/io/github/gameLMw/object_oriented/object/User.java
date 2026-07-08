package io.github.gameLMw.object_oriented.object;

import java.util.Objects;

class User {
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof User) {
            User u = (User) obj;
            return Objects.equals(this.name, u.name) && this.age == u.age;
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

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    //idea 自动生成,alt+insert->equals()
/*
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
*/

}
