package LooseCoupling;

public class MyntraDelivery {
    static void main(String[] args) {
        Service ob1=new Service();
        ob1.setOb(new Bluedart());
        ob1.service();
        ob1.setOb(new DTDC());
        ob1.service();
        ob1.setOb(new Fedx());
        ob1.service();
    }
}
