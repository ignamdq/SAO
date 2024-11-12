/*
Calcula la suma de los N primeros términos de la serie periódica:

1 2 3 1 2 3 1 2 3

Entrada
Un entero N. Puedes suponer que 0 <= n <= 10^9

Salida
Un entero que sea el valor de la suma solicitada.

Ejemplo 1
Entrada: 0
Salida: 0

Ejemplo 2
Entrada: 1
Salida: 1

Ejemplo 3
Entrada: 2
Salida: 3

Ejemplo 4
Entrada: 3
Salida: 6

Ejemplo 5
Entrada: 15625
Salida: 31249

 */

package SeriePeriodica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        scanner.close();
        int sumaSecuencia = 6;
        long secuenciasCompletas = N / 3;
        int terminosRestantes = (int) (N % 3);
        long sumaTotal = secuenciasCompletas * sumaSecuencia;
        if (terminosRestantes == 1) {
            sumaTotal += 1;
        } else if (terminosRestantes == 2) {
            sumaTotal += 1 + 2;
        }
        System.out.println(sumaTotal);
    }
}
