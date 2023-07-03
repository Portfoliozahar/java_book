
// LinkedList (двунаправленный связный список) - состоит из узлов,
//  каждый из которых содержит как собственно данные, так и две ссылки на следующий и предыдущий узел.

package Collec.List;

import java.util.LinkedList;

public class LinkedLList {
    public static void main(String[] args) {
        // Создаем объект LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // Добавляем элементы в LinkedList
        linkedList.add("Элемент 1");
        linkedList.addFirst("Элемент 0"); // Добавляем элемент в начало списка
        linkedList.addLast("Элемент 2"); // Добавляем элемент в конец списка
        linkedList.add(2, "Элемент 1.5"); // Добавляем элемент по индексу

        // Выводим содержимое LinkedList
        System.out.println("LinkedList содержит следующие элементы:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Получаем первый и последний элементы LinkedList
        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();
        System.out.println("\nПервый элемент: " + firstElement);
        System.out.println("Последний элемент: " + lastElement);

        // Изменяем значение первого и последнего элементов
        linkedList.set(0, "Новый элемент 0");
        linkedList.set(linkedList.size() - 1, "Новый элемент 2");

        // Выводим содержимое LinkedList после изменения значений
        System.out.println("\nLinkedList после изменения значений:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Удаляем первый и последний элементы LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();

        // Выводим содержимое LinkedList после удаления элементов
        System.out.println("\nLinkedList после удаления элементов:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Проверяем наличие элемента в LinkedList
        String element = "Элемент 1";
        if (linkedList.contains(element)) {
            System.out.println("\nLinkedList содержит элемент: " + element);
        } else {
            System.out.println("\nLinkedList не содержит элемент: " + element);
        }

        // Очищаем LinkedList
        linkedList.clear();

        // Проверяем пустоту LinkedList
        if (linkedList.isEmpty()) {
            System.out.println("\nLinkedList пустой");
        } else {
            System.out.println("\nLinkedList не пустой");
        }
    }
}

// В этом коде мы используем реализацию LinkedList, которая представляет собой
// двунаправленный связный список.
// Мы добавляем несколько элементов в LinkedList, включая элементы в начало и
// конец списка, а также по указанному индексу.
// Затем мы выводим содержимое коллекции и получаем первый и последний элементы.
// Мы также изменяем значения первого и последнего элементов, удаляем первый и
// последний элементы,
// проверяем наличие элемента в коллекции, очищаем коллекцию и проверяем ее
// пустоту.
// В каждом шаге выводим измененное состояние коллекции.
// Таким образом, использование LinkedList позволяет нам эффективно добавлять,
// удалять и изменять элементы в начале,
// конце и в середине списка. Кроме того, доступ к первому и последнему элементу
// осуществляется быстро.