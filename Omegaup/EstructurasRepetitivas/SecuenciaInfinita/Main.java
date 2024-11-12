/*
Escribe los primeros N enteros de lasecuencia infinita: 1 2 3 4 5 4 3 2 1 2 3 4 5 4 3 2 1 2 3 4 5 ...

Entrada
Un entero N. Puedes suponer que 0 <= N <= 1000

Salida
Los primeros N enteros de la secuencia descrita

Ejemplo

Entrada: 0
Salida:

Entrada: 1
Salida: 1

Entrada: 1
Salida: 1

Entrada: 7
Salida: 1 2 3 4 5 4 3

Entrada: 13
Salida: 1 2 3 4 5 4 3 2 1 2 3 4 5

2 3 4 5 4 3 2 1 2 3 4 5
2 3 4 5 4 3 2 1 2 3 4 5
 */

package SecuenciaInfinita;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un entero N (0 <= N <= 1000): ");
        int N = scanner.nextInt();

        // Secuencia patrón: 1 2 3 4 5 4 3 2
        int[] patron = { 1, 2, 3, 4, 5, 4, 3, 2 };
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < N; i++) {
            resultado.append(patron[i % patron.length]).append(" ");
        }

        System.out.println(resultado.toString().trim());
        scanner.close();
    }
}
