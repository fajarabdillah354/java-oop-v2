package Encapsulation;

public class KtpApp {


    public static void main(String[] args) {
        var ktp = new Ktp();
        ktp.setID("FAJAR ABDILLAH AHMAD");
        ktp.setPass("FAHMI FADILAH 25");
        ktp.setVerify(true);

        System.out.println(ktp.getID());
        System.out.println(ktp.getPass());
        System.out.println(ktp.isVerify());

    }
}
