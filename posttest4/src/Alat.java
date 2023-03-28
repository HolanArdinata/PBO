/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS-GK
 */

public class Alat extends AlatOlahraga {
    protected String tipe;
    protected String merk;

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

    public Alat(String nama, String tipe, String merk, String stok, int harga) {
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
}
