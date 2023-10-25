package pt.utad.mei.aps.Bridge;

public class Programmer extends Worker{
    @Override
    public void Does() {
        System.out.println("Programmer working...");
        task.MakeTask();
    }
}
