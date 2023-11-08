package pt.utad.mei.aps.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        VehicleProduction mercedes = new VehicleProduction(new ElectricFactory());
        Vehicle v1 = mercedes.ConstructVehicle(VehicleType.HEAVY);

        VehicleProduction bmw = new VehicleProduction(new CombustionFactory());
        Vehicle v2 = bmw.ConstructVehicle(VehicleType.LIGHT);

        v1.Show();
        v2.Show();
    }
}