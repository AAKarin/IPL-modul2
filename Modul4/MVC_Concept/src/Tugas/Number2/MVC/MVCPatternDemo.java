package Tugas.Number2.MVC;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Barang barang = new Barang("GeForce GTX 1060Ti", 3000, 10);
        KasirView view = new KasirView();
        KasirController controller = new KasirController(barang, view);
        controller.executeTransaction();
    }
}
