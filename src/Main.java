import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double saldo = 1599.99;
        int opcion;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    Escriba el número de la opción deseada:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    9. Salir
                    """);
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Su saldo es: $"+saldo);
                    break;
                case 2:
                    double retiro;
                    System.out.println("Ingrese el monto a retirar");
                    retiro = input.nextDouble();
                    if (retiro > saldo){
                        System.out.println("Saldo insuficiente.");
                    }
                    else {
                        saldo-=retiro;
                        System.out.println("Su nuevo saldo es: $"+saldo);
                    }
                    break;
                case 3:
                    double deposito;
                    System.out.println("Ingrese el monto a DEPOSITAR:");
                    deposito = input.nextDouble();
                    saldo+=deposito;
                    System.out.println("Su nuevo saldo es: $"+saldo);
                    break;
                case 9:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            if (opcion == 9){
                break;
            }
        }
    }
}
