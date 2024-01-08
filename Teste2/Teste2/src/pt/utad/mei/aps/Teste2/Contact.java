package pt.utad.mei.aps.Teste2;

public class Contact {

    private String name;
    private boolean isPremium;

    public Contact(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public String toString(){
        return "name: " + name + "\nis premium: " + isPremium;
    }
}
