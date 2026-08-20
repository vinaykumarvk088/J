package Patterns;

public class Triangle {
    public static void main(String[] args){
        int n=5;
        for(int i=0 ; i<n ; i++){
            for(int j=i ; j<n; j++){   //for Empty Spaces
                System.out.print("  ");
            }
            for(int j=0 ;j<=i ; j++){    //For left Triangle
                System.out.print("* ");
            }
            for(int j=1 ; j<=i ; j++){    //FOr the Right Triangle
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}