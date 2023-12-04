package pt.utad.mei.aps.Bridge;

public class Main {
    public static void main(String[] args) {
        Tasks task1 = new ProgramCSharp();
        Worker worker1 = new Programmer();
        worker1.ReceiveTask(task1);
        worker1.Does();

        Tasks task2 = new ProgramJava();
        Worker worker2 = new Programmer();
        worker2.ReceiveTask(task2);
        worker2.Does();
    }
}