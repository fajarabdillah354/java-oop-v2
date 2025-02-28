package ExceptionHandling;

public class ConnectionApp {

    public static void main(String[] args) {
        databaseConnection("fajar01",null);
    }


    public static void databaseConnection(String name, String port){
        if (name == null || port == null ){
            throw new ErrorConection("tidak bisa connec ke database");
        }
    }
}
