```
public class Rectangle implements Shape {
    private String color;
    private int width;
    private int height;

    public Rectangle(String color, int width, int height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Rectangle(color, width, height);
    }

    @Override
    public void show() {
        System.out.println("Rectangle: color = " + color + ", width = " + width + ", height = " + height);
    }

    // Метод для изменения цвета
    public void setColor(String color) {
        this.color = color;
    }

    // Метод для изменения размеров
    public void setDimensions(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
```
