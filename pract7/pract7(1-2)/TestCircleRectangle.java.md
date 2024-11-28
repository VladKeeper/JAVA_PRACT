```
public class TestCircleRectangle {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println("Круг " + circle.toString());
        System.out.println("Радиус = " + circle.getRadius());
        System.out.println("Площадь = " + circle.getArea());
        System.out.println("Диаметр = " + circle.getDiameter());

        Rectangle rectangle = new Rectangle(2, 4);
        System.out.println("\nПрямоугольник " + rectangle.toString());
        System.out.println("Площадь = " + rectangle.getArea());
        System.out.println("Периметр = " +
                rectangle.getPerimeter());
    }
}
```
