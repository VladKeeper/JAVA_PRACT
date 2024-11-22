```
public class Prototype {
    public static void main(String[] args) {
        // Создание оригинальных объектов
        Shape circle = new Circle("Красный", 5);
        Shape rectangle = new Rectangle("Синий", 10, 20);

        // Клонирование объектов
        Shape clonedCircle = circle.clone();
        Shape clonedRectangle = rectangle.clone();

        // Изменение свойств клонированных объектов
        System.out.println("Клонированные объекты:");
        ((Circle) clonedCircle).draw();
        ((Rectangle) clonedRectangle).draw();

        // Вывод оригинальных объектов
        System.out.println("Оригинальные объекты:");
        circle.draw();
        rectangle.draw();
    }
}
```
