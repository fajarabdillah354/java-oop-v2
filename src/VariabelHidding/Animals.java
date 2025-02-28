package VariabelHidding;

class Animals {

    String name;


    void sounds(){
        System.out.println("ini adalah suara yang ada di class parent "+name);
    }



}



class Cat extends Animals{

    /*
    pada program java sangat tidak disarankan membuat nama variable yana sama, karna bisa menyebabkan variabel Hidding. saat terjadi Variabel Hidding kita bisa menggunakan kata kunci super untuk mengakses variabel yang ada di class parent (ini jika kemungkinan nama variabelnya sama)
     */

    void sounds(){
        System.out.println("ini adalah suara yang ada di class child "+super.name );
    }


}
