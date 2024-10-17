package app;

import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car firstCar = new Car();
        ElectricCar secondCar = new ElectricCar();

        System.out.println("\nFirstCar information: ");
        System.out.println("Owner Name: " + firstCar.getOwnerName());
        System.out.println("Insurance Number: " + firstCar.getInsuranceNumber());
        System.out.println("Engine Type: " + firstCar.getEngineType());

        // Second car
        System.out.println("\nSecondCar information: ");
        System.out.println("Owner Name: " + secondCar.getOwnerName());
        System.out.println("Insurance Number: " + secondCar.getInsuranceNumber());
        System.out.println("Engine Type: " + secondCar.getEngineType());
        System.out.println("Battery Capacity: " + secondCar.getBatteryCapacity());
    }
}

