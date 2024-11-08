package FormulasRaras;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double PI = Math.PI;
        double x = entrada.nextDouble();
        double y = entrada.nextDouble();
        double z = entrada.nextDouble();
        double numerador = x + x * (y + Math.pow(z, 2));
        double denominador = (x + PI) * (y + PI);
        double resultado = numerador / denominador;
        System.out.printf("%.6f%n", resultado);
        entrada.close();
    }
}