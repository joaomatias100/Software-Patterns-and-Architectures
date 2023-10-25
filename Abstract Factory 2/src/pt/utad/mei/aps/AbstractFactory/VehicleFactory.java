package pt.utad.mei.aps.AbstractFactory;

public interface VehicleFactory {
    Vehicle VehicleConstruction(VehicleType type);
}
