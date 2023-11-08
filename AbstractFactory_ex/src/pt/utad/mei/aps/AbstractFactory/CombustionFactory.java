package pt.utad.mei.aps.AbstractFactory;

public class CombustionFactory implements VehicleFactory{
    @Override
    public Vehicle ConstructVehicle(VehicleType type) {
        switch(type){
            case HEAVY: return new HeavyCombustion();
            case LIGHT: return new LightCombustion();
            default: return null;
        }
    }
}
