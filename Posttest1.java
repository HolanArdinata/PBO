package com.mycompany.posttest1;
        
import java.util.ArrayList;
import java.util.Scanner;

public class Posttest1 {
    static ArrayList<String> data = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int pilihan;
        do {
            System.out.println("----------------------------------");
            System.out.println("       TOKO OLAHRAGA MADSPEED     ");
            System.out.println("----------------------------------");
            System.out.println("|             MENU               |");
            System.out.println("----------------------------------");
            System.out.println("|1. Tambah Barang                |");
            System.out.println("|2. Lihat Barang                 |");
            System.out.println("|3. Ubah Barang                  |");
            System.out.println("|4. Hapus Barang                 |");
            System.out.println("|5. Keluar                       |");
            System.out.println("----------------------------------");
            System.out.print("Masukkan Pilihan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1 -> {MasukkanDataBarang();
                          break;}
                case 2 -> {LihatDataBarang();
                            break;}
                 case 3 -> {UbahDataBarang();
                           break;}
                case 4 -> {HapusDataBarang();
                           break;}
                case 5 -> System.out.println("Exiting program...");
                default -> System.out.println("Pilihan Salah,Silahkan Coba Lagi.");
            }
        } while (pilihan != 5);
    }

    public static void MasukkanDataBarang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama Barang: ");
        
        
        String DataBaru = scanner.nextLine();
        data.add(DataBaru);
        System.out.println("Data Barang Berhasil Dimasukkan.");
    }

    public static void LihatDataBarang() {
        if (data.isEmpty()) {
            System.out.println("Tidak Ada Data Tersedia.");
        } else {
            System.out.println("Data Barang:");
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i));
            }
        }
    }

    public static void UbahDataBarang() {
        Scanner scanner = new Scanner(System.in);
        if (data.isEmpty()) {
            System.out.println("Tidak Ada Data Tersedia.");
        } else {
            System.out.println("Data Barang:");
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i));
            }
            System.out.print("Masukkan Nomor Data Barang Yang Ingin Diubah: ");
            int index = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Masukkan Data Barang: ");
            String DataBaru = scanner.nextLine();
            data.set(index - 1, DataBaru);
            System.out.println("Data Berhasil iubah.");
        }
    }

    public static void HapusDataBarang() {
        Scanner scanner = new Scanner(System.in);
        if (data.isEmpty()) {
            System.out.println("Tidak Ada Data Tersedia.");
        } else {
            System.out.println(" Data Barang: ");
            for (int i = 0; i < data.size(); i++) {
                System.out.println((i + 1) + ". " + data.get(i));
            }
            System.out.print("Masukkan Nomor Data Barang Yang Ingin Dihapus: ");
            int index = scanner.nextInt();
            data.remove(index - 1);
            System.out.println("Data Barang Berhasil Dihapus.");
        }
    }
}