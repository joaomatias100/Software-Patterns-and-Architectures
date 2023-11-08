package pt.utad.mei.aps.BuilderTeste;

public class TransporterBuilder implements RobotBuilder{
    private Robot robot;

    public TransporterBuilder(){
        this.robot = new Robot();
    }
    @Override
    public void buildBase() {
        this.robot.setTop("c/ rodados");
    }

    @Override
    public void buildBody() {
        this.robot.setBody("c/ caixa");
    }

    @Override
    public void buildTop() {
        this.robot.setTop("c/ camara");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }
}
