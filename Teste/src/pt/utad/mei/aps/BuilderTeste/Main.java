package pt.utad.mei.aps.BuilderTeste;

/* Respostas com texto estão no ficheiro teste.txt deste projeto     */

public class Main {
    public static void main(String[] args) {
        RobotBuilder transporter = new TransporterBuilder();
        Worker bob1 = new Worker(transporter);

        bob1.buildRobot();
        Robot robot1 = bob1.getRobot();

        System.out.println("Bob built this: " + robot1);

        RobotBuilder welder = new WelderBuilder();
        Worker bob2 = new Worker(welder);

        bob2.buildRobot();
        Robot robot2 = bob2.getRobot();

        System.out.println("Bob built this: " + robot2);

        RobotBuilder loader = new LoaderBuilder();
        Worker bob3 = new Worker(loader);

        bob3.buildRobot();
        Robot robot3 = bob3.getRobot();

        System.out.println("Bob built this: " + robot3);
    }
}