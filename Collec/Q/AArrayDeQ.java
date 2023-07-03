// ArrayDeque — реализация интерфейса Deque, который расширяет интерфейс Queue методами, позволяющими реализовать конструкцию вида LIFO (last-in-first-out).

package Collec.Q;

import java.util.ArrayDeque;

public class AArrayDeQ {
    public static void main(String[] args) {
        // Создаем ArrayDeque
        ArrayDeque<String> stack = new ArrayDeque<>();

        // Добавляем элементы в стек
        stack.push("Element 1");
        stack.push("Element 2");
        stack.push("Element 3");

        // Выводим текущее состояние стека
        System.out.println("Current stack: " + stack);

        // Получаем верхний элемент стека без удаления
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // Удаляем верхний элемент стека
        String removedElement = stack.pop();
        System.out.println("Removed element: " + removedElement);

        // Выводим текущее состояние стека после удаления элемента
        System.out.println("Current stack: " + stack);

        // Проверяем пустоту стека
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is stack empty? " + isEmpty);

        // Получаем размер стека
        int size = stack.size();
        System.out.println("Stack size: " + size);
    }
}
