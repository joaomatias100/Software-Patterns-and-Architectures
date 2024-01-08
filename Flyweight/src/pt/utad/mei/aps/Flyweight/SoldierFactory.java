package pt.utad.mei.aps.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class SoldierFactory {

    private Map<String, SoldierFlyweight> flyweights = new HashMap<>();

    public SoldierFlyweight getFlyweight(String key){
        return flyweights.computeIfAbsent(key, k -> {
            String[] properties = k.split(";");
            return new ConcreteSoldierFlyweight(properties[0], properties[1], properties[2]);
        });
    }
}
