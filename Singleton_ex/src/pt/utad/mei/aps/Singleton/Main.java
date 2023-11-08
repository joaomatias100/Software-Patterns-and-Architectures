package pt.utad.mei.aps.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println("S1: " + s1.hashCode());
        System.out.println("S2: " + s2.hashCode());
        System.out.println("S3: " + s3.hashCode());
    }
}