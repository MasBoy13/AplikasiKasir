package model;

public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private double harga;

    // Constructor
    public Produk(String kodeProduk, String namaProduk, double harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    // Getter
    public String getKodeProduk() {
        return kodeProduk;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    // Tampilkan info produk
    public void tampilkanInfo() {
        System.out.println(kodeProduk + " - " + namaProduk + " - Rp" + harga);
    }
}
