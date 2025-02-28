package EnumClass;

public class CostumerApp {
    private String name;
    private Level level;// jika ingin mengakses class enum kita harus gunakan tipe data dari class enum itu sendiri

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
