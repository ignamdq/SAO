/*
Dado un entero inicial N repetirás el siguiente proceso
mientras N sea menor que 100
si N es par le sumarás 3
y en caso contrario lo multiplicarás por 2

¿Cuál será el valor de N al terminar el proceso?

Entrada

Un entero N, puedes suponer que N >=1

Salida
Un entero que sea el valor de N al terminar el proceso.

Ejemplo

Entrada: 5
Salida: 122

Entrada: 105
Salida: 105

 */
package ProcesoIterativo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        while (N < 100) {
            if (N % 2 == 0) {
                N += 3;
            } else {
                N *= 2;
            }
        }
        System.out.println(N);
    }
}