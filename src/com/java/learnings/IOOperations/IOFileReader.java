package IOOperations;
//Reading data from a file using FileReader class and its Read method.

import java.io.*;

public class IOFileReader {
    static void main() throws IOException {
        String filePath="S:\\Study Files\\InputOutput\\IO1.txt";
        FileReader fr=null;
        try {
            File file1=new File(filePath);
            fr = new FileReader(file1);
//            System.out.print((char)fr.read());
            char ch[]=new char[(int)file1.length()];
            fr.read(ch);
            for(char c : ch){
                System.out.print(c);
            }

        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        finally {
            fr.close();
        }
    }
}
