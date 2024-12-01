package DosDimensiones;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el número de filas
        System.out.print("Introduce el número de filas: ");
        int filas = scanner.nextInt();

        // Solicitar al usuario el número de columnas
        System.out.print("Introduce el número de columnas: ");
        int columnas = scanner.nextInt();

        // Dibuja el rectángulo
        for (int i = 0; i < filas; i++) { // Bucle para las filas
            for (int j = 0; j < columnas; j++) { // Bucle para las columnas
                System.out.print("*"); // Dibuja un asterisco
            }
            System.out.println(); // Salto de línea al final de cada fila
        }
        scanner.close();
    }
}