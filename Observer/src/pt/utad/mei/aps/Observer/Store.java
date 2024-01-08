package pt.utad.mei.aps.Observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {

    private Map<String, List<Observer>> subscribers = new HashMap<>();
    private Map<String, Integer> stock = new HashMap<>();

    public Store(){
        stock.put("iPhone 15", 20);
        stock.put("iPhone 15 Pro", 10);
        stock.put("iPhone 15 Pro Max", 10);
    }

    public void subscribe(String name, Observer observer){
        if(!subscribers.containsKey(name)) {
            subscribers.put(name, new ArrayList<Observer>());
        }
        subscribers.get(name).add(observer);
    }

    public void unsubscribe(String name, Observer observer){
        if(subscribers.containsKey(name) &&
                subscribers.get(name).contains(observer)){
            subscribers.get(name).remove(observer);
        }
    }

    public void notifySubscribers(String name){
        if(subscribers.containsKey(name)){
            for(Observer observer : subscribers.get(name)){
                observer.update(name);
            }
        }
    }

    public void addStock(String name, int quantity){
        if(!stock.containsKey(name))
            stock.put(name, quantity);
        else
            stock.put(name, quantity + stock.get(name));

        notifySubscribers(name);
    }

    public void removeStock(String name, int quantity){
        if(stock.containsKey(name))
            stock.put(name, stock.get(name) - quantity);
    }
}
