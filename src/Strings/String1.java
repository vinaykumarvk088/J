package Strings;

// Immutable Strings
class Str1{
    String st="Telusko";
    String st1="telusko";
    String st2=new String("Telusko");
    String st3=new String("Telusko");
}


public class String1 {
    static void main(String[] args) {
        Str1 ob= new Str1();
        System.out.println(ob.st==ob.st1);
        System.out.println(ob.st==ob.st2);//It's checking references.
        System.out.println(ob.st.equals(ob.st1));  //It's checking the Actual String data because it is overridden immutable string method of class Object.
        System.out.println(ob.st2==ob.st3);
        System.out.println(ob.st2.equals(ob.st3)); //Equals method is overridden.
        System.out.println(ob.st.equals(ob.st2));
        System.out.println(ob.st.equals(ob.st3));

//        String s1="SACHIN";// 83 65 67 72 73 78
//		String s2="SACHIN";// 83 65 67 72 73 78
//
//		System.out.println(s1.compareTo(s2));//0

        String s1="SACHIN";// 83 65 67 72 73 78
        String s2="SAURAV";// 83 65 85 82 65 86

        System.out.println(s1.compareTo(s2));
    }
}
