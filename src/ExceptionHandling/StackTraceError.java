package ExceptionHandling;

public class StackTraceError {

    /*
    stacktrace error digunakan untuk menelusuri error yang ada . saat ditelusuri kita dapat tahu dimana letak posisi errornya yang ada di dalam package



    saat menggunakan StackTraceError kita dapat menelusuri letak error kita yang ada di package
     */


    public static void main(String[] args) {

//        try {
//            String[] names = {"fajar", "sandi", "ryan"};
//            System.out.println(names[100]);
//
//        }catch (Throwable throwable){
//            throwable.printStackTrace();
//        }

        /*
        contoh error bertingkat dengan stacktrace
         */

        try{
            iniError();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void iniError(){
        try{
            String[] names = {"Aushof", "Bagas" , "Irji"};
            System.out.println(names[50]);
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }
    }

}
