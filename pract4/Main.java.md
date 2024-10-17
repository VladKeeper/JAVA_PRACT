```
package vehicles.app;
import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;
import java.util.Scanner;

public class Main {
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
                    case ("Gas"):
                        Car car = new Car(model, license, color, year, engineType);
                        car.setOwnerName(ownerName);
                        car.setModel(model);
                        car.setLicense(license);
                        car.setInsuranceNumber(insuranceNumber);
                        car.setColor(color);
                        car.setYear(year);
                        car.setEngineType(engineType);
                        car.VehicleType();
                        System.out.println(car);
                        break;
                    case ("Electric"):
                        System.out.println("Battery Capacity:");
                        int batteryCapacity = input.nextInt();
                        ElectricCar electricCar = new ElectricCar(model, license, color,year,engineType);
                        electricCar.setOwnerName(ownerName);
                        electricCar.setModel(model);
                        electricCar.setLicense(license);
                        electricCar.setInsuranceNumber(insuranceNumber);
                        electricCar.setColor(color);
                        electricCar.setYear(year);
                        electricCar.setEngineType();
                        electricCar.setBatteryCapacity(batteryCapacity);
                        electricCar.VehicleType();
                        System.out.println(electricCar);
                        break;
                }
    }
}
```
