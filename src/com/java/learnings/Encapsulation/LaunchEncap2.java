package Encapsulation;

class Ab{
    private int id;
    private int age;
    private String name;
//We use setters and getters for private variables to add and access data
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class LaunchEncap2 {
    static void main(String[] args) {
        Ab obj= new Ab();
        obj.setId(21);
        obj.setAge(25);
        obj.setName("VINAY KUMAR");
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}
