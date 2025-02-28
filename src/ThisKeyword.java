public class ThisKeyword {

    /*
    kata kunci this digunakan untuk mengakses object saat ini, ini juga sekaligus solusi dari variabel shadowing
     */


    String name;
    String addres;

    ThisKeyword(String name, String addres){
        this.name = name;//this digunakan untuk mengakses object saat ini
        this.addres = addres;

    }

    void sayHello(String name){
        System.out.println("hello "+name+" my name is "+ this.name+" dari "+this.addres);
    }

    public static void main(String[] args) {
        ThisKeyword thisKeyword = new ThisKeyword("aji","bandung");
        thisKeyword.sayHello("ujeh");

    }
}
