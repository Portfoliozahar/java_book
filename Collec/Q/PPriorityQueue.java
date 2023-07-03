// PriorityQueue — предоставляет возможность управлять порядком элементов в коллекции при помощи объекта Comparator, либо сохраняет элементы с использованием «natural ordering».

package Collec.Q;

import java.util.Comparator;
import java.util.PriorityQueue;

// Класс для сравнения задач по приоритету
class Task {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

// Компаратор для сравнения задач по приоритету
class PriorityComparator implements Comparator<Task> {
    @Override
    public int compare(Task task1, Task task2) {
        return Integer.compare(task1.getPriority(), task2.getPriority());
    }
}

public class PPriorityQueue {
    public static void main(String[] args) {
        // Создаем PriorityQueue с использованием Comparator
        PriorityQueue<Task> tasksByPriority = new PriorityQueue<>(new PriorityComparator());

        // Добавляем задачи в PriorityQueue
        tasksByPriority.add(new Task("Task 1", 5));
        tasksByPriority.add(new Task("Task 2", 1));
        tasksByPriority.add(new Task("Task 3", 3));

        // Выводим задачи в порядке приоритета
        System.out.println("Tasks ordered by priority:");
        while (!tasksByPriority.isEmpty()) {
            System.out.println(tasksByPriority.poll());
        }

        // Создаем PriorityQueue с использованием natural ordering
        PriorityQueue<Integer> numbers = new PriorityQueue<>();

        // Добавляем числа в PriorityQueue
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        // Выводим числа в порядке приоритета
        System.out.println("Numbers in priority order:");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}

// В данном коде мы создаем PriorityQueue tasksByPriority для хранения задач. Мы
// передаем в конструктор PriorityQueue объект PriorityComparator,
// который позволяет управлять порядком элементов по приоритету. После
// добавления задач в PriorityQueue,
// мы извлекаем их из очереди по порядку приоритета с помощью метода poll() и
// выводим на экран.

// Затем мы создаем PriorityQueue numbers для хранения чисел. Поскольку числа
// имеют встроенный порядок сортировки (natural ordering),
// нет необходимости передавать Comparator. Мы добавляем числа в PriorityQueue и
// извлекаем их из очереди по порядку приоритета,
// также с помощью метода poll(), и выводим на экран.
