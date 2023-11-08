import pt.utad.mei.aps.Builder.Home;
import pt.utad.mei.aps.Builder.HomeBuilder;
import pt.utad.mei.aps.Builder.HutBuilder;
import pt.utad.mei.aps.Builder.Worker;

public class Main {
    public static void main(String[] args) {
        HomeBuilder home = new HutBuilder();
        Worker bob = new Worker(home);

        bob.buildHome();
        Home h1 = bob.getHome();

        System.out.println("Bob built this: " + h1);
    }
}