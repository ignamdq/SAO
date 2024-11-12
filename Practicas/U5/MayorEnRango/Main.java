/*
Escribir la función int mayor(int A[ ],int inf, int sup), que recibe un arreglo de N enteros y dos valores enteros inf y sup.
La función regresa el mayor valor del arreglo dentro del rango definido por inf y sup.
*/

package MayorEnRango;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar al usuario ingresar el tamaño del arreglo y sus elementos
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int[] A = new int[n];

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Solicitar al usuario ingresar el rango inf y sup
        System.out.print("Ingrese el índice inferior (inf) del rango: ");
        int inf = scanner.nextInt();

        System.out.print("Ingrese el índice superior (sup) del rango: ");
        int sup = scanner.nextInt();

        // Validar los índices inf y sup
        if (inf < 0 || sup >= n || inf > sup) {
            System.out.println("Rango inválido. Asegúrese de que inf <= sup y dentro del tamaño del arreglo.");
        } else {
            // Llamada a la función mayor y mostrar el resultado
            System.out.println("El valor mayor en el rango dado es: " + mayor(A, inf, sup));
        }

        // Cerrar el scanner
        scanner.close();
    }

    /**
     * Función que encuentra el valor max en el arreglo dentro de un rango
     * específico
     * 
     * @param A   El arreglo de enteros
     * @param inf El índice inferior del rango
     * @param sup El índice superior del rango
     * @return El valor máximo encontrado en el rango [inf, sup]
     */

    public static int mayor(int[] A, int inf, int sup) {
        // Inicializar con el primer valor en el rango
        int max = A[inf];

        // Recorrer el arreglo desde inf hasta sup y encontrar el mayor valor
        for (int i = inf + 1; i <= sup; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }

        // Retornar el valor máximo encontrado en el rango
        return max;
    }
}
