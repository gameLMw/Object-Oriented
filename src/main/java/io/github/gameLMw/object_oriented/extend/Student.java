package io.github.gameLMw.object_oriented.extend;

import io.github.gameLMw.object_oriented.Person;

class Student extends Person {
    public void eat() {
        System.out.println("食堂吃饭");
        super.sleep();
    }
}
