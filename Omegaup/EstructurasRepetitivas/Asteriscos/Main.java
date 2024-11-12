/*
Realizar un programa que reciba dos enteros N y M e imprima un rectánculo de tamaño N x M asteriscos.

Entrada
Dos enteros N y M.

Salida
Un rectángulo de tamaño N renglones por M columnas.
 */

package Asteriscos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
