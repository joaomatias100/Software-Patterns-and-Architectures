package pt.utad.mei.aps.Proxy;

public class Contact {
    private String email;
    private String phone;
    private String name;

    public Contact(String email, String phone, String name) {
        this.email = email;
        this.phone = phone;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }
}
