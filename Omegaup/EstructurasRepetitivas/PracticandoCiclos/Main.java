/*
Dada una variable con valor inicial N y dos constantes A, B haz un programa que:

Mientras el valor de N sea menor que 100:

(a) Imprime los enteros de 1 a N
(b) Imprime los enteros de N a 1
(c) Con el valor actual de N, calcula un entero auxiliar T = A X N
(d) Mientras N < T súmale B a N

Entrada
Tres enteros N, A, B puedes suponer que 2 <= N, A, B <= 150

Salida
Una secuencia de enteros separados por espacios que es la salida producida
tras ejecutar el programa

Ejemplo

Entrada:
12 3 17

Salida:
1 2 3 4 5 6 7 8 9 10 11 12 12 11 10
9 8 7 6 5 4 3 2 1 1 2 3 4 5 6 7 8 9
10 11 12 13 14 15 16 17 18 19 20 21
22 23 24 25 26 27 28 29 30 31 32 33
34 35 36 37 38 39 40 41 42 43 44 45
46 46 45 44 43 42 41 40 39 38 37 36
35 34 33 32 31 30 29 28 27 26 25 24
23 22 21 20 19 18 17 16 15 14 13 12
11 10 9 8 7 6 5 4 3 2 1

*/

package PracticandoCiclos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        scanner.close();
        while (N < 100) {
            for (int i = 1; i <= N; i++) {
                System.out.print(i);
                if (i < N)
                    System.out.print(" ");
            }
            System.out.println();
            for (int i = N; i >= 1; i--) {
                System.out.print(i);
                if (i > 1)
                    System.out.print(" ");
            }
            System.out.println();
            int T = A * N;
            while (N < T) {
                N += B;
            }
        }
    }
}