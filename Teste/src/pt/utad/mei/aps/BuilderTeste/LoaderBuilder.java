package pt.utad.mei.aps.BuilderTeste;

public class LoaderBuilder implements RobotBuilder{
    private Robot robot;

    public LoaderBuilder(){
        this.robot = new Robot();
    }
    @Override
    public void buildBase() {
        this.robot.setBase("c/ lagartas");
    }

    @Override
    public void buildBody() {
        this.robot.setBody("c/ 1 braco");
    }

    @Override
    public void buildTop() {
        this.robot.setTop("s/ camara");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
