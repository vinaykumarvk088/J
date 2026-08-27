package IOOperations;
//Writing the data on to the file using FileWriter class and its Writer method.
//Manipulating the data using its corresponding class methods.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class IOfile2 {
    static void main() throws IOException {
        String filePath="S:\\Study Files\\InputOutput\\IO1.txt";
        FileWriter fw=null;
        try {
            File file1=new File(filePath);
            fw=new FileWriter(file1,true);
            fw.write(65);
            fw.write(" Vinay");
            fw.write("\n");
            fw.write(66);
            fw.write(" ");
            char []ch={'A','B','C','D'};
            fw.write(ch);
            for (char name:ch){
                System.out.print(name);
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            fw.close();
        }
    }
}
