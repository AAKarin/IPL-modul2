package Tugas.Number2.MVC;

public class KasirController {
    private Barang barang;
    private KasirView view;

    public KasirController(Barang barang, KasirView view) {
        this.barang = barang;
        this.view = view;
    }

    public void executeTransaction() {
        view.tampilkanInfoBarang(barang);
        processPayment();
        view.closeScanner();
    }

    private void processPayment() {
        view.tampilkanHeader();
        int qty = view.inputJumlahBarang();

        if (qty <= 0) {
            view.tampilkanPesanError("Jumlah barang harus lebih dari 0!");
            return;
        }

        if (qty > barang.getStok()) {
            view.tampilkanPesanError("Stok tidak mencukupi! Stok tersedia: " + barang.getStok());
            return;
        }

        int total = barang.hitungTotal(qty);
        barang.kurangiStok(qty);

        view.tampilkanPembayaran(total);
        view.tampilkanInfoStokBaru(barang);
        view.tampilkanPesanSukses("Transaksi berhasil!");
    }
}
