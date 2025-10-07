package app;

import java.util.InputMismatchException;
import java.util.Scanner;
import model.Produk;
import model.Transaksi;
import service.Kasir;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produk[] daftarProduk = new Produk[10];  // Array untuk menyimpan produk
        int jumlahProduk = 0;

        Transaksi transaksi = new Transaksi();
        Kasir kasir = new Kasir(); // ✅ Pakai class Kasir dari package service

        boolean running = true;
        while (running) {
            try {
                System.out.println("\n=== MENU KASIR ===");
                System.out.println("1. Tambah Produk");
                System.out.println("2. Lihat Produk");
                System.out.println("3. Tambah ke Transaksi");
                System.out.println("4. Cetak Struk");
                System.out.println("5. Keluar");
                System.out.print("Pilih: ");
                
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // buang newline

                switch (pilihan) {
                    case 1:
                        System.out.print("Kode Produk: ");
                        String kode = scanner.nextLine();
                        System.out.print("Nama Produk: ");
                        String nama = scanner.nextLine();
                        System.out.print("Harga: ");
                        double harga = scanner.nextDouble();
                        scanner.nextLine();

                        daftarProduk[jumlahProduk] = new Produk(kode, nama, harga);
                        jumlahProduk++;
                        System.out.println("✅ Produk berhasil ditambahkan!");
                        break;

                    case 2:
                        System.out.println("\n📦 Daftar Produk:");
                        if (jumlahProduk == 0) {
                            System.out.println("Belum ada produk.");
                        } else {
                            for (int i = 0; i < jumlahProduk; i++) {
                                daftarProduk[i].tampilkanInfo();
                            }
                        }
                        break;

                    case 3:
                        System.out.print("Masukkan kode produk: ");
                        String kodeCari = scanner.nextLine();
                        boolean ditemukan = false;

                        for (int i = 0; i < jumlahProduk; i++) {
                            if (daftarProduk[i].getKodeProduk().equals(kodeCari)) {
                                transaksi.tambahProduk(daftarProduk[i]);
                                System.out.println("✅ Produk ditambahkan ke transaksi.");
                                ditemukan = true;
                                break;
                            }
                        }

                        if (!ditemukan) {
                            System.out.println("❌ Produk tidak ditemukan.");
                        }
                        break;

                    case 4:
                        kasir.cetakStruk(transaksi);
                        break;

                    case 5:
                        running = false;
                        System.out.println("👋 Terima kasih sudah menggunakan aplikasi kasir!");
                        break;

                    default:
                        System.out.println("⚠️ Pilihan tidak valid.");
                }

            } catch (InputMismatchException e) {
                System.out.println("⚠️ Input harus berupa angka!");
                scanner.nextLine(); // reset input biar tidak infinite loop
            }
        }

        scanner.close();
    }
}
