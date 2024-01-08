package pt.utad.mei.aps.Template;

public abstract class Supporter {

    public final void GoGame(){
        BuyTicket();
        Hook1();
        GoStadium();
        WatchGame();
        GoBackHome();
        Hook2();
    }

    private void BuyTicket(){
        System.out.println("Buying ticket...");
    }

    public abstract void GoStadium();
    public abstract void WatchGame();
    private void GoBackHome(){
        System.out.println("Going back home...");
    }

    public void Hook1(){}
    public void Hook2(){}
}
