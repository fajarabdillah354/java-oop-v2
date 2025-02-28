package JavaRecordClass;

/*
parameter yang ada di dalam class record dibawah ini sudah sekaligus menjadi field .Class record digunakan untuk menyimpan data, behavior dari classs ini adalah immutable yaitu jika kita sudah memasukan data tidak bisa di ubah kembali
 */
public record LoginRequest(String Username, String Password) {


    /*
         constructor utama yang ada diclass record akan pertama kali dijalankan saat class record dipanggil
     */
    public LoginRequest {
        System.out.println("anda telah mengakses class record pada java");


    }

    /*
    kita juga bisa membuaat constructor overloading di class record namun kita harus tetep memanggil field recordnya
     */

    public LoginRequest(String username){
        this(username, null);// disini adalah pemanggilan parameter class recordnya
    }

    public LoginRequest(){// kita boleh tidak memberikan parameter pada constructornya
        this("","");
    }
}
