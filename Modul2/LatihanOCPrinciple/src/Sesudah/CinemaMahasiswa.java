package Sesudah;

public class CinemaMahasiswa extends Cinema {
    public CinemaMahasiswa(Double price) {
        this.price = price;
    }
    @Override
    Double calculateAdminFee() {
        return price * 5 / 100;
    }
}
