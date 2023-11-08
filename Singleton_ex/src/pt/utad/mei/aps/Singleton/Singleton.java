package pt.utad.mei.aps.Singleton;

public class Singleton {

    private Singleton(){}

    private static Singleton myinternalreference = null;

    public static synchronized Singleton getInstance(){
        if(myinternalreference == null){
            myinternalreference = new Singleton();
        }
        return myinternalreference;
    }

}
