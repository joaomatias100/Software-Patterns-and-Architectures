package pt.utad.mei.aps.DemoReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Constructors {
    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = Class.forName("pt.utad.mei.aps.DemoReflect.Person");

        Constructor[] constructors = class1.getDeclaredConstructors();

        for(Constructor constructor: constructors){
            System.out.println(constructor);
        }
    }
}
