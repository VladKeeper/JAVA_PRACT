```
import java.util.ArrayList;

public class MyStackDeepCopy implements Cloneable {
    private ArrayList<Object> list;

    // Конструктор класса, инициализирующий пустой ArrayList
    public MyStackDeepCopy() {
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

    @Override
    public Object clone() {
        try {
            MyStackDeepCopy clone = (MyStackDeepCopy) super.clone();
            clone.list = (ArrayList<Object>) list.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(); // Не должно произойти
        }
    }
}
```
