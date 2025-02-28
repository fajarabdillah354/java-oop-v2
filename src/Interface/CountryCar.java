package Interface;

/*
kita juga bisa membuat inheritance interface, namun kontraknya bukan implement lagi tapi extends sama seperti inheritance biasa.

saat kita menambahkan method di dalam kelas inheritance interface maka method itu juga harus dioverride di class implementnya



kita juga bisa mewariskan lebih dari 1 interface
 */
public interface CountryCar{

    void asia();


    /*
    kita bisa menambahkan default method, saat menggunakan default method kita bebas untuk mengoverride ataupun tidak mengoverride method yang default
     */
    default void antartika(){
        System.out.println("benua antartika");
    }
}
