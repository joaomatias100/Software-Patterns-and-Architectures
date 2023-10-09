class Person {
    private String name;
    private Animal pet;

    public Person(String name, Animal pet){
        this.name = name;
        this.pet = pet;
    }

    public void interaction(){
        System.out.println(name + " interacts with " + pet.getName());
    }
}
