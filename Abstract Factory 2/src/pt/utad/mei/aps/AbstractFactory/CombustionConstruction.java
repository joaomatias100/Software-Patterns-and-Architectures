package pt.utad.mei.aps.AbstractFactory;

public class CombustionConstruction implements VehicleFactory{

    @Override
    public Vehicle VehicleConstruction(VehicleType type) {
        switch (type){
            case HEAVY: return new HeavyCombustion();
            case LIGHT: return new LightCombustion();
            default: return null;
        }
    }
}
