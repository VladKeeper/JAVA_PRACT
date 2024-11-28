```
import java.util.LinkedList;
import java.util.Queue;

class StackOnQueue {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public StackOnQueue() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Помещает элемент x на вершину стека
    public void push(int x) {
        queue2.add(x); // Добавляем элемент во вторую очередь
        while (!queue1.isEmpty()) {
            queue2.add(queue1.poll()); // Перемещаем все элементы из первой очереди во вторую
        }
        // Меняем местами очереди
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Удаляет элемент на вершине стека и возвращает его
    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.poll(); // Удаляем элемент из первой очереди
    }

    // Возвращает элемент на вершине стека
    public int top() {
        if (empty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek(); // Получаем элемент из первой очереди
    }

    // Возвращает true, если стек пуст
    public boolean empty() {
        return queue1.isEmpty();
    }

    // Возвращает строковое представление всех элементов стека
    @Override
    public String toString() {
        return queue1.toString();
    }
}
```
