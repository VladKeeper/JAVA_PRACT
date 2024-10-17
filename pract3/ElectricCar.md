```
package vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar() {
        super.setOwnerName("Vladislav");
        this.batteryCapacity = 100;
        this.engineType = "Electric";
        super.setInsuranceNumber("MV1337A");
    }

    public ElectricCar(String ownerName, String insuranceNumber, String engineType, int batteryCapacity) {
        super(ownerName, insuranceNumber, engineType);
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int newBatteryCapacity) { this.batteryCapacity = newBatteryCapacity; }
}

```
