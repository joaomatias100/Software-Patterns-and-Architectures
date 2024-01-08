package pt.utad.mei.aps.Memento;

public class Diet {

    private String personName;
    private int day;
    private int weight;

    public Diet(String personName, int day, int weight) {
        this.personName = personName;
        this.day = day;
        this.weight = weight;
    }

    public String toString(){
        return "Name: " + personName + ", day: " + day + ", weight: " + weight;
    }

    public void setDay(int day){
        this.day = day;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public void diary(int day, int weight){
        setDay(day);
        setWeight(weight);
    }

    public class Memento{
        private String personName;
        private int day;
        private int weight;

        public Memento(String personName, int day, int weight) {
            this.personName = personName;
            this.day = day;
            this.weight = weight;
        }

        public String getPersonName() {
            return personName;
        }

        public int getDay() {
            return day;
        }

        public int getWeight() {
            return weight;
        }

        public String toString(){
            return "Memento{" + "Person's name: " + personName + ", day: " + day + ", weight: " + weight + "}";
        }
    }

    public Memento save(){
        return new Memento(personName, day, weight);
    }

    public void restore(Memento m){
        personName = m.getPersonName();
        day = m.getDay();
        weight = m.getWeight();
    }
}
