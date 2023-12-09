package hw;

import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cl cl = new Cl("asd");
        Homework homework = new Homework("Ivan");
        Homework homework1 = new Homework();
        homework.ser(cl);
        homework1.load("Homework_55898778-382b-4b31-bfde-39f01dcdc0fe");

    }


}
