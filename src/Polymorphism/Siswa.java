package Polymorphism;

public class Siswa extends PekerjaSekolah{
    String name;
    Siswa(String name) {
        super(name);
        this.name = name;
    }

    void schoolName(String name){
        System.out.println("hello "+this.name+", my name is "+name);
    }

}
