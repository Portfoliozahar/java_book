// LinkedHashSet — гарантирует, что порядок элементов при обходе коллекции будет идентичен порядку добавления элементов.

package Collec.Set;

import java.util.LinkedHashSet;

public class LLinkedHashSet {
    public static void main(String[] args) {
        // Создаем объект LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Добавляем элементы в LinkedHashSet
        linkedHashSet.add("Элемент 1");
        linkedHashSet.add("Элемент 2");
        linkedHashSet.add("Элемент 3");

        // Выводим содержимое LinkedHashSet
        System.out.println("Содержимое LinkedHashSet: " + linkedHashSet);

        // Проверяем наличие элемента в LinkedHashSet
        boolean contains = linkedHashSet.contains("Элемент 2");
        System.out.println("LinkedHashSet содержит элемент 'Элемент 2': " + contains);

        // Удаляем элемент из LinkedHashSet
        boolean removed = linkedHashSet.remove("Элемент 3");
        System.out.println("Элемент 'Элемент 3' удален из LinkedHashSet: " + removed);

        // Проверяем, пуст ли LinkedHashSet
        boolean isEmpty = linkedHashSet.isEmpty();
        System.out.println("LinkedHashSet пустой: " + isEmpty);

        // Выводим размер LinkedHashSet
        int size = linkedHashSet.size();
        System.out.println("Размер LinkedHashSet: " + size);
    }
}

// Основная польза реализации LinkedHashSet заключается в том, что она
// обеспечивает хранение элементов в порядке их добавления.
// При обходе элементов LinkedHashSet порядок будет идентичен порядку, в котором
// элементы были добавлены.
// Это может быть полезным, когда требуется сохранить порядок элементов,
// например, при реализации истории действий или воспроизведении
// последовательности операций.