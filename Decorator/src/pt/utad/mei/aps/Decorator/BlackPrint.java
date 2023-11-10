package pt.utad.mei.aps.Decorator;

public class BlackPrint implements PrintingDecorator{

    private PrintableObject wrappee;

    public void PrintingDecorator(PrintableObject wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public String getName() {
        return wrappee.getName() + " Black print";
    }

    @Override
    public double getPrice() {
        return wrappee.getPrice() + 6;
    }

}
