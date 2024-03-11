package Modelos;

public class Handler20000 extends BaseHandler {

    public void handle(int request) {
        int numBills = request / 20000;
        int remainder = request % 20000;
        System.out.println("Dispensando " + numBills + " billetes de $20000 ");
        goNext(remainder);
    }    

}