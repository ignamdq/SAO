package ProcesamientoMatrices;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int F, C;

        // dimensiones FXC
        System.out.print("Ingrese el número de filas: ");
        F = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        C = scanner.nextInt();

        // matriz
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
        scanner.close();
    }
}