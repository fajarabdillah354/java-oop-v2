package AbstracClass;

public class AbstracApp {

    /*
    untuk mengakses abract class kita tidak bisa langsung mengaksesnya, kita hanya bisa mengakses claass turunannya
     */
/*
    Location location = new Location(); // ERROR


 */
    public static void main(String[] args) {
        var city = new City();
        city.name = "jakarta";
        System.out.println(city.name);
    }

}
