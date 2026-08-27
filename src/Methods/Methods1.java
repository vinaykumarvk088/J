package Methods;


public class Methods1 {
    int Add(int x, int y){
        return x*y;
    }
   public static void main(String[] args) {
        Methods1 c=new Methods1();
        int n=c.Add(500,500);
       System.out.println(n);
    }
}
