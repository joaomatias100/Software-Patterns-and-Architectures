package pt.utad.mei.aps.Chain;

import javax.swing.*;

public class Dispenser implements BoxDispenser {

    private double price;
    private BoxDispenser next;

    public Dispenser(double price){
        this.price = price;
    }
    @Override
    public void setNext(BoxDispenser next) {
        this.next = next;
    }

    @Override
    public void change(double fee) {
        if(fee >= price){
            int howMany = (int)(fee / price);
            double rest = fee - howMany * price;

            System.out.println(howMany + "of " + price);

            if(rest > 0 && next != null)
                next.change(rest);
            else{
                if(fee > 0 && next != null){
                    next.change(fee);
                }
            }
        }
    }
}
