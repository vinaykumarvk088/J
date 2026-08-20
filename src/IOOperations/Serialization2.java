package IOOperations;

import java.io.*;

public class Serialization2 implements Serializable {
    static void main(String[] args) {
        try {
//            file.createNewFile();
            FileOutputStream fos=new FileOutputStream("S:\\Study Files\\InputOutput\\Serialization\\Serialization2.txt");
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeChars("vinaykumar");
//            oos.writeBytes("123456");

            oos.close();
            bos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
