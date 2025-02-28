package Interface;

public class ShowRoom {


    /*
    PROSES PENGAKSESAN KELAS INTERFACE SAMA SEPERTI KELAS ABSTRACT YAITU KITA TIDAK BOLEH MENGAKSES KELAS PARENTNYA(KELAS INTERFACENYA) KITA HANYA BOLEH MENGAKSES KELAS IMPLEMENTNYA
     */
   public static void buyCarHonda(){
       Brand brand = new Car();
       System.out.println("SELAMAT DATANG DI SHOWROOM HONDA");
       brand.honda();


   }

   public static void buyCarToyota(){
       Brand brand = new Car();
       System.out.println("SELAMAT DATANG DI SHOWROOM TOYOTA");
       brand.toyota();
   }

   public static void buyCarBmw(){
        Brand brand = new Car();
       System.out.println("SELAMAT DATAND DI SHOWROOM BMW");
       brand.bmw();
   }




    public static void main(String[] args) {
        buyCarBmw();
        buyCarHonda();
        buyCarToyota();





    }


}
