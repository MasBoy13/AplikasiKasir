package model;

import java.util.ArrayList;

public class Transaksi {
    private ArrayList<Produk> daftarBelanja;

    // ✅ Constructor default tanpa parameter
    public Transaksi() {
        daftarBelanja = new ArrayList<>();
    }

    // ✅ Constructor dengan parameter (opsional, untuk kapasitas awal)
    public Transaksi(int kapasitas) {
        daftarBelanja = new ArrayList<>(kapasitas);
    }

    // ✅ Tambahkan produk ke daftar belanja
    public void tambahProduk(Produk p) {
        daftarBelanja.add(p);
    }

    // ✅ Hitung total harga belanja
    public double hitungTotal() {
        double total = 0;
        for (Produk p : daftarBelanja) {
            total += p.getHarga();
        }
        return total;
    }

    // ✅ Getter untuk daftar belanja
    public ArrayList<Produk> getDaftarBelanja() {
        return daftarBelanja;
    }
}
