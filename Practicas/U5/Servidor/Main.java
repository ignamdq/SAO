package Servidor;

import java.util.Scanner;

public class Main {

    public static final int FILAS = 5;
    public static final int COLUMNAS = 5;

    public static void main(String[] args) {
        int[][] correo = {
                { 10, 20, 30, 40, 50 },
                { 5, 15, 25, 35, 45 },
                { 2, 4, 6, 8, 10 },
                { 12, 24, 36, 48, 60 },
                { 7, 14, 21, 28, 35 }
        };

        System.out.println("Matriz de tráfico de correo (5x5):");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(correo[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTotal de correo enviado por cada servidor:");
        calcularTotalEnviado(correo);

        int servidorMayor = servidorMasEnvio(correo);
        System.out.println("\nServidor que ha enviado más correo: Servidor " + servidorMayor);

        Scanner scanner = new Scanner(System.in);
        int cotaM = -1;

        // Validación de la entrada
        while (cotaM < 0) {
            System.out.print("\nIngrese la cota M para filtrar los servidores que recibieron más correo: ");
            if (scanner.hasNextInt()) {
                cotaM = scanner.nextInt();
                if (cotaM < 0) {
                    System.out.println("Por favor, ingrese un número mayor o igual a 0.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar el buffer
            }
        }

        mostrarServidoresRecibieronMasDeM(correo, cotaM);

        scanner.close();
    }

    public static void calcularTotalEnviado(int[][] correo) {
        for (int i = 0; i < FILAS; i++) {
            int totalEnviado = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                totalEnviado += correo[i][j];
            }
            System.out.println("Servidor " + i + ": " + totalEnviado + " kb");
        }
    }

    public static int servidorMasEnvio(int[][] correo) {
        int maxEnvio = 0;
        int servidor = 0;
        for (int i = 0; i < FILAS; i++) {
            int totalEnviado = 0;
            for (int j = 0; j < COLUMNAS; j++) {
                totalEnviado += correo[i][j];
            }
            if (totalEnviado > maxEnvio) {
                maxEnvio = totalEnviado;
                servidor = i;
            }
        }
        return servidor;
    }

    public static void mostrarServidoresRecibieronMasDeM(int[][] correo, int cotaM) {
        System.out.println("\nServidores que recibieron más de " + cotaM + " kb:");
        for (int j = 0; j < COLUMNAS; j++) {
            int totalRecibido = 0;
            for (int i = 0; i < FILAS; i++) {
                totalRecibido += correo[i][j];
            }
            if (totalRecibido > cotaM) {
                System.out.println("Servidor " + j + ": " + totalRecibido + " kb");
            }
        }
    }
}
