package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	    FlyweightFactory flyweightfactory = FlyweightFactory.getInstance();
        Map<String, Flyweight> flyweightMap = new HashMap<String, Flyweight>();
        flyweightMap.put("Soldier", new SoldierFlyweight());
        flyweightMap.put("Tank", new TankFlyweight());
        flyweightfactory.setFlyweightMap(flyweightMap);
        try {
            Soldier soldier = new Soldier(flyweightfactory.getKey("Soldier"));
            Tank tank = new Tank(flyweightfactory.getKey("Tank"));
            System.out.println(soldier.toString());
            System.out.println(tank.toString());
        }catch(FlyweightNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}
