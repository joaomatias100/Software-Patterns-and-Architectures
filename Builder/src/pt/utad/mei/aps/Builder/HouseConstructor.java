package pt.utad.mei.aps.Builder;

public interface HouseConstructor {
    public void buildFundations();
    public void buildInterior();
    public void buildStructure();
    public void buildCoverage();

    public House getHouse();
}
