package EnumClass;

public class EnumApp {


    public static void main(String[] args) {
        CostumerApp costumerApp = new CostumerApp();
        costumerApp.setName("fajar abdillah ahmad");
        costumerApp.setLevel(Level.VIP);// kita harus akses class enumnya

        System.out.println(costumerApp.getName());
        System.out.println(costumerApp.getLevel());

        /*
        berikut dibawah ini adalah konversi yang ada di class enum
         */

        // 1.  mengkonversi ke bentuk String dengan menggunakan method name()
        String konversString =  Level.PREMIUM.name();
        System.out.println(konversString);


        // 2. mengkonversi dari String menjadi enum, pada isi parameter yang harus yang ada di class enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        // 3. MENAMPILKAN SEMUA ISI YANG ADA DICLASS ENUM, untuk hal ini kita perlu menggunakan perulangan dengan for each

        for (var value : Level.values()){
            System.out.println(value);
        }





    }
}
