package pt.utad.mei.aps.DemoReflect;

import java.lang.reflect.Field;

public class Characteristics {

    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = Class.forName("pt.utad.mei.aps.DemoReflect.Person");

        Field[] attributes = class1.getDeclaredFields();
        //Field[] attributes = class1.getFields();

        for(Field attribute: attributes){
            System.out.println(attribute);
        }
    }
}
