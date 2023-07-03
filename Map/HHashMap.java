// HashMap — хэш-таблица. Позволяет использовать null в качестве значения или ключа и не является упорядоченной.

package Map;

import java.util.HashMap;

public class HHashMap {
    public static void main(String[] args) {
        // Создание объекта HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Добавление элементов в HashMap
        hashMap.put("John", 25);
        hashMap.put("Emily", 30);
        hashMap.put("Michael", 35);
        hashMap.put("Sarah", 28);

        // Вывод содержимого HashMap
        System.out.println("HashMap: " + hashMap);

        // Получение значения по ключу
        int age = hashMap.get("Michael");
        System.out.println("Age of Michael: " + age);

        // Проверка наличия ключа в HashMap
        boolean containsKey = hashMap.containsKey("Emily");
        System.out.println("Contains key 'Emily': " + containsKey);

        // Проверка наличия значения в HashMap
        boolean containsValue = hashMap.containsValue(40);
        System.out.println("Contains value 40: " + containsValue);

        // Обновление значения по ключу
        hashMap.put("John", 26);

        // Размер HashMap
        int size = hashMap.size();
        System.out.println("Size of HashMap: " + size);

        // Проверка, является ли HashMap пустым
        boolean isEmpty = hashMap.isEmpty();
        System.out.println("HashMap is empty: " + isEmpty);

        // Удаление элемента по ключу
        hashMap.remove("Sarah");

        // Очистка HashMap
        hashMap.clear();
        System.out.println("Cleared HashMap: " + hashMap);
    }
}
