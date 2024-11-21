```
import java.util.ArrayList;

public class MyStackInheritance extends ArrayList<Object> {

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public int getSize() {
        return super.size();
    }

    // Возвращает элемент на вершине стека, не удаляя его
    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return super.get(super.size() - 1);
    }

    // Удаляет и возвращает элемент с вершины стека
    public Object pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return super.remove(super.size() - 1);
    }

    // Добавляет элемент на вершину стека
    public void push(Object o) {
        super.add(o);
    }
}
```
