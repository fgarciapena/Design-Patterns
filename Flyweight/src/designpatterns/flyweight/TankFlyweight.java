package designpatterns.flyweight;

public class TankFlyweight implements Flyweight {
    public int getDamage() {
        return 30;
    }

    public int getHealth() {
        return 100;
    }

    public int getSpeed() {
        return 1;
    }

    public int getDefense() {
        return 10;
    }
}
