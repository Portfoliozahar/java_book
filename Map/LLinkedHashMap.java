// LinkedHashMap — упорядоченная реализация хэш-таблицы.

package Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LLinkedHashMap {
    public static void main(String[] args) {
        // Создание объекта LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Добавление элементов в LinkedHashMap
        linkedHashMap.put("John", 25);
        linkedHashMap.put("Emily", 30);
        linkedHashMap.put("Michael", 35);
        linkedHashMap.put("Sarah", 28);

        // Вывод содержимого LinkedHashMap
        System.out.println("LinkedHashMap: " + linkedHashMap);

        // Перебор элементов LinkedHashMap
        System.out.println("Iterating over LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();
            System.out.println(key + ": " + value);
        }

        // Получение значения по ключу
        int age = linkedHashMap.get("Michael");
        System.out.println("Age of Michael: " + age);

        // Проверка наличия ключа в LinkedHashMap
        boolean containsKey = linkedHashMap.containsKey("Emily");
        System.out.println("Contains key 'Emily': " + containsKey);

        // Проверка наличия значения в LinkedHashMap
        boolean containsValue = linkedHashMap.containsValue(40);
        System.out.println("Contains value 40: " + containsValue);

        // Обновление значения по ключу
        linkedHashMap.put("John", 26);

        // Размер LinkedHashMap
        int size = linkedHashMap.size();
        System.out.println("Size of LinkedHashMap: " + size);

        // Проверка, является ли LinkedHashMap пустым
        boolean isEmpty = linkedHashMap.isEmpty();
        System.out.println("LinkedHashMap is empty: " + isEmpty);

        // Удаление элемента по ключу
        linkedHashMap.remove("Sarah");

        // Очистка LinkedHashMap
        linkedHashMap.clear();
        System.out.println("Cleared LinkedHashMap: " + linkedHashMap);
    }
}
