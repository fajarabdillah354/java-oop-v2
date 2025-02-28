package inheritance;

public class Dosen extends Kampus{

    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.name = "andi bytong";
        System.out.println("Nama Dosen : "+dosen.name);
        dosen.dosen();

    }
}
