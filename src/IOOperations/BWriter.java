package IOOperations;
//All elements will store in th file in a character format.
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BWriter {
    static void main() throws IOException {
        String filePath="S:\\Study Files\\InputOutput\\bufferwriter.txt";
        FileWriter fW=null;
        BufferedWriter bW=null;
        try
        {
            File file1=new File(filePath);
//            System.out.println(file1.createNewFile());
            fW=new FileWriter(file1);
            bW=new BufferedWriter(fW);
            bW.write("Vinaykumar ==>1");
            bW.newLine();
            char[] asc ={65,66,67,68,69,70,71}; //Ascii Values
            bW.write(asc);
            for(char c:asc){
                System.out.println(c);
            }
        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
        finally {
            bW.close();
        }
    }
}
