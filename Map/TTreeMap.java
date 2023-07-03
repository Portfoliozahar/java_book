// // TreeMap — реализация, основанная на красно-чёрных деревьях. 
// Является упорядоченной и предоставляет возможность управлять порядком элементов в коллекции при помощи объекта Comparator, 
// либо сохраняет элементы с использованием «natural ordering».

package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TTreeMap {
    public static void main(String[] args) {
        // Создание объекта TreeMap с natural ordering
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(3, "Apple");
        treeMap1.put(1, "Banana");
        treeMap1.put(2, "Orange");

        System.out.println("TreeMap with natural ordering: " + treeMap1);

        // Создание объекта TreeMap с Comparator
        TreeMap<String, Integer> treeMap2 = new TreeMap<>(Comparator.reverseOrder());
        treeMap2.put("Apple", 3);
        treeMap2.put("Banana", 1);
        treeMap2.put("Orange", 2);

        System.out.println("TreeMap with custom ordering: " + treeMap2);

        // Перебор элементов TreeMap
        System.out.println("Iterating over TreeMap:");
        for (Map.Entry<String, Integer> entry : treeMap2.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Получение значения по ключу
        String count = treeMap1.get(2);
        System.out.println("Count of key 2: " + count);

        // Проверка наличия ключа в TreeMap
        boolean containsKey = treeMap2.containsKey("Apple");
        System.out.println("Contains key 'Apple': " + containsKey);

        // Проверка наличия значения в TreeMap
        boolean containsValue = treeMap1.containsValue("Cherry");
        System.out.println("Contains value 'Cherry': " + containsValue);

        // Обновление значения по ключу
        treeMap2.put("Banana", 5);

        // Размер TreeMap
        int size = treeMap1.size();
        System.out.println("Size of TreeMap: " + size);

        // Проверка, является ли TreeMap пустым
        boolean isEmpty = treeMap2.isEmpty();
        System.out.println("TreeMap is empty: " + isEmpty);

        // Удаление элемента по ключу
        treeMap1.remove(3);

        // Очистка TreeMap
        treeMap2.clear();
        System.out.println("Cleared TreeMap: " + treeMap2);
    }
}

// В этом примере мы создаем объекты TreeMap с использованием natural ordering и
// с помощью Comparator, добавляем элементы в TreeMap,
// выводим содержимое TreeMap, перебираем элементы с помощью цикла, получаем
// значения по ключу,
// проверяем наличие ключа и значения, обновляем значение по ключу, определяем
// размер и пустоту TreeMap,
// а также удаляем элемент по ключу и очищаем TreeMap. Важно отметить, что
// TreeMap является упорядоченной реализацией,
// где порядок элементов определяется natural ordering (при использовании
// объектов, которые реализуют интерфейс Comparable) или при помощи Comparator
// (в случае, если задан пользовательский компаратор