package Strings;

class String3{
     private int Id;
     private String Name;
     public String course(int a , String b){
         this.Id = a;
         this.Name = b;
        return Id +" - "+Name;
    }
    @Override
    public String toString() {
        return "String3{" + "Id=" + Id + ", Name=" + Name + "}";
    }
}
public class ToString1 {
    static void main(String[] args) {
        String3 ob= new String3();
        System.out.println(ob.course(1234,"Vinaykumar"));
        System.out.println(ob); // Println(ob) method automatically invokes the toString method
    }
}
