```
import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackOnQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Добавляет элемент на вершину стека
    public void push(int x) {
        queue2.offer(x);
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Удаляет элемент на вершине стека и возвращает его
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return queue1.poll();
    }

    // Возвращает элемент на вершине стека
    public int top() {
        if (empty()) {
            throw new IllegalStateException("Стек пуст");
        }
        return queue1.peek();
    }

    // Возвращает true, если стек пуст
    public boolean empty() {
        return queue1.isEmpty();
    }

    // Возвращает строковое представление всех элементов стека
    public String toString() {
        return queue1.toString();
    }
}
```
