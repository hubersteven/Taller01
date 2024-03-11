package Modelos;

public class Handler100000 extends BaseHandler {

    public void handle(int request) {
        int numBills = request / 100000;
        int remainder = request % 100000;
        System.out.println("Dispensando " + numBills + " billetes de $100000 ");
        super.goNext(remainder);
    }    

}
