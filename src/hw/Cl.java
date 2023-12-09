package hw;

import java.io.Serial;
import java.io.Serializable;

public class Cl implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    String name;

    public Cl(String name) {
        this.name = name;
    }
}