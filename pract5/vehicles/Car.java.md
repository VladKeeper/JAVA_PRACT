```
package vehicles;

public class Car extends Vehicle {
    public Car(String model, String license, String color, String year, String ownerName, String insuranceNumber) {
        super(model, license, color, year, ownerName, insuranceNumber, "Combustion");
    }

    @Override
    public String vehicleType() {
        return "Car";
    }
}
```
