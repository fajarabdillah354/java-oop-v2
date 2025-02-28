package StaticKeyword;

public class StaticMethod {

    /*
    static method memungkinkan kita untuk bisa mengakses tanpa menuliskan object classnya terlebih dahuulu
     */

    public static int count(int... value){
        int total = 0;
        for(var values : value){
            total += values;
        }
        return total;
    }


}
