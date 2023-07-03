// ArrayList - инкапсулирует в себе обычный массив, длина которого автоматически увеличивается при добавлении новых элементов. 
// Элементы такой коллекции пронумерованы, начиная от нуля, к ним можно обратиться по индексу.
package Collec.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayLList {
    public static void main(String[] args) {
        // Создаем объект ArrayList
        List<String> arrayList = new ArrayList<>();

        // Добавляем элементы в ArrayList
        arrayList.add("Элемент 1");
        arrayList.add("Элемент 2");
        arrayList.add("Элемент 3");

        // Выводим содержимое ArrayList
        System.out.println("ArrayList содержит следующие элементы:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Получаем элемент по индексу
        String elementAtIndex = arrayList.get(1);
        System.out.println("\nЭлемент на позиции 1: " + elementAtIndex);

        // Изменяем значение элемента
        arrayList.set(2, "Новый элемент 3");

        // Выводим содержимое ArrayList после изменения значения
        System.out.println("\nArrayList после изменения значения:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Удаляем элемент
        arrayList.remove(0);

        // Выводим содержимое ArrayList после удаления элемента
        System.out.println("\nArrayList после удаления элемента:");
        for (String element : arrayList) {
            System.out.println(element);
        }

        // Проверяем наличие элемента в ArrayList
        String element = "Элемент 2";
        if (arrayList.contains(element)) {
            System.out.println("\nArrayList содержит элемент: " + element);
        } else {
            System.out.println("\nArrayList не содержит элемент: " + element);
        }

        // Очищаем ArrayList
        arrayList.clear();

        // Проверяем пустоту ArrayList
        if (arrayList.isEmpty()) {
            System.out.println("\nArrayList пустой");
        } else {
            System.out.println("\nArrayList не пустой");
        }
    }
}
