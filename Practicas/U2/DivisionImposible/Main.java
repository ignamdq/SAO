package DivisionImposible;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número (X): ");
        int x = scanner.nextInt();

        System.out.print("Ingrese el segundo número (Y): ");
        int y = scanner.nextInt();

        if (y == 0) {
            System.out.println("División imposible");
        } else {

            double resultado = (double) x / y;
            System.out.printf("El resultado de %d dividido por %d es: %.1f%n", x, y, resultado);
        }

        scanner.close();
    }
}
