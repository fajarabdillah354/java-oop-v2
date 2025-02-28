package MethodOverriding;

public class VicePresident extends Manajer{

    /*
    saaat melakukan method 0verriding maka method yang dibuat juga harus sama dengan method yang ada di class parentnya, seperti tipe datanya lalu isi parameternya yang membedakan adalah isi dari method itu
     */
    void intro(String name){
        System.out.println("hello "+name+" my name is "+this.name +" ,iam a vicePrisident");
    }
}
