// # Parte 5: Omega (1)

package Inversiones_2;

import java.util.Locale;
import java.util.Scanner;

public class Main_2_5 {
    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // capitalDisponible
        // System.out.print("Ingresar capitalDisponible: ");
        int capitalDisponible = scanner.nextInt();

        // Espacio
        // System.out.println(" ");

        // cantidadAplicacionesEvaluar
        // System.out.print("Ingresar cantidadAplicacionesEvaluar: ");
        int cantidadAplicacionesEvaluar = scanner.nextInt();

        // Espacio
        // System.out.println(" ");

        // Arrays
        double[] tasasNominales = new double[cantidadAplicacionesEvaluar];
        double[] inversionTopes = new double[cantidadAplicacionesEvaluar];
        double[] montosPermitidos = new double[cantidadAplicacionesEvaluar];
        double[] interesesDiarios = new double[cantidadAplicacionesEvaluar];

        for (int i = 0; i < cantidadAplicacionesEvaluar; i++) {

            // cada tasaNominal de tasasNominales[i]
            // System.out.print("tasaNominal " + (i + 1) + "º App: ");
            tasasNominales[i] = scanner.nextDouble();

            // cada topeInversion de inversionTopes[i]
            // System.out.print("topeInversión o (-1) si no tiene " + (i + 1) + "º App: ");
            inversionTopes[i] = scanner.nextDouble();

            // inversionTopes
            montosPermitidos[i] = calculoInversion(capitalDisponible, inversionTopes[i]);

            // Calculamos el interés diario y lo almacenamos en el array de interesesDiarios
            interesesDiarios[i] = calcularInteresDiario(tasasNominales[i], montosPermitidos[i]);

            // Espacio
            // System.out.println(" ");

        }
        // CONSOLA
        // System.out.println("----------------");
        // System.out.println("Datos ingresados");
        // System.out.println(" ");
        // System.out.printf("capitalDisponible: %.2f%n", (double) capitalDisponible);
        // System.out.println(" ");

        // 2do Bucle imprimo por consola
        // for (int i = 0; i < cantidadAplicacionesEvaluar; i++) {
        // System.out.println("App " + (i + 1) + ":");
        // System.out.printf("tasaNominal: %.2f%n", tasasNominales[i]);
        // System.out.printf("topeInversion: %.2f%n", inversionTopes[i]);
        // System.out.printf("montoPermitido: %.2f%n", montosPermitidos[i]);
        // System.out.printf("Interés Diario: %.2f%n", interesesDiarios[i]);
        // System.out.println(" ");
        // }

        // Buscar el índice de la aplicación con el mayor interés
        int mejorAplicacion = 0;
        double maxInteres = interesesDiarios[0];

        for (int i = 1; i < cantidadAplicacionesEvaluar; i++) {
            if (interesesDiarios[i] > maxInteres) {
                maxInteres = interesesDiarios[i];
                mejorAplicacion = i;
            }
        }

        // Imprimir la mejor aplicación
        // System.out.println("La mejor aplicación para invertir es la App " +
        // (mejorAplicacion + 1));
        System.out.println((mejorAplicacion + 1));
        // System.out.printf("Interés Diario: %.2f%n", maxInteres);

        scanner.close();
    }

    public static double calculoInversion(double capitalDisponible, double topeInversion) {

        return ((topeInversion == -1 || capitalDisponible <= topeInversion)
                ? capitalDisponible
                : Math.min(capitalDisponible, topeInversion));
    }

    public static double calcularInteresDiario(double tasaNominal, double montoInvertido) {
        return (tasaNominal / 365) * montoInvertido;
    }
}