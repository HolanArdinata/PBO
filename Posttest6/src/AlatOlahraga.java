/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
abstract class AlatOlahraga implements Barang {
    protected String nama;
    protected String stok;
    protected int harga;
    
     public AlatOlahraga (String nama, String stok, int harga) {
        this.nama = nama;
        this.stok = stok;
        this.harga = harga;
    }
       
       
//
//
//    public String getNama() {
//        return nama;
//    }
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//    
//    public String getStok() {
//        return stok;
//    }
//
//    public void setStok(String stok) {
//        this.stok = stok;
//    }
//    
//    public int getHarga() {
//        return harga;
//    }
//
//    public void setHarga(int harga) {
//        this.harga = harga;
//    }

    
    abstract void setNama_barang(String nama);
    abstract void setStok_barang(String stok);
    abstract void setHarga_barang(String harga);
    abstract String getNama_barang();
    abstract String getStok_barang();
    abstract int getHarga_barang();
    
    public String display(){
        return nama + " | " + stok + " |Rp. " + harga;
    }
    
  
}