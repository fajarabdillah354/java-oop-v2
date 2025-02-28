package ExceptionHandling;

public class LoginApp {

    public static void main(String[] args) {
        LoginRequest login =  new LoginRequest(null,null);

        try{
            ValidationUtil.validate(login);
            System.out.println("DATA VALID");
        }catch (Exception e){//KITA BISA MEMBUAT CLASS KHUSUS VALIDATION EXCEPTION ATAU DENGAN CARA LANGSUNG SEPERTI INI
            System.out.println("error : "+e.getMessage());// PADA BAGIAN getMessage() adalah class bawaan dari thowable
        }



        /*
        error runtimeException tidak mengharuskan kita melakukan tyr catch, kita bebas memilih hanya saja block kode yang ada dibawahnya tidak akan terbaca karena sudah error terlebih dahulu
         */

        LoginRequest loginRequest = new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest);

    }
}
