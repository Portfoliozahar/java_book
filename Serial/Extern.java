package Serial;

import java.io.*;

// Класс, который будет сериализован
class MyClass implements Externalizable {
    private String name;
    private int age;

    public MyClass() {
        // Пустой конструктор
    }

    public MyClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Реализация методов интерфейса Externalizable
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = in.readInt();
    }

    // Геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Extern {
    public static void main(String[] args) {
        // Создание объекта MyClass
        MyClass obj = new MyClass("John Doe", 30);

        // Сериализация объекта в файл
        try (FileOutputStream fileOut = new FileOutputStream("data.ser");
                ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {

            objectOut.writeObject(obj);
            System.out.println("Объект сериализован и записан в файл.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация объекта из файла
        try (FileInputStream fileIn = new FileInputStream("data.ser");
                ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

            MyClass deserializedObj = (MyClass) objectIn.readObject();
            System.out.println("Объект десериализован из файла.");

            // Использование десериализованного объекта
            System.out.println("Имя: " + deserializedObj.getName());
            System.out.println("Возраст: " + deserializedObj.getAge());

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
