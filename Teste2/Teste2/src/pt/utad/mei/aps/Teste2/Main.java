package pt.utad.mei.aps.Teste2;

public class Main {
    public static void main(String[] args) {
        ContactList list = new ContactList();
        list.addContact(new Contact("Joao", true));
        list.addContact(new Contact("Manel", false));
        list.addContact(new Contact("Ze", true));

        ContactListInterface contacts = new ContactListProxy(list);

        System.out.println(contacts.getContact("Joao"));
        System.out.println(contacts.getContact("Manel"));
        System.out.println(contacts.getContact("Ze"));
    }
}