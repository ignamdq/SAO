// # Parte 5: Omega (2) - Final

package Inversiones_2;

import java.util.Locale;
import java.util.Scanner;

public class Main_2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int capitalDisponible = scanner.nextInt();
        int cantidadAplicacionesEvaluar = scanner.nextInt();
        double[] tasasNominales = new double[cantidadAplicacionesEvaluar];
        double[] inversionTopes = new double[cantidadAplicacionesEvaluar];
        double[] montosPermitidos = new double[cantidadAplicacionesEvaluar];
        double[] interesesDiarios = new double[cantidadAplicacionesEvaluar];
        for (int i = 0; i < cantidadAplicacionesEvaluar; i++) {
            tasasNominales[i] = scanner.nextDouble();
            inversionTopes[i] = scanner.nextDouble();
            montosPermitidos[i] = calculoInversion(capitalDisponible, inversionTopes[i]);
            interesesDiarios[i] = calcularInteresDiario(tasasNominales[i], montosPermitidos[i]);

        }
        int mejorAplicacion = 0;
        double maxInteres = interesesDiarios[0];

        for (int i = 1; i < cantidadAplicacionesEvaluar; i++) {
            if (interesesDiarios[i] > maxInteres) {
                maxInteres = interesesDiarios[i];
                mejorAplicacion = i;
            }
        }
        System.out.println((mejorAplicacion + 1));
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