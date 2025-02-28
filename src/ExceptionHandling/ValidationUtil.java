package ExceptionHandling;

public class ValidationUtil {


        // SEMUA JENIS ERROR ADALAH TURUNAN DARI THROWABLE
    public static void validate(LoginRequest login) throws Exception{
        if (login.getUsername()== null){
            throw new NullPointerException("Username is NULL");// INI PROSES PELEMPARAN ERROR JIKA TERJADI
        } else if (login.getUsername() == "") {
            throw new Exception("Username is blank");
        } else if (login.getPassword() == null) {
            throw new NullPointerException("Password is NULL");
        } else if (login.getPassword() == "") {
            throw new Exception("Password is blank");
        }

    }


    /*
    dibawah ini adalah contoh untuk RuntimeException
     */


    public static void validateRuntime(LoginRequest login) {// jika menggunakan runtimeexception kita tidak perlu throws
        if (login.getUsername()== null){
            throw new NullPointerException("Username is NULL");// INI PROSES PELEMPARAN ERROR JIKA TERJADI
        } else if (login.getUsername() == "") {
            throw new BlankException("Username is blank");
        } else if (login.getPassword() == null) {
            throw new NullPointerException("Password is NULL");
        } else if (login.getPassword() == "") {
            throw new BlankException("Password is blank");
        }

    }



}
