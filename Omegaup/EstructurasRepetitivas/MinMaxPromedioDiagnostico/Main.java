/*
Elaborar un programa que lea un conjunto de n número enteros,
y devuelva el mínimo, el máximo y el promedio del conjunto de números.

Nota
El promedio debe imprimirse exactamente con dos decimales

Entrada
n
x1, x2, x3... xn

Salida
min(x) max(x) promedio(x)

Ejemplo 1

Entrada
4
3 4 8 7

Salida
3 8 5.50 Descripción min(x)= 3; max(x) = 8; promedio(x) = 5.50

Ejemplo 2

Entrada
2
1 -1

Salida
-1 1 0.00 Descripción min(x)= -1; max(x) = 1; promedio(x) = 0.00
 */

package MinMaxPromedioDiagnostico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            numeros[i] = scanner.nextInt();
        }
        scanner.close();
        int min = numeros[0];
        int max = numeros[0];
        int suma = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] < min) {
                min = numeros[i];
            }
            if (numeros[i] > max) {
                max = numeros[i];
            }
            suma += numeros[i];
        }
        double promedio = (double) suma / n;
        System.out.printf("%d %d %.2f\n", min, max, promedio);
    }
}
