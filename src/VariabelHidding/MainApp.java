package VariabelHidding;

public class MainApp {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "poki";
        cat.sounds();
        System.out.println(cat.name);

        Animals animals = cat;
        animals.name = "Kucing";
        animals.sounds();
        System.out.println(animals.name);
    }
}
