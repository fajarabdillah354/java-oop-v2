package inheritance;

import java.util.Scanner;

public class Kampus {
    String name;
    void dosen(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("silahkan masukan idDosen anda : ");
        String inputId = scanner.next();
        System.out.println("id "+ inputId +" tersedia");
        String[] menuDosen = new String[3];
        menuDosen[0] = "1. Jadwal Ngajar";
        menuDosen[1] = "2. Cek Matakuliah";
        menuDosen[2] = "3. Gaji";
        for(var dos : menuDosen){
            System.out.println(dos);
        }
        System.out.print("SILAHKAN PILIH MENU : ");
        int pilihMenu = scanner.nextInt();
        switch (pilihMenu){
            case(1):
                System.out.println("jadwa ngajar setiap hari kecuali hari sabtu dan minggu");
                break;
            case(2):
                String[] matkul = {
                  "PROLAN","SISTEM BASISDATA","KALKULUS"
                };
                for (var i : matkul){
                    System.out.println(i);
                }
                break;
            case(3):
                int gaji = 5_000_000;
                System.out.println(gaji);
        }



    }


    void mahasiswa(){
    }

}
