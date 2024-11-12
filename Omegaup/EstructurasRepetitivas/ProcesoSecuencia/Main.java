/*
Se lee una secuencia de números enteros naturales
en la cual puede haber repetidos
y que termina con -1
(valor que no se procesa e indica fin de datos)

La secuencia tiene como minimo un número distinto de -1

Si la cantidad de números ingresados es par,
informar el promedio de los mismos con dos decimales de precisión,
y la cantidad de veces que se ingresó en la secuencia
el valor máximo de la misma.

Si la cantidad de números ingresados es impar,
informar la diferencia en valor absoluto entre el máximo y el mínimo,
y la cantidad de veces que se ingresó en la secuencia
el valor mínimo de la misma


Entrada: La entrada viene con un número por línea, y termina con una línea
conteniendo un -1

Salida: La salida consiste de dos lineas, según el enunciado del problema
(la primera puede ser un valor real con 2 dígitos de precisión ó un valor
entero, y la segunda siempre es un valor entero)

Ejemplo

Entrada: 1 2 3 4 5 6 9 8 7 10 -1

Salida: 5.50 1
*/

package ProcesoSecuencia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int maxCount = 0;
        int minCount = 0;

        while (true) {
            int num = scanner.nextInt();
            if (num == -1) {
                break;
            }
            count++;
            sum += num;
            if (num > max) {
                max = num;
                maxCount = 1;
            } else if (num == max) {
                maxCount++;
            }
            if (num < min) {
                min = num;
                minCount = 1;
            } else if (num == min) {
                minCount++;
            }
        }

        scanner.close();

        if (count % 2 == 0) {
            double average = (double) sum / count;
            System.out.printf("%.2f%n", average);
            System.out.println(maxCount);
        } else {
            int diff = Math.abs(max - min);
            System.out.println(diff);
            System.out.println(minCount);
        }
    }
}