package Encapsulation;

public class Ktp {


    /*
    saat membuat encapsultiton kita harus menset semua field yang ada menjadi akses modifiernya PRIVATE agar orang lain tidak bisa lansung mengakses fieldnya
     */

    private String ID;
    private String Pass;

    private boolean verify;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        if (ID != null){
            this.ID = ID;
        }

    }

    public String getPass() {
        return Pass;
    }

    public void setPass(String pass) {
        Pass = pass;
    }

    public boolean isVerify() {
        return verify;
    }

    public void setVerify(boolean verify) {
        if (!verify){

        }else {
            this.verify = true;
            System.out.println("ANDA TELAH TERVERIFIKASI");
        }
        this.verify = verify;
    }
}
