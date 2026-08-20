package LooseCoupling;

public class Service {
    private IDelivery ob;

    public void setOb(IDelivery ob) {
        this.ob = ob;
    }
    public void service(){
        ob.Deliveried();
    }
}
