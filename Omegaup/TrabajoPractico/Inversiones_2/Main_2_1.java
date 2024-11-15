// # Parte 1: Entradas y Salidas

package Inversiones_2;

import java.util.Locale;
import java.util.Scanner;

public class Main_2_1 {
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // montoDisponible
        System.out.print("Ingresar montoDisponible: ");
        int montoDisponible = scanner.nextInt();

        // Espacio
        System.out.println(" ");

        // cantidadAplicacionesEvaluar
        System.out.print("Ingresar cantidadAplicacionesEvaluar: ");
        int cantidadAplicacionesEvaluar = scanner.nextInt();

        // Espacio
        System.out.println(" ");

        // Arrays
        double[] tasasNominales = new double[cantidadAplicacionesEvaluar];
        double[] topesInversion = new double[cantidadAplicacionesEvaluar];

        // 1er Bucle
        for (int i = 0; i < cantidadAplicacionesEvaluar; i++) {

            // tasaNominal en tasasNominales[i]
            System.out.print("tasaNominal " + (i + 1) + "º App: ");
            tasasNominales[i] = scanner.nextDouble();

            // topeInversion
            System.out.print("topeInversión o (-1) si no tiene " + (i + 1) + "º App: ");
            topesInversion[i] = scanner.nextDouble();

            // Espacio
            System.out.println(" ");
        }

        // 2do Bucle imprimo por consola
        System.out.println("----------------");
        System.out.println("Datos ingresados");
        System.out.println(" ");
        System.out.println("montoDisponible: " + montoDisponible);
        System.out.println(" ");
        for (int i = 0; i < cantidadAplicacionesEvaluar; i++) {
            System.out.println("App " + (i + 1) + ":");
            System.out.println("tasaNominal: " + tasasNominales[i]);
            System.out.println("topeInversión: " + topesInversion[i]);
            System.out.println(" ");
        }

        scanner.close();
    }
}