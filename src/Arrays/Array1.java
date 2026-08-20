package Arrays;


//import java.util.Arrays;
import java.util.Scanner;

class A1{
    int []n={1,2,3,4,5,6};
    void add(){
        for (int i : n) {
            System.out.println(i);
        }
    }
}
class A2{
    Scanner sc=new Scanner(System.in);
    int[] n =new int[4];
    void meth(){
        for(int i=0; i<n.length; i++){
            n[i]=sc.nextInt();
        }
        for (int i:n) System.out.print(" "+i);
    }
}
class A3{
    Scanner sc=new Scanner(System.in);
    int[][] ar=new int[3][4];//Regular 2D Array
    void twoD(){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                ar[i][j]=sc.nextInt();
            }
        }
//        for (int i[]:ar) System.out.println(Arrays.toString(i));    //using temp array 'i' as variable by using .array package
    for(int[] i :ar) {
        for (int j : i) {
            System.out.print(" " + j);
        }
        System.out.println();
    }
    }
}
public class Array1 {
    static void main(String[] args) {
        A1 t=new A1();
        t.add();
        A2 r=new A2();
        r.meth();
        A3 p=new A3();
        p.twoD();
    }
}
