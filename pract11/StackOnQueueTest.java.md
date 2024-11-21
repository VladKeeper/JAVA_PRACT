```
public class StackOnQueueTest {
    public static void main(String[] args) {
        StackOnQueue stack = new StackOnQueue();

        // Добавляем два значения в стек
        stack.push(20);
        stack.push(10);

        // Выводим объект на вершине стека (без удаления)
        System.out.println("Вершина стека: " + stack.top());

        // Удаляем объект на вершине стека и выводим его
        System.out.println("Удаленный элемент: " + stack.pop());

        // Проверяем стек на пустоту
        System.out.println("Стек пуст? " + stack.empty());

        // Выводим информацию о всех элементах стека
        System.out.println("Элементы стека: " + stack.toString());
    }
}
```
