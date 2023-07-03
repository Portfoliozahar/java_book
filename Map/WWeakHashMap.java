// WeakHashMap — реализация хэш-таблицы, которая организована с использованием weak references для ключей 
// (сборщик мусора автоматически удалит элемент из коллекции при следующей сборке мусора, если на ключ этого элемента нет жёстких ссылок).

package Map;

import java.util.Map;
import java.util.WeakHashMap;

public class WWeakHashMap {
    public static void main(String[] args) {
        // Создание объекта WeakHashMap
        Map<Key, String> weakHashMap = new WeakHashMap<>();

        // Создание объектов-ключей
        Key key1 = new Key("key1");
        Key key2 = new Key("key2");
        Key key3 = new Key("key3");

        // Добавление элементов в WeakHashMap
        weakHashMap.put(key1, "Value 1");
        weakHashMap.put(key2, "Value 2");
        weakHashMap.put(key3, "Value 3");

        // Вывод содержимого WeakHashMap
        System.out.println("WeakHashMap: " + weakHashMap);

        // Удаление ссылок на ключи
        key1 = null;
        key2 = null;

        // Вызов сборщика мусора
        System.gc();

        // Ожидание некоторого времени для выполнения сборки мусора
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Вывод содержимого WeakHashMap после сборки мусора
        System.out.println("WeakHashMap after garbage collection: " + weakHashMap);
    }

    static class Key {
        private String name;

        public Key(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }
}

// В этом примере мы создаем объект WeakHashMap и добавляем в него элементы с
// использованием объектов-ключей.
// Обратите внимание, что ключи являются объектами, которые не имеют жестких
// ссылок на них после присвоения null.
// После этого мы вызываем сборщик мусора, чтобы он удалил элементы WeakHashMap,
// для которых больше не осталось жестких ссылок.
// Затем мы ожидаем некоторое время для выполнения сборки мусора и выводим
// содержимое WeakHashMap до и после сборки мусора.

// после выполнения сборки мусора, элементы WeakHashMap, на которые не осталось
// жестких ссылок,
// будут удалены автоматически. Это демонстрирует пользу данной реализации,
// так как позволяет автоматически освободить память от элементов,
// на которые больше нет активных ссылок, что может быть полезно в некоторых
// сценариях, например, при кэшировании данных или управлении ресурсами.