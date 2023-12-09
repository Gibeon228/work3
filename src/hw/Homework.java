package hw;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;
import java.util.stream.Stream;

public class Homework implements Serializable{
    private String name;
    @Serial
    private static final long serialVersionUID = 1L;

    public Homework() {
    }

    public Homework(String name) {
        this.name = name;
    }

    void ser(Serializable serializable) throws IOException {
        Path path = Path.of(getClass().getName() + "_" + UUID.randomUUID().toString());
        Files.createFile(path);
        Files.writeString(path, serializable.toString());
        OutputStream outputStream = Files.newOutputStream(path);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(serializable);
        objectOutputStream.close();
    }

    void load(String name) throws IOException, ClassNotFoundException {
        File file = new File(name);
        if (file.exists()) {
            Path path = Path.of(name);
            ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(path));
            Homework homework1 = (Homework) objectInputStream.readObject();
            System.out.println(homework1);
            file.delete();
            objectInputStream.close();
        }
    }

    /**
     * Написать класс с двумя методами:
     * 1. принимает объекты, имплементирующие интерфейс serializable, и сохраняющие их в файл. Название файл - class.getName() + "_" + UUID.randomUUID().toString()
     * 2. принимает строку вида class.getName() + "_" + UUID.randomUUID().toString() и загружает объект из файла и удаляет этот файл.
     *
     * Что делать в ситуациях, когда файла нет или в нем лежит некорректные данные - подумать самостоятельно.
     */

}
