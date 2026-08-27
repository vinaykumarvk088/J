package Collections;


class Cq{
    private final int []arr;
    private final int capacity;
    private int size;
    private int front;
    private int rear;
    Cq(int num){
        this.capacity = num;
        this.arr=new int[capacity];
        this.size=0;
        this.front=0;
        this.rear=0;
    }
    boolean ifFull(){
        return size==capacity;
    }
    boolean ifEmpty(){
        return size==0;
    }
    void add(int element){
        if(ifFull()){
            System.out.println("array is full, couldn't add "+element+".");
        }
        else{
            arr[rear]=element;
            rear=(rear+1)%capacity;
            size++;
        }
    }
    void remove(){
        if(ifEmpty()){
            System.out.println("array is empty, nothing there to remove.");
        }
        else{
            front=(front+1)%capacity;
            size--;
        }
    }
    void peek(){
        if(ifEmpty()) System.out.println("array is empty");
        else System.out.println(arr[front]);
    }
    void poll(){
        if(ifEmpty()) System.out.println("array is empty");
       else {
            System.out.println(arr[front]);
            front=(front+1)%capacity;
            size--;
        }
    }
    void display(){
        if(ifEmpty()) {
            System.out.println("array is empty.");
        }
        else{
            for(int i=0; i<size; i++){
                int index=(front+i)%capacity;
                System.out.print(arr[index]+" ");
            }
            System.out.println();
        }
    }

}



public class CircularQueue {
    static void main(String[] args) {
        Cq ob=new Cq(4);
        ob.add(1);
        ob.add(2);
        ob.add(3);
        ob.add(4);
       ob.display();  //1 2 3 4
       ob.add(5);     //array is full, couldn't add 5.
       ob.remove();
       ob.display();  //2 3 4
       ob.add(5);
       ob.display();  //2 3 4 5
       ob.peek();     //2
        ob.poll();     //2
        ob.display();
        ob.add(5);
        ob.display();
    }
}
