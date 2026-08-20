package Enumeration;


//When we create an enum of Result behind the scene Result class will create which extends Object class.
enum Result{
    PASS,FAIL,NR;

    //implicitly the jvm creates objects for every constant.
//    public static final Result PASS=new Result();
//    public static final Result FAIL=new Result();
//    public static final Result NR=new Result();

    int marks;
    Result(){
        System.out.println("zero param Constructor of Result");
    }

    //To assign and get the value of marks we need getters and setters.
    //As we can't use parameterized constructor.
    //Constants always zero params so they always calls zero param constructor.
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks = marks;
    }
}
public class LaunchEnum1 {
    static void main() {
        Result pass=Result.PASS;
        pass.setMarks(82);
        System.out.println(pass.getMarks());
        Result fail=Result.FAIL;
        fail.setMarks(34);
        System.out.println(fail.getMarks());

        //We can directly set values for optimization.
        Result.NR.setMarks(0);
        System.out.println(Result.NR.getMarks());
    }
}
