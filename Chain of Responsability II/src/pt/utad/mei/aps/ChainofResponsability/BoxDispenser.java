package pt.utad.mei.aps.ChainofResponsability;

import javax.swing.*;

public interface BoxDispenser {

    void setNext(BoxDispenser next);

    void change(double ammount);

}
