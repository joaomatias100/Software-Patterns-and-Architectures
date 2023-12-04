package pt.utad.mei.aps.Facade;

public class Main {
    public static void main(String[] args) {

        var tv = new Tv();
        var amplifier = new Amplifier();
        var dvdPlayer = new DvdPlayer();

        var remote = new Remote(amplifier, dvdPlayer, tv);

        remote.watchMovie("American Pie");
        System.out.println("\n");
        remote.watchChannel("Fox");
        System.out.println("\n");

    }
}