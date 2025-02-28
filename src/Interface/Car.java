package Interface;
/*
kita bisa menambahkan lebih dari satu implement
 */
public class Car implements Brand{
    @Override
    public void asia() {

    }

    /*
        SAAT KITA INGING MENGAKSES INTERFACE YANG TELAH DIBUAT MAKA KITA MEMERLUKAN KATA KUNCI IMPLEMENTS

        LALU KITA JUGA HARUS MENGOVERRIDE METHOD YANG ADA DI KELAS INTERFACENYA
         */
    @Override
    public void toyota() {
        System.out.println("========= AVANZA CAR =======");

    }

    @Override
    public void bmw() {
        System.out.println("========= BMW CAR ==========");
    }

    @Override
    public void honda() {
        System.out.println("======== HONDA CAR =========");
    }



}
