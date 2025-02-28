package Polymorphism;

public class PolyApp {
    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("ipul");
        sekolah.schoolName("SMA TUNAS BANGSA");


        /*
        saat membuat polymorphism kita dapat merupah object yang ada pada variable parent
        contoh di atas kita dapat merupah dari object SEKOLAH() menjadi object turunannya

        nb : saat melakukan polymorphism kita hanya bisa mengakses function yang ada di class parent. dan saat melakukan inheritance nama method yang di buat di class turunannya harus sama seperti di class parent
         */
//        sekolah = new PekerjaSekolah("ujeh");
//        sekolah.schoolName("rasyid");
//
//        sekolah = new Siswa("fajar");
//        sekolah.schoolName("sandi");


        //di bawah ini cara kedua
        Sekolah getPekerja = new PekerjaSekolah("ujeh");
        getPekerja.schoolName("udin");

        Sekolah getSiswa = new Siswa("fajar");
        getSiswa.schoolName("sandi");


        // dibawah ini addalah contoh polynmorphism pada method, dengan cara memberikan parameter pada method dengan parameter class parentnya
        testMethod(new Sekolah("ujeh"));
        testMethod(new PekerjaSekolah("fajar"));
        testMethod(new Siswa("nisa"));


    }

    public static void testMethod(Sekolah sekolah){

        /*
        dibawah ini adalah pengecekan tipe data dengan instanceof, lalu kita juga bisa mengkonfersinya sesuai dengan yang kita butuhkan
         */
        if (sekolah instanceof PekerjaSekolah pekerjaSekolah){
            System.out.println("hello worker school "+pekerjaSekolah.name);
        } else if (sekolah instanceof Siswa siswa){
            System.out.println("hello Siswa dengan nama "+ siswa.name);
        }else {
            System.out.println("hello "+ sekolah.name);
        }
    }


}
