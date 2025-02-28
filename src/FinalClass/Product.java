package FinalClass;
public class Product {// INI ADALAH OUTER CLASSNYA

    private String name;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;// jika kita menggunakan Product.super.getName() maka akan mengambil data yang ada class innernya
    }

    public void setName(String name) {
        this.name = name;
    }



    public class kurir{// DISINI ADALH PROSES INNER CLASSNYA.
        private String name;

        public String getName() {
            return Product.this.getName();// jika menggunakan Product.this.gerName() maka mengambil getNamenya akan keluar yang ada di class outernya....
        }

        public void setName(String name) {
            this.name = name;
        }
    }


}

class ProductApp{
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Kue Nastar keju");

        Product.kurir kurir  = product.new kurir();
        kurir.setName("GILANG JULIANTO");


        System.out.println(product.getName());
        System.out.println(kurir.getName());// hasilnya akan sama dengan yang atasnya


    }
}
