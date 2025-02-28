public class Method {
    String name;
    int umur;
    final String country = "indonesia";


    /*
    kita juga dapat menambahkan pembuatan constructor supaya saat orang mengakses akan di jalankan terlebih dahulu
    constructor adalah sebuah program yang pertama kali di jalankan untuk pembuatannya sama seperti pembuatan method hanya saja menggunakan nama classnya,kita juga bisa membuat constructor overloading dengan syarat parameternya tidak boleh sama dan saat memanggil kita bisa pilih mengggunakan constructor yang mana
     */

    Method(String iniName, int iniUmur ){
        name = iniName;
        umur = iniUmur;
    }

    //contoh constructor overloading
    Method(String names){
        this(null,21);//kata kunci this digunakan untuk mengakses constructor lain
    }


    Method(){

    }



    void sayHello(String paramName){
        /*
        kita dapat membuat method didalam 1class lalu kita juga dapat memanggilnya pada class yang sama atau pada class yang berbeda
         */
        System.out.println("hello "+paramName+" my name is "+name+" umur saya "+umur);


    }



}
