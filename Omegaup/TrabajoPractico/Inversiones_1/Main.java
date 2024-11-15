package Inversiones_1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int appRecomendada = 0;
        int cantAplicacion;
        double montoAInvertir;
        double mayorRetorno = 0.0;

        Scanner teclado = new Scanner(System.in).useLocale(Locale.US);

        montoAInvertir = teclado.nextDouble();
        cantAplicacion = teclado.nextInt();

        for (int i = 1; i <= cantAplicacion; i++) {
            double tasaNominal = teclado.nextDouble();
            double topeInversion = teclado.nextDouble();

            double retornoActual = calcularInteresDiario(montoAInvertir, tasaNominal, topeInversion);

            if (retornoActual > mayorRetorno) {
                mayorRetorno = retornoActual;
                appRecomendada = i;
            }
        }
        System.out.println(appRecomendada);
        teclado.close();
    }

    public static double calcularInteresDiario(double montoInversion, double tasaNominal, double topeInversion) {

        double montoAInvertirFinal = (topeInversion != -1 && montoInversion > topeInversion) ? topeInversion
                : montoInversion;
        return (tasaNominal / 365) * montoAInvertirFinal;
    }
}