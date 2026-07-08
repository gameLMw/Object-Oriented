package io.github.gameLMw.object_oriented.object;

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
