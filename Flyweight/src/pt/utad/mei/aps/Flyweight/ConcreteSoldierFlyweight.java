package pt.utad.mei.aps.Flyweight;

public class ConcreteSoldierFlyweight implements SoldierFlyweight{
    private String soldierType;
    private String weapon;
    private String uniformColor;

    public ConcreteSoldierFlyweight(String soldierType, String weapon, String uniformColor) {
        this.soldierType = soldierType;
        this.weapon = weapon;
        this.uniformColor = uniformColor;
    }

    @Override
    public void displayInfo(String extrinsicState) {
        System.out.println("Soldier: " + soldierType + "\nWeapon: " + weapon
        + "\nUniform color: " + uniformColor + "\nExtrinsic state: " + extrinsicState);
    }
}
