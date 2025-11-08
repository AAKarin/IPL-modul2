package Sesudah;

public class Motorcycle implements VehicleInterface {
    @Override
    public void drive() {
        System.out.println("Motorcycle is driving");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stopped");
    }

    @Override
    public void refuel() {
        System.out.println("Motorcycle refueling");
    }
}
