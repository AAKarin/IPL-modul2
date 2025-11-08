package Tugas.Number2.MVC;

import java.util.Scanner;

public class KasirView {
    private Scanner scanner;

    public KasirView() {
        scanner = new Scanner(System.in);
    }

    public void tampilkanInfoBarang(Barang barang) {

        System.out.println("================================");
        System.out.println("Nama Barang : " + barang.getNama());
        System.out.println("Harga Barang : " + barang.getHarga());
        System.out.println("Stok Barang : " + barang.getStok());
        System.out.println("================================");
    }

    public void tampilkanHeader() {
        System.out.println("\n=== Transaksi Pembelian ===");
    }

    public int inputJumlahBarang() {
        System.out.print("Jumlah barang : ");
        return scanner.nextInt();
    }

    public void tampilkanPembayaran(int total) {
        System.out.println("\n================================");
        System.out.println("Jumlah Bayar : " + total);
        System.out.println("================================");
    }

    public void tampilkanPesanError(String pesan) {
        System.out.println("ERROR: " + pesan);
    }

    public void tampilkanPesanSukses(String pesan) {
        System.out.println("SUCCESS: " + pesan);
    }

    public void tampilkanInfoStokBaru(Barang barang) {
        System.out.println("\n=== Info Stok Terbaru ===");
        tampilkanInfoBarang(barang);
    }

    public void closeScanner() {
        scanner.close();
    }
}
