package Polymorphism;

public class PekerjaSekolah extends Sekolah{
    String name;
    PekerjaSekolah(String name) {
        super(name);
        this.name = name;
    }

    void sayHelo(String name){
        System.out.println("hello "+this.name+", i am worker here "+name);
    }

}
