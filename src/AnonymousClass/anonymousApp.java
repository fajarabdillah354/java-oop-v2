package AnonymousClass;

import java.util.Scanner;

public class anonymousApp {

    public static final int PROCESSOR;

    static {
        PROCESSOR = Runtime.getRuntime().availableProcessors();
    }

    public static void main(String[] args) {

        // dibawah ini adalah contoh anonymousClass, ini tidak bisa kita reuse jika ingin memakai kembali harus buat ulang


        // saat menggunakan anonymousClass kita tidak perlu membuat classImlement lagi
        Goverment goverment = new Goverment() {
            @Override
            public void mubaleg() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("masukan tahun Tes anda :");
                int inputTes = scanner.nextInt();
            }

            @Override
            public void mt(String name) {

            }
        };

        System.out.println(anonymousApp.PROCESSOR);




    }


}
