```
public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

    // Конструктор по умолчанию
    public Triangle() {
        this(1.0, 1.0, 1.0);
    }

    // Конструктор с параметрами для сторон треугольника
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Неправильные стороны треугольника: сумма двух сторон должна быть больше третьей.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Треугольник: Сторона_1 = " + side1 + "; Сторона_2 = " + side2 + "; Сторона_3 = " + side3;
    }
}
```
