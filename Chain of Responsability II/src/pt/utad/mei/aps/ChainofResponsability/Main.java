package pt.utad.mei.aps.ChainofResponsability;

public class Main {
    public static void main(String[] args) {
        Dispenser d1 = new Dispenser(0.01);
        Dispenser d2 = new Dispenser(0.02);
        Dispenser d3 = new Dispenser(0.05);
        Dispenser d4 = new Dispenser(0.10);
        Dispenser d5 = new Dispenser(0.20);
        Dispenser d6 = new Dispenser(0.50);
        Dispenser d7 = new Dispenser(1.00);
        Dispenser d8 = new Dispenser(2.00);

        d8.setNext(d7);
        d7.setNext(d6);
        d6.setNext(d5);
        d5.setNext(d4);
        d4.setNext(d3);
        d3.setNext(d2);
        d2.setNext(d1);

        d8.change(7.98);
    }
}