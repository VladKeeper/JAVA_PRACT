```
package vehicles;

public class ElectricCar extends Car{
    private int batteryCapacity;

    public ElectricCar(String model, String license, String color,String year,String engineType) {
        super(model, license, color,year,engineType);
    }

    public void setEngineType() {
        engineType = "Electric";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    public String VehicleType() {
        return "electricCar";
    }

    public String toString() {
        return "Owner Name: " + getOwnerName() + " | Insurance Number: " + getInsuranceNumber() + " | Engine Type: " + getEngineType() + " | Battery Capacity: " + getBatteryCapacity() + "\n" + "Model: " + getModel() + "| License: " + getLicense() + "| Color: " + getColor() + "| Year: " + getYear() + "\n" + "Vehicle Type: "+ getEngineType();
    }
}
```
