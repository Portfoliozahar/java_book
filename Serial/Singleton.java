package Serial;

import java.io.*;

public class Singleton implements Serializable {
    private static final long serialVersionUID = 1L;

    private static Singleton instance;

    private String data;

    private Singleton() {
        // Приватный конструктор
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public static void main(String[] args) {
        try {
            // Сериализация объекта Singleton
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
            out.writeObject(getInstance());
            out.close();

            // Изменение значения поля data
            getInstance().setData("Hello, World!");

            // Десериализация объекта Singleton
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("singleton.ser"));
            Singleton deserializedSingleton = (Singleton) in.readObject();
            in.close();

            // Проверка значения поля data после десериализации
            System.out.println("Оригинальный Singleton: " + getInstance().getData());
            System.out.println("Десериализованный Singleton: " + deserializedSingleton.getData());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

// // Когда вы запускаете этот код, вы увидите, что сериализованный объект и
// десериализованный объект не являются одним и тем же экземпляром Singleton.
// Это происходит потому, что при десериализации Java создает новый объект,
// игнорируя ограничения Singleton-шаблона.

// // Для решения этой проблемы вы можете использовать специальный метод
// readResolve(), который позволяет контролировать процесс десериализации и
// гарантировать,
// что всегда будет возвращаться единственный экземпляр Singleton. Вот
// обновленный код с использованием readResolve():

// // Приватный конструктор класса Singleton без какого-либо кода внутри - это
// соглашение об ограничении создания объектов этого класса за пределами самого
// класса.
// Он используется для предотвращения создания дополнительных экземпляров класса
// Singleton.

// // В классе Singleton, где используется ленивая инициализация (lazy
// initialization), приватный конструктор не выполняет какую-либо особую логику.
// Он просто служит для ограничения доступа к созданию экземпляров класса извне.
// Поскольку мы хотим, чтобы класс Singleton имел только один экземпляр,
// мы делаем конструктор приватным, чтобы другие классы не могли создать
// экземпляры Singleton напрямую.

// // Приватный конструктор Singleton-класса может быть пустым, потому что
// основная логика создания экземпляра выполняется внутри статического метода
// getInstance(),
// где проверяется наличие уже созданного экземпляра и создается новый
// экземпляр, если он отсутствует.