package TryResource;

import java.io.BufferedReader;
import java.io.FileReader;

public class Readme {



    /*
    saat kita membuka resource kita harus menutupnya kembali seperti saat membuka file kita juga perlu menutupnya kembali. di java 7 sudah ada fitur untuk menutup file yang telah digunakan dengan otomatis namanya trywithresource
     */
    public static void main(String[] args) {

        /*
        pada blok try dibawah ini adalah contoh dari try with resource yaitu kita menggabungkan semua class-class dari turunan Reader
         */
        try(BufferedReader reader = new BufferedReader(new FileReader("README.md"))){
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }

        }catch (Throwable throwable){
            System.out.println("error membaca file "+throwable.getMessage());
        }


    }



}
