package pt.utad.mei.aps.Facade;

public class Remote {
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final Tv tv;

    public Remote(Amplifier amplifier, DvdPlayer dvdPlayer, Tv tv) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.tv = tv;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie");
        tv.on();
        tv.setInput(dvdPlayer.toString());
        dvdPlayer.on();
        dvdPlayer.load(movie);
        dvdPlayer.play();
        dvdPlayer.pause();
        tv.setVolume(25);
        dvdPlayer.unpause();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        tv.off();
    }

    public void watchChannel(String channel) {
        System.out.println("Get ready to watch a channel...");
        amplifier.on();
        amplifier.setInput(tv.toString());
        tv.on();
        tv.setVolume(20);
        tv.changeChannel(channel);
        tv.off();
        amplifier.off();
    }
}
