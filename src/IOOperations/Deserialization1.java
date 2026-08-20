package IOOperations;

import java.io.*;

public class Deserialization1 implements Serializable{
    static void main() throws ClassNotFoundException {
        String filePath1="S:\\Study Files\\InputOutput\\Serialization\\Serialize1.txt";
        try {
            FileInputStream fis=new FileInputStream(filePath1);
            BufferedInputStream bis=new BufferedInputStream(fis);
            ObjectInputStream ois=new ObjectInputStream(bis);
            Alpha obj1=(Alpha)ois.readObject();
            obj1.run();

            ois.close();
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
