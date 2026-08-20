package IOOperations;

import java.io.*;

public class PWriter {
    static void main() {
        String filePath="S:\\Study Files\\InputOutput\\PrintWriter.txt";
        FileWriter fW=null;
        PrintWriter pW=null;
        try
        {
            File file=new File(filePath);
            fW=new FileWriter(file);
            pW=new PrintWriter(fW);
//            System.out.println(file.exists());
//            System.out.println(file.createNewFile());
            pW.print(1);
            pW.write(" VINAYKUMAR");
            pW.write("\n");
            pW.print(2);
            pW.write(" RAVI");
            pW.write("\n");
            pW.print(3);
            pW.write(" THARUN");
            pW.write("\n");
            pW.println(true);
            pW.print('A');
            pW.print("\n");
            pW.println(100);

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            pW.close();
        }
    }
}
