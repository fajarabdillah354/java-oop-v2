package toStringEqualsHashcode;

import java.util.Objects;

public class Produk {

    String name;
    int price;


    public Produk(String name, int price) {
        this.name = name;
        this.price = price;
    }

    /*
     method toString digunakann untuk mengkonversi simbol-simbol hashcode yang ada pada program
     */
    public String toString(){
        return "produk : "+name+" ,harga : "+price;
    }


    /*
    method equals digunakan untuk membandingkan isi program untuk tipe data yang non primitif yang ada pada memori bukan perbandingan samadengan samadengan. kita bisa langsung membuatnya melalui alt+ins lalu pilih equals
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produk produk = (Produk) o;
        return price == produk.price && Objects.equals(name, produk.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
