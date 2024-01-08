package pt.utad.mei.aps.ChainofResponsability;

public class Dispenser implements BoxDispenser{

    public double value;
    private BoxDispenser next;

    public Dispenser(double value) {
        this.value = value;
    }

    @Override
    public void setNext(BoxDispenser next) {
        this.next = next;
    }

    @Override
    public void change(double ammount) {

        if (ammount >= value) {

            int howMany = (int) (ammount / value);
            double rest = ammount - howMany * value;

            System.out.println(howMany + " of " + value);

            if (rest > 0 && next != null) {
                next.change(rest);
            }
        } else {
            if (ammount > 0 && next != null)
                next.change(ammount);
        }

    }

}
