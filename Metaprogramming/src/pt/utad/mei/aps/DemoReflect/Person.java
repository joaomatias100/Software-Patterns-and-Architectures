package pt.utad.mei.aps.DemoReflect;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private final LocalDate birthDate;

    public Person(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate(){
        return birthDate;
    }

    public int getAge(){
        int age;
        Period line = Period.between(birthDate, LocalDate.now());
        age = line.getYears();
        return age;
    }
}
