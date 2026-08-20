package Constructors;

public class Constructor1 {
    private String name;
    private static int count;
    private int rollNo;
    private int age;

    Constructor1(){
      count++;
    }
    Constructor1(String name){
        this.name = name;
        count++;
    }
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static void main(String[] args) {
        Constructor1 Obj1 = new Constructor1();
        Constructor1 Obj2 = new Constructor1("VINAY");
        Obj1.setRollNo(1);
        Obj1.setAge(25);
        System.out.println(Obj1.getRollNo());
        System.out.println(Obj1.getAge());
        System.out.println(Obj1.count);
        System.out.println(Obj2.name);
    }
}
