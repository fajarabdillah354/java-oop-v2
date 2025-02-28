package SuperConstructor;

public class Sekolah {
    String name;

    public Sekolah(String name) {
        this.name = name;
        if (name.equals("SMA BUDIUTOMO PERAK")){
            System.out.println("terimakasih telah registrasi");
        }else {
            System.out.println("data invalid");
        }
    }
}
