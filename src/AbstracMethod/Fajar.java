package AbstracMethod;

public class Fajar extends Manusia{
    /*
    kita harus mengoverride method yang ada di class absractnya agar tidak error. seperti contoh di bawah kita mengoverride method yang ada di class Manusia
     */
    @Override
    public void gender() {
        System.out.println("gender "+name+" adalah laki-laki");
    }

    @Override
    public int umur(int age) {
        return age;
    }



}
