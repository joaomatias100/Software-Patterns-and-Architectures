package pt.utad.mei.aps.Proxy;

import java.util.HashMap;
import java.util.Map;

public class ContactListProxy implements ServiceInterface{
    private Map<String, Contact> cache = new HashMap<String, Contact>();
    private ContactList realservice;

    public ContactListProxy(ContactList s){
        this.realservice = s;
    }
    @Override
    public Contact GetContact(String key) {
        if(cache.containsKey(key))
        {
            System.out.print(" cache" + key);
            return cache.get(key);
        }
        else
        {
            Contact aux= realservice.getContact(key);
            if(aux != null){
                if(cache.size() == 5){
                    //remover o mais antigo
                    int index = cache.keySet().toArray().length -1;
                    System.out.println("CacheRemove: " + cache.keySet().toArray()[index]);
                    cache.remove(cache.keySet().toArray()[index]);
                }
                //guarda em cache
                cache.put(aux.getName(), aux);
            }
            return aux;
        }
    }
}
