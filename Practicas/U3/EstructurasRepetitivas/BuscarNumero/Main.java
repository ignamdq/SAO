/*
 * Realice un programa que encuentre y muestre todos los números de 4 cifras
 * que cumplen la condición de que la suma de las cifras de orden impar es igual a la suma  de las cifras de orden par.
 * 
 * Ejemplo de número que cumple con la condición: 3245 => 3 + 4 = 2 + 5
 * 
 */

package BuscarNumero;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Números de 4 cifras que cumplen la condición:");

        // Recorremos todos los números de 4 cifras (1000 a 9999)
        for (int num = 1000; num <= 9999; num++) {

            // Desglosamos las cifras del número
            int cifra1 = num / 1000; // Primera cifra (miles)
            int cifra2 = (num / 100) % 10; // Segunda cifra (centenas)
            int cifra3 = (num / 10) % 10; // Tercera cifra (decenas)
            int cifra4 = num % 10; // Cuarta cifra (unidades)

            // Sumamos las cifras de orden impar (1ª y 3ª) y las de orden par (2ª y 4ª)
            int sumaImpares = cifra1 + cifra3;
            int sumaPares = cifra2 + cifra4;

            // Verificamos si la suma de cifras impares es igual a la de cifras pares
            if (sumaImpares == sumaPares) {
                System.out.println(num); // Mostramos el número si cumple la condición
            }
        }
        scanner.close();
    }
}
