package pt.utad.mei.aps.DemoReflect;

import java.lang.reflect.Method;

public class MethodsParameters {
    public static void main(String[] args) throws ClassNotFoundException {
        Class class1 = Class.forName("pt.utad.mei.aps.DemoReflect.Person");

        Method[] methods = class1.getMethods();
        //Method[] methods = class1.getDeclaredMethods();
        //Field[] attributes = class1.getFields();

        for(Method method: methods){
            System.out.println(method);
            Class[] parameters = method.getParameterTypes();

            for(Class parameter: parameters){
                System.out.println("\tMethod Parameter: " + parameter);
            }

            Class[] exceptions = method.getExceptionTypes();

            for(Class exception: exceptions){
                System.out.println("\tMethod exceptions: " + exception);
            }

        }
    }
}
