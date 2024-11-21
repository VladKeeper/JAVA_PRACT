package app;

import vehicles.Car;
import vehicles.ElectricCar;

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Owner Name:");
        String ownerName = input.nextLine();
        System.out.println("Model:");
        String model = input.nextLine();
        System.out.println("License:");
        String license = input.nextLine();
        System.out.println("Insurance Number:");
        String insuranceNumber = input.nextLine();
        System.out.println("Color:");
        String color = input.nextLine();
        System.out.println("Year:");
        String year = input.nextLine();
        System.out.println("Engine Type (Gas or Electric):");
        String engineType = input.nextLine();

        switch (engineType) {
            case "Gas":
                Car car = new Car(model, license, color, year, ownerName, insuranceNumber);
                System.out.println(car);
                break;
            case "Electric":
                System.out.println("Battery Capacity:");
                int batteryCapacity = input.nextInt();
                ElectricCar electricCar = new ElectricCar(model, license, color, year, ownerName, insuranceNumber, batteryCapacity);
                System.out.println(electricCar);
                break;
            default:
                System.out.println("Invalid engine type.");
        }
    }
}
