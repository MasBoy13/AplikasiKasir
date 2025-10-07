package service;

import model.Produk;
import model.Transaksi;

public class Kasir {

    // ✅ Method untuk mencetak struk belanja
    public void cetakStruk(Transaksi transaksi) {
        System.out.println("\n===== STRUK BELANJA =====");

        if (transaksi.getDaftarBelanja().isEmpty()) {
            System.out.println("Keranjang belanja kosong.");
        } else {
            for (Produk p : transaksi.getDaftarBelanja()) {
                System.out.println(p.getKodeProduk() + " - " + p.getNamaProduk() + " : Rp" + p.getHarga());
            }

            System.out.println("-------------------------");
            System.out.println("TOTAL : Rp" + transaksi.hitungTotal());
        }

        System.out.println("==========================");
        System.out.println("Terima kasih telah berbelanja!");
    }
}
