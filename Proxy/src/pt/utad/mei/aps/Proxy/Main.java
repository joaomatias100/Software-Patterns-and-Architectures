package pt.utad.mei.aps.Proxy;

public class Main {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        list.addContact(new Contact("mant@slb.pt", "123456", "Mantorras"));
        list.addContact(new Contact("cardozo@slb.pt", "123456", "Cardozo"));
        list.addContact(new Contact("jonas@slb.pt", "123456", "Jonas"));

        ServiceInterface contacts = new ContactListProxy(list);
        System.out.println(contacts.getContact("Mantorras"));
        System.out.println(contacts.getContact("Cardozo"));
        System.out.println(contacts.getContact("Jonas"));
    }
}