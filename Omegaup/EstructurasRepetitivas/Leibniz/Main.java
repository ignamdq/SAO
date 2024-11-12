/*
Se lee un valor N entero por teclado que está en el rango [1..250000].

Ese valor entero indica la cantidad de términos que se deben incluir para calcular la siguiente sumatoria:

PI/4 = 1 - (1/3) + (1/5) - (1/7) + (1/9)...

Observación: todas las variables reales empleadas en el codigo se declaran como double.

Entrada
La entrada tiene una única línea con un único valor entero N

Salida
La salida consiste de una única línea con un solo valor que es la aproximación del valor de PI, con 8 dígitos de precisión, cuando se calcula con N términos.

Entrada	Salida
2
2.66666667

*/

package Leibniz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        double sumatoria = 0.0;

        for (int i = 0; i < N; i++) {
            double termino = 1.0 / (2 * i + 1);
            if (i % 2 == 0) {
                sumatoria += termino;
            } else {
                sumatoria -= termino;
            }
        }

        double piAproximado = sumatoria * 4;
        System.out.printf("%.8f\n", piAproximado);
    }
}
