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
    public void show() {
        System.out.println("Circle: color = " + color + ", radius = " + radius);
    }

    // Метод для изменения цвета
    public void setColor(String color) {
        this.color = color;
    }

    // Метод для изменения радиуса
    public void setRadius(int radius) {
        this.radius = radius;
    }
}
```
