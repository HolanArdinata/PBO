/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class Sepatu extends AlatOlahraga implements Barang{
    protected String ukuran;
    protected String merk;

    //interface
    @Override
    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public void setStok(String stok) {
        this.stok = stok;
    }

    @Override
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    public String getNama() {
        return nama;
    }
    public int getHarga() {
        return harga;
    }    
     public String getStok() {
        return stok;
    }
   
    public String getUkuran() {
        return ukuran;
    }

    public String getMerk() {
        return merk;
    }

    public Sepatu(String nama, String merk, String ukuran, String stok, int harga) {
        super(nama, stok, harga);
        this.ukuran = ukuran;
        this.merk = merk;
    }
    
    @Override
    public String toString() {
    return "Sepatu{" +
            "nama='" + nama + '\'' +
            ", ukuran='" + ukuran + '\'' +
            ", merk='" + merk + '\'' +
            ", stok='" + stok + '\'' +
            ", harga=" + harga +
            '}';
}

    @Override
    void setNama_barang(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void setStok_barang(String stok) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    void setHarga_barang(String harga) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getNama_barang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    String getStok_barang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    int getHarga_barang() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
    
