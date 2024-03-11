package Modelos;

public class Handler50000 extends BaseHandler {

    public void handle(int request) {
        int numBills = request / 50000;
        int remainder = request % 50000;
        System.out.println("Dispensando " + numBills + " billetes de $50000 ");
        goNext(remainder);
    }    

}
