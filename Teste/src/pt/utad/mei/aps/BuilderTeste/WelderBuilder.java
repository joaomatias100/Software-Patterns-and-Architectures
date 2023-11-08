package pt.utad.mei.aps.BuilderTeste;

public class WelderBuilder implements RobotBuilder{
    private Robot robot;

    public WelderBuilder(){
        this.robot = new Robot();
    }
    @Override
    public void buildBase() {
        this.robot.setBase("fixo");
    }

    @Override
    public void buildBody() {
        this.robot.setBase("c/ 2 bracos");
    }

    @Override
    public void buildTop() {
        this.robot.setBase("c/ camara");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
