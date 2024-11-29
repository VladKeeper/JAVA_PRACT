```
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Задание 1.1: Удаление дубликатов из списка чисел.
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);
        numbers.add(6);
        ArrayList<Integer> UniqueNumbers = UniqueList.removeDuplicates(numbers);
        System.out.println("Уникальные числа: " + UniqueNumbers);
        // Задание 1.2: Линейный поиск числа в массиве.
        Integer[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int SearchResult1 = LinearSearch.linearSearch(array1, 7);
        System.out.println(SearchResult1 != -1 ? "Индекс искомого числа: " + SearchResult1 : "Число не найдено");
        // Задание 1.3: Нахождение круга с наибольшим радиусом.
        Circle circle1 = new Circle(1.2);
        Circle circle2 = new Circle(2.1);
        Circle circle3 = new Circle(3.9);
        Circle circle4 = new Circle(4.5);
        Circle circle5 = new Circle(0.8);
        Circle[] array2 = {circle1, circle2, circle3, circle4, circle5};
        Circle BiggerCircle = MaxElement.findMax(array2);
        System.out.println("Радиус наибольшего круга: " + BiggerCircle.getRadius());
        // Задание 1.4: Нахождение наибольшего числа в двумерном массиве.
        Integer[][] array3 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int SearchResult2 = MaxElementIn2D.findMax(array3);
        System.out.println("Наибольшее число в двумерном массиве: " + SearchResult2);
        // Задание 2.1 и 2.2: Ввод строк и вывод их в обратном порядке с использованием двух реализаций стека.
        Scanner scanner = new Scanner(System.in);
        GenericStack1<String> stack1 = new GenericStack1<>();
        GenericStack2<String> stack2 = new GenericStack2<>();
        System.out.println("Введите пять строк:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String input = scanner.nextLine();
            stack1.push(input);
            stack2.push(input);
        }
        System.out.println("\nСтроки в обратном порядке (GenericStack1):");
        while (!stack1.isEmpty()) {
            System.out.println(stack1.pop()); // Извлекаем и выводим строки в обратном порядке
        }

        System.out.println("\nСтроки в обратном порядке (GenericStack2):");
        while (!stack2.isEmpty()) {
            System.out.println(stack2.pop()); // Извлекаем и выводим строки в обратном порядке
        }
        scanner.close();
    }
}
```
