package ProcesamientoMatrices;

import java.util.Random;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int F, C;

        // Dimensiones de la matriz (F x C)
        System.out.print("Ingrese el número de filas: ");
        F = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        C = scanner.nextInt();

        // Crear la matriz
        int[][] matriz = new int[F][C];

        // Random para generar números aleatorios
        Random random = new Random();

        // Poblar la matriz con valores aleatorios entre 100 y 999
        System.out.println("Matriz generada:");

        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                // Números entre 100 y 999
                matriz[i][j] = random.nextInt(900) + 100;
            }
        }

        // Mostrar la matriz generada
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                System.out.print(matriz[i][j] + "\t"); // Mostrar cada elemento separado por tabulaciones
            }
            // Salto de línea en cada fila
            System.out.println();
        }

        // Punto 1: Contar cuántas veces aparece un número en las filas impares
        System.out.print("\nIngrese un número entre 100 y 999: ");
        int valor = scanner.nextInt();

        // Variable para contar las apariciones en filas impares
        int contador = 0;

        // Recorrer las filas impares (índices 0, 2, 4, ...) de la matriz
        for (int i = 0; i < F; i++) {
            if (i % 2 == 0) { // Solo filas impares (índice 0, 2, 4, ...)
                for (int j = 0; j < C; j++) {
                    if (matriz[i][j] == valor) {
                        contador++; // Incrementar contador si se encuentra el valor
                    }
                }
            }
        }

        // Mostrar el resultado
        System.out.println("El número " + valor + " aparece " + contador + " veces en las filas impares de la matriz.");

        scanner.close();
    }
}
