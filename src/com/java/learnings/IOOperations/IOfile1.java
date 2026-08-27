package IOOperations;
//Files & directory creation and its manipulation using inbuilt file-class methods.
//Accessing files in a certain folder by its path and name.

import java.io.*;

public class IOfile1 {
    static void main(String[] args) throws IOException {
        String Filepath="S:\\Study Files\\InputOutput\\IO1.txt";
        String DirPath="S:\\Study Files\\InputOutput\\Serialization";
        File file1=new File(Filepath);
        System.out.println(file1.getPath());
        System.out.println(file1.exists());
        System.out.println(file1.isFile());

        File dir1=new File(DirPath);
        System.out.println(dir1.mkdir());
        System.out.println(dir1.getPath());
        System.out.println(dir1.isDirectory());
//        System.out.println(dir1.delete());
//        try {
//            System.out.println(file1.createNewFile());
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        File file2=new File("S:\\Study Files\\JavaNotes\\CollectionApi\\src");
        String []ls=file2.list();
        for (String name:ls){
            System.out.println(name);
        }
    }
}
