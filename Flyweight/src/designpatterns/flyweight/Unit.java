package designpatterns.flyweight;

public abstract class Unit {
    private int health;
    private int damage;
    private int defense;
    private int speed;

    public Unit() {

    }

    public Unit(Flyweight flyweight) {
        this.setHealth(flyweight.getHealth());
        this.setDamage(flyweight.getDamage());
        this.setDefense(flyweight.getDefense());
        this.setSpeed(flyweight.getSpeed());
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String toString() {
        return "Health: " + this.getHealth() + " Damage: " + this.getDamage() +
                " Defense: " + this.getDefense() + " Speed: " + this.getSpeed();
    }
}
