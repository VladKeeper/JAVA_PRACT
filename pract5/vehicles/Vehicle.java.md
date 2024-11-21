```
package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private String year;
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Vehicle() {
        model = "Unknown";
        license = "Unknown";
        color = "Unknown";
        year = "Unknown";
        ownerName = "Unknown";
        insuranceNumber = "Unknown";
        engineType = "Unknown";
    }

    public Vehicle(String model, String license, String color, String year, String ownerName, String insuranceNumber, String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = engineType;
    }

    public abstract String vehicleType();

    public String getModel() {
        return model;
    }

    public String getLicense() {
        return license;
    }

    public String getColor() {
        return color;
    }

    public String getYear() {
        return year;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Owner Name: " + ownerName + " | Insurance Number: " + insuranceNumber + " | Engine Type: " + engineType + "\n" +
                "Model: " + model + " | License: " + license + " | Color: " + color + " | Year: " + year + "\n" +
                "Vehicle Type: " + vehicleType();
    }
}

```
