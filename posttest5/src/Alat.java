/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */

public class Alat extends AlatOlahraga {
    protected String tipe;
    protected String merk;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    
    
    public String getTipe() {
        return tipe;
    }

    public String getMerk() {
        return merk;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public Alat(String nama, String merk, String tipe, String stok, int harga) {
        super(nama, stok, harga);
        this.tipe = tipe;
        this.merk = merk;
    }

    
    @Override
    public String toString() {
    return "Alat{" +
            "nama='" + nama + '\'' +
            ", tipe='" + tipe + '\'' +
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