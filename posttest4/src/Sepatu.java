/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS-GK
 */
public class Sepatu extends AlatOlahraga{
    protected String ukuran;
    protected String merk;

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

     public void setMerk(String merk) {
        this.merk = merk;
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
}
    
