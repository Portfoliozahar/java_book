// // HashSet - использует HashMap для хранения данных. В качестве ключа используется добавляемый элемент, в качестве значения - заглушка Object. 
// Из-за особенностей реализации порядок элементов не гарантируется при добавлении.

package Collec.Set;

import java.util.HashSet;

public class HHashSet {
    public static void main(String[] args) {
        // Создаем объект HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Добавляем элементы в HashSet
        hashSet.add("Элемент 1");
        hashSet.add("Элемент 2");
        hashSet.add("Элемент 3");

        // Выводим содержимое HashSet
        System.out.println("Содержимое HashSet: " + hashSet);

        // Проверяем наличие элемента в HashSet
        boolean contains = hashSet.contains("Элемент 2");
        System.out.println("HashSet содержит элемент 'Элемент 2': " + contains);

        // Удаляем элемент из HashSet
        boolean removed = hashSet.remove("Элемент 3");
        System.out.println("Элемент 'Элемент 3' удален из HashSet: " + removed);

        // Проверяем, пуст ли HashSet
        boolean isEmpty = hashSet.isEmpty();
        System.out.println("HashSet пустой: " + isEmpty);

        // Выводим размер HashSet
        int size = hashSet.size();
        System.out.println("Размер HashSet: " + size);
    }
}

// Основная польза реализации HashSet заключается в том, что она обеспечивает
// эффективное хранение и быстрый доступ к данным без повторяющихся элементов.
// Благодаря использованию HashMap внутри, элементы в HashSet хранятся в виде
// ключей без значений,
// что позволяет эффективно проверять наличие элемента и добавлять новые
// элементы с временной сложностью O(1) в среднем случае.

// Однако следует отметить, что порядок элементов в HashSet не гарантируется при
// добавлении из-за особенностей реализации.
// Это означает, что при обходе элементов порядок может быть произвольным. Если
// требуется сохранить порядок добавления элементов,
// можно вместо HashSet использовать LinkedHashSet, который гарантирует
// сохранение порядка элементов при обходе.