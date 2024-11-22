```
public class Prototype {
    public static void main(String[] args) {
        // Создание оригинальных объектов
        Shape circle = new Circle("Red", 5);
        Shape rectangle = new Rectangle("Blue", 10, 20);

        // Клонирование объектов
        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();

        // Изменение свойств клонированных объектов
        ((Circle) clonedCircle).setColor("Green");
        ((Circle) clonedCircle).setRadius(10);

        ((Rectangle) clonedRectangle).setColor("Yellow");
        ((Rectangle) clonedRectangle).setDimensions(15, 30);

        // Вывод информации о клонированных объектах
        System.out.println("Cloned objects:");
        clonedCircle.show();
        clonedRectangle.show();

        // Вывод оригинальных объектов
        System.out.println("Original objects:");
        circle.show();
        rectangle.show();
    }
}
```
