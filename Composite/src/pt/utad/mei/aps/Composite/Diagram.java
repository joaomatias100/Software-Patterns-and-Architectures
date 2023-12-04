package pt.utad.mei.aps.Composite;

import java.util.ArrayList;

public class Diagram implements DiagramObject{

    private ArrayList<DiagramObject> objects;

    public Diagram() {
        this.objects = new ArrayList<>();
    }

    public void add(DiagramObject object){
        objects.add(object);
    }

    public void remove(Diagram object){
        objects.remove(object);
    }

    public ArrayList<DiagramObject> getObjects(){
        return objects;
    }

    @Override
    public void draw(String color) {
        for (DiagramObject object : objects){
            object.draw(color);
        }
    }
}
