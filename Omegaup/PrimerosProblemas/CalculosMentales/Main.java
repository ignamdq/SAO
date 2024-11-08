package CalculosMentales;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        double R = scanner.nextDouble();
        scanner.close();
        double resultado1 = R + 5;
        double resultado2 = Math.pow(resultado1, 2);
        double resultado3 = resultado2 / (R / 3);
        double resultado4 = Math.pow(resultado3, 3);
        System.out.printf("%.6f %.6f %.6f %.6f %.6f%n", R, resultado1, resultado2, resultado3, resultado4);
    }
}