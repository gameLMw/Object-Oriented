package oo.extend;

import oo.Person;

class Student extends Person {
    public void eat() {
        System.out.println("食堂吃饭");
        super.sleep();
    }
}
