```
public class Circle implements Shape {
    private String color;
    private int radius;

    public Circle(String color, int radius) {
        this.color = color;
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(color, radius);
    }

    @Override
    public void draw() {
        System.out.println("Круг: цвет = " + color + ", радиус = " + radius);
    }
}
```
