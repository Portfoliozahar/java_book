// Stack — реализация стека LIFO (last-in-first-out).

package Collec.List;

import java.util.Stack;

public class SStack {
    public static void main(String[] args) {
        // Создаем объект Stack
        Stack<String> stack = new Stack<>();

        // Помещаем элементы в стек
        stack.push("Элемент 1");
        stack.push("Элемент 2");
        stack.push("Элемент 3");

        // Выводим содержимое стека
        System.out.println("Содержимое стека: " + stack);

        // Получаем верхний элемент стека
        String topElement = stack.peek();
        System.out.println("Верхний элемент стека: " + topElement);

        // Удаляем верхний элемент стека
        String removedElement = stack.pop();
        System.out.println("Удаленный элемент из стека: " + removedElement);

        // Проверяем наличие элемента в стеке
        boolean contains = stack.contains("Элемент 2");
        System.out.println("Стек содержит элемент 'Элемент 2': " + contains);

        // Проверяем, пуст ли стек
        boolean isEmpty = stack.isEmpty();
        System.out.println("Стек пустой: " + isEmpty);
    }
}

// Основная польза реализации Stack заключается в том, что она предоставляет
// удобные методы для работы со стеком в соответствии с его принципом LIFO
// (last-in-first-out).
// Методы push() и pop() позволяют добавлять элементы в верхнюю часть стека и
// извлекать элементы из верхней части стека соответственно.
// Метод peek() позволяет получить верхний элемент стека без его удаления.
// Также реализация Stack предоставляет методы для проверки наличия элемента в
// стеке и определения, является ли стек пустым.