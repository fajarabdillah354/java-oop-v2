package StaticKeyword;

import AbstracClass.Location;

public class StaticApp {
    /*
    static keyword hanya bisa diakses di static lagi, kita tidak bisa mengaksesnya diluar static
     */

    public static void main(String[] args) {


        /*
        1. mengaksesan field static kita tidak perlu menuliskan object Classnya terlebih dahulu
         */

        System.out.println(StaticField.NAME);
        System.out.println(StaticField.AGE);

        /*
        2. pengaksesan static method yaitu bisa langsung akses ke nama methodnya dengan tanpa menuliskan object classnya
         */
        // di bawah ini akan menghitung jumlah parameter yang di masukkan
        System.out.println(StaticMethod.count(1,1,1,1,1,1,1,1,1,1,1,1));



        /*
        3. mengakses Inner Static, disini kita harus menuliskan nama object
         */

        StaticInner.Location staticInner = new StaticInner.Location();
        staticInner.setNameLocation("Kuningan");
        System.out.println(staticInner.getNameLocation());


        /*
        4. mengakses Static block
         */
        // akan menampilkan jumlah core yang ada dilaptop
        System.out.println(StaticBlock.PROCESSORS);

    }


}
