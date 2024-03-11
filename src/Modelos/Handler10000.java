package Modelos;

public class Handler10000 extends BaseHandler {

    public void handle(int request) {
        int numBills = request / 10000;
        int remainder = request % 10000;
        System.out.println("Dispensando " + numBills + " billetes de $10000 ");
        goNext(remainder);
    }    

}
