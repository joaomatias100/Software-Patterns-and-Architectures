package pt.utad.mei.aps.Template;

public class Main {
    public static void main(String[] args) {
        Supporter s1 = new BenficaSupporter();
        Supporter s2 = new PortoSupporter();

        s1.GoGame();
        s2.GoGame();
    }
}