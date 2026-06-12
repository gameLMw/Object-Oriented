package oo.keywords;

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println("骨头");
    }
}
