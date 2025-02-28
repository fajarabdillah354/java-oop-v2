public class VariabelShadowing {



    /*
        ini sering terjadi jika kita membuat parameter di method yang sama seperti yang ada di field sehingga menutupi variable yang ada di atasnya,jika terjadi variable shadowing maka variabel yang ada di atasnya dibisa digunakan
     */
    String name;
    String address;

    void saySomething(String name,String address){
        name = name;
        address = address;
        // variable yang ada di field atas tertutupi oleh variable yang ada di method

    }


}
