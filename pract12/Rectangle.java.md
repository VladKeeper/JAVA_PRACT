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
    public void draw() {
        System.out.println("Прямоугольник: цвет = " + color + ", ширина = " + width + ", высота = " + height);
    }
}
```
