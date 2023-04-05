/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author user
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public  final class Main {
    private static final ArrayList <Alat> dataAlat = new ArrayList<>();
    private static final ArrayList <Sepatu> dataSepatu  = new ArrayList<>();
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        
        boolean lanjutkan = true;
        
        while (lanjutkan) {
            System.out.println("|=============================================|");
            System.out.println("|MENU DATA BARANG ALAT OLAHRAGA TOKO MADSPEED |");
            System.out.println("|=============================================|");
            System.out.println("| 1. Tambah Barang Alat Olahraga              |");
            System.out.println("| 2. Tampilkan Barang Alat Olahraga           |");
            System.out.println("| 3. Hapus Barang Alat Olahraga               |");
            System.out.println("| 4. Update Barang Alat Olahraga              |");
            System.out.println("| 5. Keluar Program                           |");
            System.out.println("|=============================================|");
            System.out.print("\nMasukkan Pilihan : ");
            String pilihan = input.readLine();

           
                switch (pilihan) {
                   case  "1"  :
                   System.out.println("=========================");
                   System.out.println("|1. Tambah Data Alat      |");
                   System.out.println("|2. Tambah Data Sepatu    |");
                   System.out.println("==========================");
                   System.out.println("Masukkan Pilihan : ");
                   int tambahData = Integer.parseInt(input.readLine());
                   switch (tambahData) {
                        case 1 -> tambahAlat();
                        case 2 -> tambahSepatu();
}
                   break;                       
                       
                
                   case "2" :
                   System.out.println("==========================");
                   System.out.println("|1. Tampilkan Data Alat   |");
                   System.out.println("|2. Tampilkan Data Sepatu |");
                   System.out.println("==========================");
                   System.out.println("Masukkan Pilihan : ");
                   int tampilData = Integer.parseInt(input.readLine());
                   switch (tampilData){
                        case 1 -> tampilkanAlat();
                        case 2 -> tampilkanSepatu();
}
                   break;   
   
                
                   case "3" :
                   System.out.println("==========================");
                   System.out.println("|1. Hapus Data Alat      |");
                   System.out.println("|2. Hapus Data Sepatu    |");
                   System.out.println("==========================");
                   System.out.println("Masukkan Pilihan : ");
                   int hapusData = Integer.parseInt(input.readLine());
                   switch (hapusData){
                        case 1 -> hapusAlat();
                        case 2 -> hapusSepatu();
}
                   break;   
   
                
                   case "4" :
                   System.out.println("==========================");
                   System.out.println("|1. Update Data Alat      |");
                   System.out.println("|2. Update Data Sepatu    |");
                   System.out.println("==========================");
                   System.out.println("Masukkan Pilihan : ");
                   int UpdateData = Integer.parseInt(input.readLine());
                    switch (UpdateData){
                        case 1 -> updateAlat();
                        case 2 -> updateSepatu();
                }break;   
   
                   
                   case "5" : System.exit(0);
                   
                   default : System.err.println("Pilihan tidak tersedia \nSilahkan Input angka 1-5 ");
                }
            System.out.println("Lanjutkan Program ?... (y/n) ");
            pilihan = input.readLine();
            lanjutkan = pilihan.equalsIgnoreCase("y");
        }
        
    }
    
            private static void tambahAlat() throws IOException {
                System.out.print("Nama Alat    : ");
                String nama = input.readLine();
                System.out.print("Tipe Alat    : ");
                String tipe = input.readLine();
                System.out.print("Merk         : ");
                String merk = input.readLine();
                System.out.print("Stok         : ");
                String stok = input.readLine();
                System.out.print("Harga        : Rp. ");
                int harga = Integer.parseInt(input.readLine());

                Alat alatBaru = new Alat( nama, merk, tipe, stok, harga);
                dataAlat.add(alatBaru);
                System.out.println("=============================");
                System.out.println("\n Data berhasil ditambahkan.");
                System.out.println("=============================");
            }

            private static void tambahSepatu() throws IOException {
                System.out.print("Nama Sepatu   : ");
                String nama = input.readLine();
                System.out.print("Merk      : ");
                String merk = input.readLine();
                System.out.print("Ukuran     : ");
                String ukuran = input.readLine();
                System.out.print("Stok     : ");
                String stok = input.readLine();
                System.out.print("Harga     : Rp. ");
                int harga = Integer.parseInt(input.readLine());

                Sepatu sepatuBaru = new Sepatu(nama, merk, ukuran, stok, harga);
                dataSepatu.add(sepatuBaru);
                System.out.println("=============================");
                System.out.println("\n Data berhasil ditambahkan.");
                System.out.println("=============================");
            }

            private static void tampilkanAlat() {
                System.out.println("DATA ALAT OLAHRAGA TOKO MADSPEED");

                if (dataAlat.isEmpty()) {
                    System.out.println("Stock Barang Alat Olahraga Kosong");
                } else {
                    System.out.println("==========================================================");
                    for (int i = 0; i < dataAlat.size(); i += 1) {
                    System.out.println("Nomor Data : " + (i + 1));
                    System.out.println("Nama Alat      : " + dataAlat.get(i).getNama());   
                    System.out.println("Tipe Alat      : " + dataAlat.get(i).getTipe());
                    System.out.println("Merk           : " + dataAlat.get(i).getMerk());
                    System.out.println("Stok           : " + dataAlat.get(i).getStok());
                    System.out.println("Harga          : Rp. " + dataAlat.get(i).getHarga());
                    System.out.println("==========================================================");
                    }
                }
            }

            private static void tampilkanSepatu() {
                System.out.println("DATA SEPATU TOKO MADSPEED");

                if (dataSepatu.isEmpty()) {
                    System.out.println("Stock Sepatu Olahraga Kosong");
                } else { 
                    System.out.println("============================================================");
                    for (int i = 0; i < dataSepatu.size(); i += 1) {
                    System.out.println("Data Sepatu : " + (i + 1));
                    System.out.println("Nama Sepatu      : " + dataSepatu.get(i).getNama());            
                    System.out.println("Merk             : " + dataSepatu.get(i).getMerk());
                    System.out.println("Ukuran           : " + dataSepatu.get(i).getUkuran());
                    System.out.println("Stok             : " + dataSepatu.get(i).getStok());
                    System.out.println("Harga            : Rp. " + dataSepatu.get(i).getHarga());
                    System.out.println("============================================================");
                    }
                }
            }

            private static void hapusAlat() throws IOException {
                tampilkanAlat();
            if (dataAlat.isEmpty()) {
                return;
            }

            System.out.print("\nMasukkan nomor data yang ingin dihapus: ");
            int nomor = Integer.parseInt(input.readLine());

            if (nomor < 1 || nomor > dataAlat.size()) {
                System.out.println("Nomor data tidak terdaftar.");
                return;
            }

            Alat newAlat = dataAlat.get(nomor-1);
            dataAlat.remove(newAlat);

            System.out.println("\nData berhasil dihapus.");


            }

            private static void hapusSepatu() throws IOException {
                tampilkanSepatu();
            if (dataSepatu.isEmpty()) {
                return;
            }

            System.out.print("\nMasukkan nomor data yang ingin dihapus: ");
            int nomor = Integer.parseInt(input.readLine());

            if (nomor < 1 || nomor > dataSepatu.size()) {
                System.out.println("Nomor data tidak terdaftar.");
                return;
            }

            Sepatu newSepatu = dataSepatu.get(nomor-1);
            dataSepatu.remove(newSepatu);

            System.out.println("\nData berhasil dihapus.");
            }




         private static void updateAlat() throws IOException {
                tampilkanAlat();
                if (dataAlat.isEmpty()) {
                    return;
                }
                System.out.print("\nMasukkan nomor data yang ingin di update: ");
                int nomor = Integer.parseInt(input.readLine());

                if (nomor < 1 || nomor > dataAlat.size()) {
                    System.out.println("Nomor data tidak terdaftar.");
                    return;
                }

                Alat newAlat = dataAlat.get(nomor-1);

                System.out.print("Nama (" + newAlat.getNama()+ ") : ");
                String nama = input.readLine();

                System.out.print("Tipe (" + newAlat.getTipe()+ ") : ");
                String tipe = input.readLine();

                System.out.print("Merk (" + newAlat.getMerk()+ ") : ");
                String merk = input.readLine();

                System.out.print("Stok (" + newAlat.getStok()+ ") : ");
                String stok = input.readLine();

                System.out.print("Harga (" + newAlat.getHarga()+ ") : Rp. ");
                int harga = Integer.parseInt(input.readLine());

                newAlat.setNama(nama);
                newAlat.setTipe(tipe);
                newAlat.setMerk(merk);
                newAlat.setStok(stok);
                newAlat.setHarga(harga);

                System.out.println("\nData alat olahraga berhasil diubah.");
            }



            private static void updateSepatu() throws IOException {
                tampilkanSepatu();
                if (dataSepatu.isEmpty()) {
                    return;
                }
                System.out.print("\nMasukkan nomor data yang ingin di update: ");
                int nomor = Integer.parseInt(input.readLine());

                if (nomor < 1 || nomor > dataSepatu.size()) {
                    System.out.println("Nomor data tidak terdaftar.");
                    return;
                }

                Sepatu newSepatu = dataSepatu.get(nomor-1);

                System.out.print("Nama (" + newSepatu.getNama()+ ") : ");
                String nama = input.readLine();

                System.out.print("Merk (" + newSepatu.getMerk()+ ") : ");
                String merk = input.readLine();

                System.out.print("Ukuran (" + newSepatu.getUkuran()+ ") : ");
                String ukuran = input.readLine();

                System.out.print("Stok (" + newSepatu.getStok()+ ") : ");
                String stok = input.readLine();

                System.out.print("Harga (" + newSepatu.getHarga()+ ") : Rp. ");
                int harga = Integer.parseInt(input.readLine());

                newSepatu.setNama(nama);
                newSepatu.setMerk(merk);
                newSepatu.setUkuran(ukuran);
                newSepatu.setStok(stok);
                newSepatu.setHarga(harga);

                System.out.println("\nData sepatu olahraga berhasil diubah.");
          }

      }

