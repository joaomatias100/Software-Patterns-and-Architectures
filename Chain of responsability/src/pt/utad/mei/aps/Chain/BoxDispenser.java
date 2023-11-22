package pt.utad.mei.aps.Chain;

public interface BoxDispenser {

    void setNext(BoxDispenser next);
    void change(double fee);

}
