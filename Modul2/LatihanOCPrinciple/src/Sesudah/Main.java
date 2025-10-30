package Sesudah;

public class Main {
    public static void main(String[] args) {
        CinemaMahasiswa mhsCinema = new CinemaMahasiswa(100.0);
        Double adminFee = mhsCinema.calculateAdminFee();
        System.out.println(adminFee);
    }
}
