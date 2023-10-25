package pt.utad.mei.aps.Bridge;

public class Tester extends Worker{
    @Override
    public void Does() {
        System.out.println("Testes working...");
        task.MakeTask();
    }
}
