// TreeSet — предоставляет возможность управлять порядком элементов в коллекции при помощи объекта Comparator, либо сохраняет элементы с использованием «natural ordering».

package Collec.Set;

import java.util.Comparator;
import java.util.TreeSet;

// Класс для сравнения пользователей по возрасту
class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

// Компаратор для сравнения пользователей по возрасту
class AgeComparator implements Comparator<User> {
    @Override
    public int compare(User user1, User user2) {
        return Integer.compare(user1.getAge(), user2.getAge());
    }
}

public class TTreeSet {
    public static void main(String[] args) {
        // Создаем TreeSet с использованием Comparator
        TreeSet<User> usersByAge = new TreeSet<>(new AgeComparator());

        // Добавляем пользователей в TreeSet
        usersByAge.add(new User("Alice", 25));
        usersByAge.add(new User("Bob", 30));
        usersByAge.add(new User("Charlie", 20));

        // Выводим пользователей в порядке возраста
        System.out.println("Users ordered by age:");
        for (User user : usersByAge) {
            System.out.println(user);
        }

        // Создаем TreeSet с использованием natural ordering
        TreeSet<Integer> numbers = new TreeSet<>();

        // Добавляем числа в TreeSet
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        // Выводим числа в отсортированном порядке
        System.out.println("Numbers in sorted order:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
