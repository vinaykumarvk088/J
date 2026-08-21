package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// class StartingString{
    // void StartString(List<String> ls){
        // List<String> list=ls.stream().filter(name->name.startsWith("v")).collect(Collectors.toList());
        // System.out.println(list);
    // }
//}

public class Lstreamapi2 {
    public static void main(String[] args) {
             List<String> ls=new ArrayList<String>();
             ls.add("vinay");
             ls.add("bobby");
             ls.add("kumar");
             ls.add("Ravi");
             ls.add("vivek");
            //  StartingString ss=new StartingString();
            //  ss.StartString(ls);

            // ls.set(1, "vinay");
            ls.stream().filter(n->n.startsWith("v")).collect(Collectors.toList()).forEach(System.out::println);
    }                                                   
}
