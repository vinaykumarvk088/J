package ComplexObjectsSortingTypes;

//When creating non-arguments Object, you must also create non-arguments Constructor -
//- but if only there is already present Constructor with Arguments
import java.util.ArrayList;
import java.util.Collections;

class Cricketers1 implements Comparable<Cricketers1>{
    int age;
    String name;
    Double avg;
    Cricketers1(int age,String name,Double avg){
        this.age=age;
        this.name=name;
        this.avg=avg;
    }

    @Override
    public String toString() {
        return "Cricketers1{" + "age=" + age + ", name='" + name + '\'' + ", avg=" + avg + '}';
    }
    @Override
    public int compareTo(Cricketers1 o) {// comparing to current object to 'o' object
        if(this.avg<o.avg){
            return 1;
        }
        else if(this.avg==o.avg)
            return 0;
        else
            return -1;
    }
}
public class LaunchComparable {
    static void main(String[] args) {
        ArrayList<Cricketers1>al=new ArrayList<>();
        al.add(new Cricketers1(32,"SanjuSamson",65.7));
        al.add(new Cricketers1(34,"SuryaKumar",55.2));
        al.add(new Cricketers1(30,"ShivamDube",60.4));
        al.add(new Cricketers1(28,"Abhishek",75.4));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

    }
}
