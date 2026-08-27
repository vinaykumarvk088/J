package ComplexObjectsSortingTypes;
//In Comparator interface we can use it in 3 different ways
//1) Normal implementation(class implements interface)
//2) Anonymous inner class
//3) Lamda expression (if it is a Functional Interface)

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketers{
    int age;
    String name;
    Double avg;
    Cricketers(int age,String name,Double avg){
        this.age=age;
        this.name=name;
        this.avg=avg;
    }

    @Override
    public String toString() {
        return "Cricketers{" + "age=" + age + ", name='" + name + '\'' + ", avg=" + avg + '}';
    }
}
//1) normal Implementation
class Demo implements Comparator<Cricketers>{
    @Override
    public int compare(Cricketers c1, Cricketers c2) {
        if(c1.avg<c2.avg)
            return 1;
        else if(c1.avg == c2.avg)
            return 0;
        else
            return -1;
    }
}
public class LaunchComparator {
    static void main(String[] args) {
        ArrayList<Cricketers>al=new ArrayList<>();
        //Cricketers c1=new Cricketers(30,"SanjuSamson",65.7);
        // We can use any of these 3 primitive elements in an Object for comparison
        al.add(new Cricketers(32,"SanjuSamson",65.7));
        al.add(new Cricketers(34,"SuryaKumar",55.2));
        al.add(new Cricketers(30,"ShivamDube",60.4));
        al.add(new Cricketers(28,"Abhishek",75.4));
        System.out.println(al);
//        Collections.sort(al,new Demo());
//2) Anonymous inner class
        // Comparator<Cricketers> cp=new Comparator<Cricketers>() {
            // public int compare(Cricketers c1, Cricketers c2) {
                // if(c1.avg<c2.avg){
                    // return 1;
                // }
                // else if(c1.avg==c2.avg)
                    // return 0;
                // else
                    // return -1;
            // }
        // };
//        Collections.sort(al,cp);//we can directly put the comparator object at cp of optimized code
//3) Lamda Expression
        // Comparator<Cricketers>cl=(Cricketers c1, Cricketers c2) ->{
            // if(c1.avg<c2.avg){
                // return 1;
            // }
            // else if(c1.avg==c2.avg)
                // return 0;
            // else
                // return -1;

        // };
//        Collections.sort(al,cl);//or we can directly add lamda
        Collections.sort(al,(Cricketers c1, Cricketers c2) ->{
            if(c1.avg<c2.avg){
                return 1;
            }
            else if(c1.avg==c2.avg)
                return 0;
            else
                return -1;

        });
        System.out.println(al);

    }
}
