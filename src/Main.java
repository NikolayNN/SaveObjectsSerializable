import java.io.*;

/**
 * Created by Nikolay on 11.05.2015.
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat("Vaska", 10,5);
        FileOutputStream out = new FileOutputStream("c:/data.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(cat);

        FileInputStream in = new FileInputStream("c:/data.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(in);
        Object object =  objectInputStream.readObject();

        out.close();
        objectOutputStream.close();
        in.close();
        objectInputStream.close();

        Cat newCat = (Cat) object;
    }
}
