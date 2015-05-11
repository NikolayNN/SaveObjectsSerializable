import java.io.Serializable;

/**
 * Created by Nikolay on 11.05.2015.
 */
public class Cat implements Serializable {
    String name;
    int age;
    int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
