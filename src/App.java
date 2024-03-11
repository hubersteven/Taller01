import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        Client client = new Client();
        System.out.print("Ingrese la cantidad a retirar: ");
        int request = scanner.nextInt();
        client.goNext(request);
        scanner.close();
    }
}

