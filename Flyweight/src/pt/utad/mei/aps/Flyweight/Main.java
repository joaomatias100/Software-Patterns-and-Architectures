package pt.utad.mei.aps.Flyweight;

public class Main {
    public static void main(String[] args) {
        SoldierFactory soldierFactory = new SoldierFactory();

        Soldier soldier1 = new Soldier("Zé", soldierFactory.getFlyweight("Air_force;Plane_Machine_Gun;Blue"));
        Soldier soldier2 = new Soldier("Manel", soldierFactory.getFlyweight("Navy;Boat_Machine_Gun;Blue"));

        soldier1.displayInfo("Going to the skies...");
        soldier2.displayInfo("Going to the seas...");
    }
}