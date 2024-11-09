/*
Escribir el método SuMulPot(); que reciba 3 argumentos de tipo entero (A, B, C), con A > 0 y B > 0

(a) Si C > 0; SuMulPot(A,B,C) debe retornar la sumatoria de A...B con incrementos de C.
Se trata de sumar secuencialmente los números desde A hasta B, saltando cada C unidades.
Ejemplo: SuMulPot(1, 10, 2) = 1+3+5+7+9

(b) Si C < 0; SuMulPot(A,B,C) debe retornar la productoria de los números de B...A, con decrementos de -C.
Se trata de multiplicar secuencialmente los números desde B hasta A, restando cada −C unidades.
Ejemplo: SuMulPot(1, 18, -3) = 18*15*12*9*6*3

(c) En otro caso, que es cuando C = 0; SuMulPot(A,B,C) debe retornar la mayor de las dos potencias: AB, BA, invocando a la rutina potencia del ejercicio anterior.
Se trata de que la función calcule y devuelve el mayor valor entre A^B, (A elevado a la B) y B^A, (B elevado a la A).

Ejemplo,
si A = 2 y B = 3, A^B = 2^3 = 2*2*2 = 8; B^A = 3^2 = 3 * 3 = 9;
La función entonces retorna el valor mayor entre ambos, que sería 9 en este caso.

Este ejercicio requiere entender el concepto de modularización, es necesario dividir el código en funciones específicas (SuMulPot, potencia), haciéndolo modular y más fácil de mantener y entender. Además, usa conceptos de estructuras de control repetitivas y condicionales.
 * 
*/

package Practicas.U4.SuMulPot;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Ingrese el valor de A (entero positivo): ");
        int A = scanner.nextInt();
        System.out.println("Ingrese el valor de B (entero positivo y mayor que A): ");
        int B = scanner.nextInt();
        System.out.println("Ingrese el valor de C (puede ser positivo o negativo): ");
        int C = scanner.nextInt();

        // Llamada al método SuMulPot y muestra el resultado
        System.out.println("El resultado de SuMulPot(A, B, C) es: " + SuMulPot(A, B, C));

        scanner.close();
    }

    // Método SuMulPot
    public static int SuMulPot(int A, int B, int C) {

        int resultado = 0;

        // (a) Si C > 0, sumatoria de los números de A...B con incrementos de C
        if (C > 0) {
            // Inicia la sumatoria desde 0
            resultado = 0;
            for (int i = A; i <= B; i += C) {
                // Suma el valor actual al resultado
                resultado += i;
            }
        }

        // (b) Si C < 0, productoria de los números de B...A con decrementos de (-C)
        else if (C < 0) {
            // Inicia la productoria desde 1
            resultado = 1;
            for (int i = B; i >= A; i += C) {
                // Multiplica el valor actual al resultado
                resultado *= i;
            }
        }
        // (c) Si C = 0, calcula la mayor de las dos potencias A^B o B^A
        else {
            int potenciaAB = potencia(A, B);
            int potenciaBA = potencia(B, A);

            // Devuelve el mayor de los dos valores
            resultado = Math.max(potenciaAB, potenciaBA);
        }
        return resultado;
    }

    // Método para calcular la potencia de un número
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            // Multiplica la base por sí misma exponente veces
            resultado *= base;
        }
        return resultado;
    }
}