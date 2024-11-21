```
package vehicles;

public class Car extends Vehicle {
    private String ownerName;
    private String insuranceNumber;

    public Car(String model, String license, String color, String year, String engineType) {
        super(model, license, color, year, engineType);
        this.engineType = "Gas"; // Значение по умолчанию для бензинового автомобиля
    }

    @Override
    public String VehicleType() {
        return "Car";
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public String toString() {
        return "Owner Name: " + getOwnerName() +
                " | Insurance Number: " + getInsuranceNumber() +
                " | Engine Type: " + getEngineType() +
                "\nModel: " + getModel() +
                " | License: " + getLicense() +
                " | Color: " + getColor() +
                " | Year: " + getYear() +
                "\nVehicle Type: " + VehicleType();
    }
}
```
