package pt.utad.mei.aps.Flyweight;

public class Soldier {
    private String name;
    private SoldierFlyweight flyweight;

    public Soldier(String name, SoldierFlyweight flyweight) {
        this.name = name;
        this.flyweight = flyweight;
    }

    public void displayInfo(String extrinsicState){
        flyweight.displayInfo(extrinsicState);
    }
}

