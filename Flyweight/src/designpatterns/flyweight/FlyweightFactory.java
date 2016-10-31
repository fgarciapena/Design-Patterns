package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static FlyweightFactory instance;
    private Map<String, Flyweight> flyweightMap;

    private FlyweightFactory() {
        flyweightMap = new HashMap<String, Flyweight>();
    }

    public static FlyweightFactory getInstance() {
        if(instance == null)
            instance = new FlyweightFactory();
        return instance;
    }

    public Flyweight getKey(String key) throws FlyweightNotFoundException {
        if(!flyweightMap.containsKey(key))
            throw new FlyweightNotFoundException("This Flyweight doesn't exist.");
        return flyweightMap.get(key);
    }

    public void setFlyweightMap(Map<String, Flyweight> flyweightMap) {
        this.flyweightMap = flyweightMap;
    }
}
