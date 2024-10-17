```
package vehicles;

public abstract class Vehicle {
    private String model;
    private String license;
    private String color;
    private String year;
    protected String engineType;

    public Vehicle() {
        model = "Unknown";
        license = "Unknown";
        color = "Unknown";
        year = "Unknown";
        engineType = "Unknown";
    }
    public Vehicle(String model, String license, String color,String year,String engineType) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
        this.engineType = engineType;
    }
    public abstract String VehicleType();

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
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
```
