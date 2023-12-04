package pt.utad.mei.aps.Facade;

public class Tv {
    public void on(){
        System.out.println("Tv on");
    }

    public void off(){
        System.out.println("Tv off");
    }

    public void setInput(String input){
        System.out.println("Tv set to input" + input);
    }

    public void changeChannel(String channel){
        System.out.println("Tv set to channel" + channel);
    }

    public void setVolume(int volume){
        System.out.println("Tv set to volume" + volume);
    }

}
