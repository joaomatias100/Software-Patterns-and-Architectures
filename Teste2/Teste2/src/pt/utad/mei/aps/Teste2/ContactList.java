package pt.utad.mei.aps.Teste2;

import java.util.HashMap;
import java.util.Map;

public class ContactList implements ContactListInterface{
    private Map<String, Contact> contacts = new HashMap<String, Contact>();

    @Override
    public Contact getContact(String key) {
        if(contacts.containsKey(key)){
            return contacts.get(key);
        }
        else
            return null;
    }

    public boolean addContact(Contact contact){
        if(contacts.containsKey(contact.getName()))
            return false;
        else
            contacts.put(contact.getName(), contact);
        return true;
    }
}
