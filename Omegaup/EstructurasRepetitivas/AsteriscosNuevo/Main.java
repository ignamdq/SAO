/*
 Realiza un programa que reciba un entero N e imprima una pirámide
 de asteriscos de altura N.
 
 Vea los ejemplos de entrada y salida.
 
 Entrada
 Un solo entero N.
 
 Salida
 Una pirámide de asteriscos de altura N.
 */

package AsteriscosNuevo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
