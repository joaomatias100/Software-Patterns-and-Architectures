package pt.utad.mei.aps.Memento;

public class Main {
    public static void main(String[] args) {
        Diet diet = new Diet("Joao", 1, 75);

        diet.save();
        History history = new History(diet);

        history.backup();

        diet.diary(2, 74);

        history.backup();

        history.show();

        history.undo();

        history.show();
    }
}