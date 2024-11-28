```
import java.util.ArrayList;

public class MyStack {
    private ArrayList<Object> list;

    // Конструктор класса, инициализирующий пустой ArrayList
    public MyStack() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public int getSize() {
        return list.size();
    }

    // Возвращает элемент на вершине стека, не удаляя его
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.get(list.size() - 1);
    }

    // Удаляет и возвращает элемент с вершины стека
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return list.remove(list.size() - 1);
    }

    // Добавляет элемент на вершину стека
    public void push(Object o) {
        list.add(o);
    }
}
```
