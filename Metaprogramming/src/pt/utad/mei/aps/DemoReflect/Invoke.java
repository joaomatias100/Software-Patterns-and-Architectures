package pt.utad.mei.aps.DemoReflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Scanner;

public class Invoke {

    public static void main(String[] args)throws ClassNotFoundException{
        Person _me = new Person("Me Joao Matias", LocalDate.of(2001, 02, 25));

        try{
            Class class1 = Class.forName("pt.utad.mei.aps.DemoReflect.Person");

            Method method2 = class1.getMethod("setName", String.class);
            Scanner entry = new Scanner(System.in);
            String newName = entry.next();
            method2.invoke(_me, newName);

            Method method1 = class1.getMethod("getName");

            Object result = method1.invoke(_me);

            System.out.println("Result: " + result);
        }
        catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }



    }



}
