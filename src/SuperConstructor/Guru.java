package SuperConstructor;

public class Guru extends Sekolah{

    /*
    SAAT KITA INGIN MENGGUNAKAN SUPER CONSTRUCTOR MAKA KITA PERLU MENG OVERRIDE METHOD YANG ADA DI CLASS PARENTNYA
     */

    public Guru(String name) {
        super(name);
    }

    public static void main(String[] args) {
//        Guru guru = new Guru("SMA SULTHON AULIA BOARDING SCHOOL");
        Guru guru = new Guru("SMA BUDIUTOMO PERAK");
        guru.name = "irfan hakim";
        System.out.println("nama : "+guru.name);


    }
}
