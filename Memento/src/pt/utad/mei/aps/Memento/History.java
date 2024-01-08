package pt.utad.mei.aps.Memento;

import java.util.Stack;

public class History {
    private Diet originator;
    private Stack<Diet.Memento> history = null;

    public History(Diet originator){
        this.originator = originator;
        history = new Stack<Diet.Memento>();
    }

    public void backup(){
        history.push(originator.save());
    }

    public void undo(){
        if(history.size() > 1){
            history.pop();
        }
        originator.restore(history.peek());
    }

    public void show(){
        System.out.println("History: ");
        for(Diet.Memento m : history)
            System.out.println("\t" + m);
    }

}
