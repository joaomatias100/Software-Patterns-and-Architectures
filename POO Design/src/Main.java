public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Bobi", 3);
        Cat cat = new Cat("Auri", 4);

        Person person1 = new Person("Matias", dog);
        Person person2 = new Person("Bea", cat);

        person1.interaction();
        person2.interaction();
        dog.makeSound();
        cat.makeSound();
    }
}