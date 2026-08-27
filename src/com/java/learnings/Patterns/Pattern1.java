package Patterns;

class Pattern1 {
     public static void main(){
        int n = 9;
          int i=0 ;
          while (i<n) {
              for (int j = 0; j < n; j++) {
                  if (((i==n-1) && (j==(n-1)/2)) || ((j==0) && (i<=(n-1)/2)) || ((j==n-1) && (i<=(n-1)/2)) || (i-j==(n-1)/2) || (i+j==((n-1)+((n-1)/2))))
                      System.out.print(" * ");
                  else
                      System.out.print("   ");
              }
              System.out.print("     ");
              for(int j=0 ; j<n ;j++){
                  if (i==0 || i==n-1 || j==(n-1)/2)
                      System.out.print(" * ");
                  else
                      System.out.print("   ");
              }
              System.out.print("     ");
              for(int j=0 ; j<n ; j++){
                  if (j==0 || j==n-1 || (i==j))
                      System.out.print(" * ");
                  else
                      System.out.print("   ");
              }
              System.out.print("     ");
              for(int j=0 ; j<n ; j++){
                  if(i==(n-1)/2 || (i+j==(n-1)/2) || (i-j==-(n-1)/2) || (j==0&&i>=(n-1)/2) || (j==(n-1)&&i>=(n-1)/2))
                      System.out.print(" * ");
                  else
                      System.out.print("   ");
              }
              System.out.print("     ");
              for(int j=0 ; j<n ; j++){
                  if ((j==(n-1)/2)&&i>=(n-1)/2 || (i==j&&i<=(n-1)/2) || (i+j==(n-1)&&i<=(n-1)/2))
                      System.out.print(" * ");
                  else
                      System.out.print("   ");
              }
              System.out.print("     ");
              for(int j=0 ; j<n ; j++){
                  if (i+j>=(n-1)/2&&i<=(n-1)/2&&j<=(n-1)/2 || j-i<=(n-1)/2&&i<=(n-1)/2&&j>=(n-1)/2 || i==(n-1)/2)
                      System.out.print(" * ");
                  else
                      System.out.print("   ");
              }
              System.out.println();
              i++;
          }
      }
}