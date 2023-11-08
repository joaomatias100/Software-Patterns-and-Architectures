package pt.utad.mei.aps.AbstractFactory;

public class VehicleProduction {

    public VehicleFactory factory1;

    public VehicleProduction(VehicleFactory factory1){
        this.factory1 = factory1;
    }

    public Vehicle ConstructVehicle(VehicleType type){
        return factory1.ConstructVehicle(type);
    }
}
