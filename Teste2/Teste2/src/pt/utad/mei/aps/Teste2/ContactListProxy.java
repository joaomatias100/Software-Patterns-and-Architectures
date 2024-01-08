package pt.utad.mei.aps.Teste2;

import java.util.HashMap;
import java.util.Map;

public class ContactListProxy implements ContactListInterface{
    private final Map<String, Contact> cache = new HashMap<String, Contact>();
    private ContactList realService;

    public ContactListProxy(ContactList realService){
        this.realService = realService;
    }
    @Override
    public Contact getContact(String key) {
        if(cache.containsKey(key)){
            System.out.println("Content in cache: " + key);
            return cache.get(key);
        }
        else{
            Contact aux = realService.getContact(key);
            if(aux != null & aux.isPremium() == true){
                if(cache.size() <= 15){
                    int index = cache.size() - 1;
                    System.out.println("CacheRemove: " + aux.getName());
                    cache.remove(cache.keySet().toArray()[index]);
                }
                cache.put(aux.getName(), aux);
                System.out.println("Contact authorized");
            }
            return aux;
        }
    }
}
