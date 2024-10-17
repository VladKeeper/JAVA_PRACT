```
public class Car {
    public String model;
    public String license;
    public String color;
    private int year;
    public Car(String model, String license, String color,int year){
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }
    public Car(String model,int year){
        this.model = model;
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = year;
    }
    public Car(){
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 0;
    }
    public String toString(){
        return "model: " + model + "; license: " + license + "; color: " + color + "; year: " + year + " age: " + (2024-year) +"\n";
    }
    public void setYear(int year){
        this.year = year;
    }
    public int getAge(){
        return 2024-year;
    }
}
```
