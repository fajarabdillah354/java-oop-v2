package MethodOverriding;

public class GetApp {
    public static void main(String[] args) {
        var manajer = new Manajer();
        manajer.name = "fajar abdillah ahmad";
        manajer.intro("ujeh");

        var vicePresident = new VicePresident();
        vicePresident.name = "jett";
        vicePresident.intro("reyna");
    }
}
