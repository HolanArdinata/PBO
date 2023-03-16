import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class AlatOlahraga {
    private String nama;
    private String merk;
    private String ukuran;
    private String stok;
    private int harga;

    public AlatOlahraga (String nama, String merk, String ukuran, String stok, int harga) {
        this.nama = nama;
        this.merk = merk;
        this.ukuran = ukuran;
        this.stok = stok;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    
    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }
    
    public String getStok() {
        return stok;
    }

    public void setStok(String stok) {
        this.stok = stok;
    }
    
    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String toString () {
        return nama + " | " + merk + " | " + stok + " | " + ukuran + " |Rp.  " + harga;
    }
}

public class Main {
    private static final ArrayList<AlatOlahraga> daftarAlatOlahraga = new ArrayList<>();
    private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        
        boolean lanjutkan = true;
        
        while (lanjutkan) {
            System.out.println("MENU DATA BARANG ALAT OLAHRAGA ");
            System.out.println(" 1. Tambah Barang Alat Olahraga   ");
            System.out.println(" 2. Tampilkan Barang Alat Olahraga");
            System.out.println(" 3. Hapus Barang Alat Olahraga");
            System.out.println(" 4. Update Barang Alat Olahraga");
            System.out.println(" 5. Keluar Program ");
      
            System.out.print("\nPilih menu (1-5): ");
            String pilihan = input.readLine();

           
                switch (pilihan) {
                   case 1 -> {tambahBarang();
                              break;} 
                   case 2 -> {tampilkanBarang();
                              break;} 
                   case 3 -> {updateBarang();
                              break;} 
                   case 4 -> {hapusBarang();
                              break;} 
                   case 5 -> System.exit(0);
                   
                   default -> System.err.println("Pilihan tidak tersedia \nSilahkan Input angka 1-5 ");
                }
            
            
            System.out.println("Apakah Anda Ingin Melanjutkan (y/n)?");
            pilihan = input.readLine();
            lanjutkan = pilihan.equalsIgnoreCase("y");
        }
    }

    private static void tambahBarang() throws IOException {
        System.out.print("Nama     : ");
        String nama = input.readLine();
        
        System.out.print("Merk      : ");
        String merk = input.readLine();
        
        System.out.print("Ukuran     : ");
        String ukuran = input.readLine();

        System.out.print("Stok     : ");
        String stok = input.readLine();
        
        System.out.print("Harga     : Rp. ");
        int harga = Integer.parseInt(input.readLine());

        AlatOlahraga barang = new AlatOlahraga(nama, merk, ukuran, stok, harga);
        daftarAlatOlahraga.add(barang);

        System.out.println("\n Data berhasil ditambahkan.");
    }

    private static void tampilkanBarang() {
        System.out.println("STOK BARANG ALAT OLAHRAGA");

        if (daftarAlatOlahraga.isEmpty()) {
            System.out.println("Stock Barang Alat Olahraga Kosong");
        } else {
            for (int i = 0; i < daftarAlatOlahraga.size(); i++) {
                System.out.println((i+1) + ". " + daftarAlatOlahraga.get(i));
            }
        }
    }

    private static void updateBarang() throws IOException {

        if (daftarAlatOlahraga.isEmpty()) {
            return;
        }

        System.out.print("\nPilih nomor data yang akan diubah: ");
        int nomor = Integer.parseInt(input.readLine());

        if (nomor < 1 || nomor > daftarAlatOlahraga.size()) {
            System.out.println("Nomor data tidak valid.");
            return;
        }

        AlatOlahraga barang = daftarAlatOlahraga.get(nomor-1);
        
        System.out.print("Nama : ");
        String nama = input.readLine();
        
        System.out.print("Merk : ");
        String merk = input.readLine();
        
        System.out.print("Ukuran : ");
        String ukuran = input.readLine();
        
        System.out.print("Stok : ");
        String stok = input.readLine();
        
        System.out.print("Harga : ");
        int harga = Integer.parseInt(input.readLine());
        
        barang.setNama(nama);
        barang.setMerk(merk);
        barang.setUkuran(ukuran);
        barang.setStok(stok);
        barang.setHarga(harga);

        System.out.println("\nData Barang alat olahraga berhasil diubah.");
    }
    
    private static void hapusBarang() throws IOException {

    if (daftarAlatOlahraga.isEmpty()) {
        return;
    }

    System.out.print("\nPilih nomor data yang akan dihapus: ");
    int nomor = Integer.parseInt(input.readLine());

    if (nomor < 1 || nomor > daftarAlatOlahraga.size()) {
        System.out.println("Nomor data tidak valid.");
        return;
    }

    AlatOlahraga barang = daftarAlatOlahraga.get(nomor-1);
    daftarAlatOlahraga.remove(barang);

    System.out.println("\nData berhasil dihapus.");
    }
}


