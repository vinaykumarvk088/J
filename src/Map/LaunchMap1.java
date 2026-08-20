package Map;


import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class PersonalInfo{
    private int id;
    private String name;
    private String location;
    public PersonalInfo(){
        super();
    }
    public PersonalInfo(int id, String name, String location) {
        super();
        this.id = id;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "PersonalInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}

public class LaunchMap1 {
    static void main() {
//        HashMap<Integer,String> hs=new HashMap<>();
//        hs.put(2,"Vinaykumar");
//        hs.put(3,"Raviteja");
//        hs.put(1,"Tharun");
//        hs.put(4,"Bhanuteja");
//        hs.put(null,null);//Null values allowed for kay and values.
//       // hs.put(null,null); //Duplicates not allowed as it's not ganna print.
//        System.out.println(hs);  // Sorting Based on key pair.

        LinkedHashMap<Integer,PersonalInfo> lhm= new LinkedHashMap<>();
        lhm.put(1,new PersonalInfo(101,"Vinaykumar","Hyderapad"));
        lhm.put(3,new PersonalInfo(101,"Raviteja","Hyderapad"));
        lhm.put(2,new PersonalInfo(101,"Tharun","Hyderapad"));
        lhm.put(4,new PersonalInfo(101,"Bhanuteja","Hyderapad"));
        lhm.put(null,null);
        //Null value allowed on both,but not duplicates.
        System.out.println(lhm);      // Insertion order is preserved.



//        TreeMap<Integer,PersonalInfo> tm= new TreeMap<>();
//        tm.put(1,new PersonalInfo(101,"Vinaykumar","Hyderapad"));
//        tm.put(3,new PersonalInfo(103,"Raviteja","Hyderapad"));
//        tm.put(2,new PersonalInfo(102,"Tharun","Hyderapad"));
//        tm.put(4,new PersonalInfo(104,"Bhanuteja","Hyderapad"));
//        tm.put(null,new PersonalInfo(104,"Bhanuteja","Hyderapad"));
//        //Null value not allowed on key and value.
//        System.out.println(tm);      // Insertion order is not Preserved, It's sorting based on key pair.


//        Hashtable<Integer,PersonalInfo> ht= new Hashtable<>();
//        ht.put(1,new PersonalInfo(101,"Vinaykumar","Hyderapad"));
//        ht.put(3,new PersonalInfo(103,"Raviteja","Hyderapad"));
//        ht.put(2,new PersonalInfo(102,"Tharun","Hyderapad"));
//        ht.put(4,new PersonalInfo(104,"Bhanuteja","Hyderapad"));
//        //ht.put(null,new PersonalInfo(104,"Bhanuteja","Hyderapad"));
//       // ht.put(5,null);
//        //Null is not allowed on key and value.
//        System.out.println(ht);     //Sorting based on Values pair.(Not preserving insertion order)

    }
}
