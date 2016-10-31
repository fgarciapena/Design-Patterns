package designpatterns.flyweight;

public class SoldierFlyweight implements Flyweight {
    public int getDamage() {
        return 10;
    }

    public int getHealth() {
        return 50;
    }

    public int getSpeed() {
        return 2;
    }

    public int getDefense() {
        return 4;
    }
}
