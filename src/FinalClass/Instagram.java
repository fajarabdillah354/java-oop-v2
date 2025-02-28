package FinalClass;

public class Instagram {
    final String country = "ID-INDONESIA";//field ini sudah tidak bisa diubah karena memakai kata kunci final

    final void login(){
        //saat melakukan final method maka kita tidak bisa mengovrride method di class lain
    }
}

final class facebook extends Instagram{

}


/*
program dibawah ini akan error karna kata kunci final tidah bisa diturunkan atau diwariskan. jika tetep dijalankan akan mengakibatkan error
 */

//class FakeInstagram extends facebook{
//
//}
