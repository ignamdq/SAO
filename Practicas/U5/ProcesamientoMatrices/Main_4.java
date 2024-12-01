package ProcesamientoMatrices;

import java.util.Random;
import java.util.Scanner;

public class Main_4 {
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

        // Mostrar el resultado del Punto 1
        System.out.println("El número " + valor + " aparece " + contador + " veces en las filas impares de la matriz.");

        // Punto 2: Contar columnas con más números pares que impares
        // Contador de columnas que tienen más pares que impares
        int columnasPares = 0;

        // Recorrer las columnas
        for (int j = 0; j < C; j++) {
            int pares = 0;
            int impares = 0;

            // Contar pares e impares en la columna j
            for (int i = 0; i < F; i++) {
                if (matriz[i][j] % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }

            // Si hay más pares que impares en la columna, incrementar el contador
            if (pares > impares) {
                columnasPares++;
            }
        }

        // Mostrar el resultado del Punto 2
        if (columnasPares > 0) {
            System.out.println("Hay " + columnasPares + " columna(s) con más números pares que impares.");
        } else {
            System.out.println("No hay columnas con más números pares que impares.");
        }

        // Punto 3: Contar cuántas filas tienen más de 3 múltiplos de 5
        int filasConMultiplesDe5 = 0;

        // Recorrer las filas para verificar múltiplos de 5
        for (int i = 0; i < F; i++) {
            int multiplesDe5 = 0;

            // Contar cuántos múltiplos de 5 hay en la fila
            for (int j = 0; j < C; j++) {
                if (matriz[i][j] % 5 == 0) {
                    multiplesDe5++;
                }
            }

            // Si la fila tiene más de 3 múltiplos de 5, incrementar el contador
            if (multiplesDe5 > 3) {
                filasConMultiplesDe5++;
            }
        }

        // Mostrar el resultado del Punto 3
        System.out.println("Hay " + filasConMultiplesDe5 + " fila(s) con más de 3 múltiplos de 5.");

        // Punto 4: Contar cuántos números primos hay en la matriz
        int contadorPrimos = 0;

        // Recorrer todos los elementos de la matriz
        for (int i = 0; i < F; i++) {
            for (int j = 0; j < C; j++) {
                if (esPrimo(matriz[i][j])) {
                    contadorPrimos++; // Incrementar el contador si el número es primo
                }
            }
        }

        // Mostrar el resultado del Punto 4
        System.out.println("Hay " + contadorPrimos + " números primos en la matriz.");

        scanner.close();
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
