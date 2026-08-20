package Patterns;

import java.util.Scanner;

class Sr{
    String reverse(String a){
        char[] charArray = a.toCharArray();
        int left =0;
        int right= charArray.length-1;
        while(left < right){
            char temp = charArray[left];
           charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
    String reverse1(String a){
        String reversed="";
        for(int i=a.length()-1;i>=0;i--) {
            reversed = reversed + a.charAt(i);
        }
            return reversed;
    }
}
public class StringReverse {
    static void main() {
        Scanner sc= new Scanner(System.in);
        Sr ob=new Sr();
        System.out.println(ob.reverse1(sc.nextLine()));
        sc.close();
    }
}

