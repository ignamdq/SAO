/*
 * Dadas dos secuencias de N enteros, escribe un programa que reimprima las
 * secuencias pero omitiendo los enteros que aparecen en ambas secuencias.
 * El orden de aparición de los enteros debe conservarse.
 * 
 * Entrada
 * Un entero N seguido de dos líneas donde cada una tiene N enteros.
 * 
 * Puedes suponer que 0 <= N <= 100000 y que los enteros de las secuencias están
 * en el rango de -10^9 a 10^9
 * 
 * 
 * alida
 * Dos líneas que contengan las secuencias de enteros originales pero omitiendo
 * los enteros que aparecen en ambas secuencias.
 * 
 * Entrada:
 * 5
 * 1 2 3 2 -1
 * 3 1 4 1 6
 * 
 * Salida:
 * 2 2 -1
 * 4 6
 * 
 */

package OmitiendoInterseccion;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        HashSet<Integer> secuencia1 = new HashSet<>();
        HashSet<Integer> interseccion = new HashSet<>();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
            secuencia1.add(arr1[i]);
        }
        scanner.nextLine();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
            if (secuencia1.contains(arr2[i])) {
                interseccion.add(arr2[i]);
            }
        }
        StringBuilder output1 = new StringBuilder();
        for (int num : arr1) {
            if (!interseccion.contains(num)) {
                output1.append(num).append(" ");
            }
        }
        System.out.println(output1.toString().trim());
        StringBuilder output2 = new StringBuilder();
        for (int num : arr2) {
            if (!interseccion.contains(num)) {
                output2.append(num).append(" ");
            }
        }
        System.out.println(output2.toString().trim());
        scanner.close();
    }
}