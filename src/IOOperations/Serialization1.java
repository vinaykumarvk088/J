package IOOperations;

import java.io.*;

class Alpha implements Serializable{
    private long id;
    private String name;
    private int age;

    public Alpha(long id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public void run(){
        System.out.println("Id => "+id);
        System.out.println("Name => "+name);
        System.out.println("Age => "+age);
    }
}

public class Serialization1 {
    static void main() throws IOException {
        Alpha obj=new Alpha(12345,"vinaykumar",25);
        String filePath="S:\\Study Files\\InputOutput\\Serialization\\Serialize1.txt";
        try {
            FileOutputStream fos=new FileOutputStream(filePath);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(obj);

            oos.close();
            fos.close();
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
