package Strings;
// Mutable Strings
// -String Buffer
 // -String Builder
public class String2 {
    static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); //16
        System.out.println(sb.append("JavaCourse will end in next month"));
        System.out.println(sb.capacity());
        System.out.println(sb.append("New Course will Start"));
        System.out.println(sb.capacity());
    }
}
