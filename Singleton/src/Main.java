
public class Main {
    public static void main(String args[]) {
        DatabaseRepo repository = DatabaseRepo.getInstance();

        repository.addData("1");
        repository.addData("2");

        String allData = repository.getData();
        System.out.println("Dados do repositório: \n" + allData);

    }
}