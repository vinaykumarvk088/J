package IOOperations;

import java.io.*;

public class Deserialization2 {
    static void main(String[] args) {
        try {
//            file.createNewFile();
            FileInputStream fos=new FileInputStream("S:\\Study Files\\InputOutput\\Serialization\\Serialization2.txt");
            BufferedInputStream bos=new BufferedInputStream(fos);
            ObjectInputStream oos=new ObjectInputStream(bos);
            String str=(String) oos.readObject();
            System.out.println(str);

            oos.close();
            bos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
