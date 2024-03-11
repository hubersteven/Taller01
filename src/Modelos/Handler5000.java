package Modelos;

public class Handler5000 extends BaseHandler {

    public void handle(int request) {
        int numBills = request / 5000;
        if (request % 5 != 0) {
            System.out.println("Error: El pedido solicitado no es multiplo de 5");
        }else{
        System.out.println("Dispensando " + numBills + " billetes de $5000 ");
        }
    }
}
