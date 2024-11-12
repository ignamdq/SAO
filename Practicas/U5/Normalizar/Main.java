/*
¿Qué es "Normalizar"?

Normalizar es un proceso que transforma los valores de un conjunto de datos para que estén en un rango estándar o específico, generalmente entre 0 y 100 o 0 y 1.
Esto se hace para facilitar comparaciones entre valores de diferentes escalas o para simplificar el análisis de los datos.
En este caso, la normalización se realiza para ajustar los valores del vector en función de su mínimo y máximo,

usando la fórmula: (X[i] - Min) * 100 / (Max - Min)

donde "Min" es el valor mínimo del vector y "Max" es el valor máximo.

Ejemplo
Para el vector `x` de `n` elementos numéricos reales, cada componente `X[I]` se reemplaza según la fórmula.
Esto transforma el vector para que todos los valores estén entre 0 y 100.

 */

package Normalizar;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Solicitar el tamaño del vector
        System.out.print("Ingrese la cantidad de elementos del vector: ");
        int n = scanner.nextInt();
        double[] vector = new double[n];

        // Ingreso de los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextDouble();
        }

        // Mostrar vector original y normalizado
        System.out.println("\nVector original: " + Arrays.toString(vector));
        double[] vectorNormalizado = normalizar(vector);
        System.out.println("Vector normalizado: " + Arrays.toString(vectorNormalizado));

        // Cerrar el scanner
        scanner.close();
    }

    /**
     * Método para normalizar un vector de números reales
     *
     * @param vector El vector original
     * @return Un nuevo vector con los valores normalizados
     */
    public static double[] normalizar(double[] vector) {
        double min = encontrarMin(vector);
        double max = encontrarMax(vector);

        // Crear un nuevo vector para almacenar los valores normalizados
        double[] vectorNormalizado = new double[vector.length];

        // Normalizar cada elemento del vector
        for (int i = 0; i < vector.length; i++) {
            vectorNormalizado[i] = (vector[i] - min) * 100 / (max - min);
        }

        return vectorNormalizado;
    }

    /**
     * Método para encontrar el valor mínimo en el vector
     *
     * @param vector El vector de números
     * @return El valor mínimo
     */
    public static double encontrarMin(double[] vector) {
        double min = vector[0];
        for (double v : vector) {
            if (v < min) {
                min = v;
            }
        }
        return min;
    }

    /**
     * Método para encontrar el valor máximo en el vector
     *
     * @param vector El vector de números
     * @return El valor máximo
     */
    public static double encontrarMax(double[] vector) {
        double max = vector[0];
        for (double v : vector) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
}