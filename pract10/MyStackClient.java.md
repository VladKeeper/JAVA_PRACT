```
import java.util.Scanner;

public class MyStackClient {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 5 строк:");

        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            stack.push(input);
        }

        System.out.println("Строки в обратном порядке:");

        // Пока стек не пуст, извлекаем и выводим элементы
        while (!stack.isEmpty()) {
            try {
                System.out.println(stack.pop());
            } catch (IllegalStateException e) {
                System.out.println(e.getMessage());
            }
        }

        // Попытка вызвать peek() на пустом стеке
        try {
            System.out.println(stack.peek());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
```
