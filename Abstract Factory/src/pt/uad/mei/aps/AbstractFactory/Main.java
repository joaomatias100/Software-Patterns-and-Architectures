package pt.uad.mei.aps.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleProduction mercedes = new VehicleProduction(new ElectricVehicleConstruction());
        Vehicle v1 = mercedes.ConstructVehicle(VehicleType.LIGHT);

        VehicleProduction bmw = new VehicleProduction(new CombustionVehicleConstruction());
        Vehicle v2 = bmw.ConstructVehicle(VehicleType.HEAVY);

        v1.Show();
        v2.Show();
    }
}