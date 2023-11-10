package pt.utad.mei.aps.Decorator;

public class Main {
    public static void main(String[] args) {
        PrintableObject mug = new Mug();
        RGBPrint printedMug = new RGBPrint();
        printedMug.PrintingDecorator(mug);

        System.out.println("Printed object: ");
        System.out.println(printedMug.getName() + ": " + printedMug.getPrice());
    }
}