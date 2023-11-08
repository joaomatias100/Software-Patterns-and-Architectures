package pt.utad.mei.aps.BuilderTeste;

public class Worker {

    private RobotBuilder robotBuilder;

    public Worker(RobotBuilder robotBuilder){
        this.robotBuilder = robotBuilder;
    }

    public Robot getRobot(){
        return robotBuilder.getRobot();
    }

    public void buildRobot(){
        this.robotBuilder.buildBase();
        this.robotBuilder.buildBody();
        this.robotBuilder.buildTop();
    }


}
