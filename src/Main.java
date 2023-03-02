import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        int numero = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el número: ");
        numero = scanner.nextInt();
        System.out.println("los números primos son : ");
        Primos primos = new Primos(numero);
        for (int n = numero; n>0; n--)
            primos.imprimirPrimos(n);

    }
}
