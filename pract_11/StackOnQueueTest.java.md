```
public class StackOnQueueTest {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        stack.push(10);
        stack.push(20);

        // Выводим объект, находящийся на вершине стека (без удаления)
        System.out.println("Текущий верхний элемент стека: " + stack.top());

        // Выводим объект, находящийся на вершине стека и удаляем его
        System.out.println("Удаленный верхний элемент стека: " + stack.pop());

        // Проверяем стек на пустоту
        System.out.println("Стек пуст?: " + stack.empty());

        // Выводим информацию о всех элементах стека
        System.out.println("Элементы стека: " + stack);

        // Удаляем оставшийся элемент
        stack.pop();

        // Проверяем стек на пустоту снова
        System.out.println("Стек пуст?: " + stack.empty());
    }
}

```
