public class DatabaseRepo {
    private static DatabaseRepo instance = null;

    private String database = "Database log: \n";

    private DatabaseRepo(){
    }

    public static DatabaseRepo getInstance(){
        if(instance == null){
            instance = new DatabaseRepo();
        }
        return instance;
    }

    public void addData(String data){
        database += data;
    }

    public String getData(){
        return database;
    }

    public void clearData(){
        database = "";
    }
}
