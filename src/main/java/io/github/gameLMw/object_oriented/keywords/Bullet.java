package io.github.gameLMw.object_oriented.keywords;

class Bullet implements Flyable, Attackable {
    @Override
    public void fly() {
        System.out.println("子弹飞一会儿");
    }

    @Override
    public void attack() {
        System.out.println("子弹攻击");
    }
}
