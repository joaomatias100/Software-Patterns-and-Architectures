package pt.utad.mei.aps.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleProduction mercedes = new VehicleProduction(new ElectricConstruction());
        VehicleProduction bmw = new VehicleProduction(new CombustionConstruction());
        VehicleProduction mazda = new VehicleProduction(new ElectricConstruction());

        Vehicle v1 = mercedes.ConstructVehicle(VehicleType.LIGHT);
        Vehicle v2 = bmw.ConstructVehicle(VehicleType.HEAVY);
        Vehicle v3 = mazda.ConstructVehicle(VehicleType.HEAVY);

        v1.Show();
        v2.Show();
        v3.Show();
    }
}