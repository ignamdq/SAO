/*
Escribir un programa que, dados dos valores enteros v1 y v2, muestre los números impares que existen en el rango [v1, v2], en orden descendente.

Ejemplo:
Entrada: 37 52
Salida: 51, 49, 47, 45, 43, 41, 39, 37
*/

package NumerosImparesDescendentes;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int v1, v2;

        System.out.print("Ingrese el primer valor (v1): ");
        v1 = scanner.nextInt(); // Leer el valor de v1

        System.out.print("Ingrese el segundo valor (v2): ");
        v2 = scanner.nextInt(); // Leer el valor de v2

        if (v1 > v2) {
            System.out.println("El primer valor debe ser menor o igual al segundo valor.");
        } else {
            System.out.print("Los números impares en el rango [" + v1 + ", " + v2 + "] son: ");

            if (v2 % 2 == 0) {
                v2--;
            }

            for (int i = v2; i >= v1; i -= 2) {
                System.out.print(i);
                if (i > v1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
