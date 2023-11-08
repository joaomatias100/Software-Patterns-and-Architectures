package pt.utad.mei.aps.Builder;

public class Worker {
    private HomeBuilder homeBuilder;

    public Worker(HomeBuilder homeBuilder){
        this.homeBuilder = homeBuilder;
    }

    public Home getHome(){
        return homeBuilder.getHome();
    }

    public void buildHome(){
        this.homeBuilder.buildFundations();
        this.homeBuilder.buildStructure();
        this.homeBuilder.buildCeiling();
        this.homeBuilder.buildInterior();
    }
}
