package pt.utad.mei.aps.Observer;

public class Main {
    public static void main(String[] args) {
        Store store = new Store();

        Client c1 = new Client();
        Client c2 = new Client();
        Client c3 = new Client();

        store.subscribe("iPhone 15", c2);
        store.subscribe("iPhone 15 Pro Max", c1);
        store.subscribe("iPhone 15 Pro", c3);
        store.subscribe("iPhone 15", c3);

        store.addStock("iPhone 15", 10);
        store.addStock("iPhone 15 Pro Max", 15);
        store.addStock("iPhone 15 Pro", 10);
        store.removeStock("iPhone 15", 8);
    }
}