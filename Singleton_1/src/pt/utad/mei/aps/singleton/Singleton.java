package pt.utad.mei.aps.singleton;

public class Singleton {
    private Singleton(){}

    private static Singleton myInternalReference = null;

    public static synchronized Singleton getInstance(){
        if(myInternalReference == null){
            myInternalReference = new Singleton();
        }
        return myInternalReference;
    }

}
