package Map;


import java.util.*;

interface Alpha{
    //Inner-interface is possible.
    interface Beta{
        static void beta(){
            System.out.println("=>static beta method of inner-interface Beta of Alpha");
        }
    }
}
public class LaunchMap2 {
    static void main() {
        Alpha.Beta.beta();
        Map<Integer,String> hm=new HashMap<>();
        hm.put(2,"Vinaykumar");
        hm.put(3,"Raviteja");
        hm.put(1,"Tharun");
        hm.put(4,"Bhanuteja");
//        System.out.println(hm);
        Set<Integer> set=hm.keySet();
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        Collection<String> coll=hm.values();
        Iterator<String> itr1=coll.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }
        Set<Map.Entry<Integer,String>> s =hm.entrySet();
        Iterator<Map.Entry<Integer,String>> itr2=s.iterator();
        while (itr2.hasNext()){
           // System.out.println(itr2.next());
            //or
            Map.Entry<Integer,String> pair= (Map.Entry<Integer,String>) itr2.next();
            System.out.println("Key : "+pair.getKey()+"---"+"Values : "+pair.getValue());

        }
    }
}
