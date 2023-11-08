package pt.utad.mei.aps.Builder;

public class HutBuilder implements HomeBuilder{

    private Home home;

    public HutBuilder(){
        this.home = new Home();
    }
    @Override
    public void buildFundations() {
        this.home.setFoundations("Stones and cement");
    }

    @Override
    public void buildStructure() {
        this.home.setStructure("Wood");
    }

    @Override
    public void buildCeiling() {
        this.home.setCeiling("Wood and animal skin");
    }

    @Override
    public void buildInterior() {
        this.home.setInterior("Wood and erbs");
    }

    @Override
    public Home getHome() {
        return home;
    }
}
