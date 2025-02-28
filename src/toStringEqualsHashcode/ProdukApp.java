package toStringEqualsHashcode;

public class ProdukApp {

    public static void main(String[] args) {
        Produk produk = new Produk("MOBIL INNOVA 2022", 400_000_000);
        System.out.println(produk.name);
        System.out.println(produk.price);

        System.out.println(produk);

        Produk produk1 = new Produk("MOBIL PAJERO 2021", 500_000_000);
        System.out.println(produk1.equals(produk));//pengecekan equals method
        System.out.println(produk1.hashCode() == produk.hashCode());//pengecekan hashcode method

        /*
        NB : HASIL DARI EQUALS DAN HASHCODE HARUS SAMA
         */
    }
}
