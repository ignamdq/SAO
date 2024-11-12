/*
Parte 1. Consigna
Se leen 10 valores enteros menores que 30. Luego se leen valores enteros positivos hasta que la suma de los dígitos de uno de los valores leídos,sea igual a alguno de los 10 valores inicialmente leídos. Informar el número que cumplió esta condición.

Parte 2. Comprensión de la consigna
(a) Leer 10 valores enteros menores que 30:
la condicion es -inf < ValorInicial < 30
Valores iniciales:
1, 6, 25, 18, 23, 2, 6, 19, 14, 13

(b) Leer valores enteros positivos adicionales y sumar de sus dígitos.
Valores adicionales:
(1) 9425 = 9 + 4 + 2 + 5 = 20; no cumple
(2) 340 = 3 + 4+ 0 = 7; no cumple
(3) 694 = 6 + 9 + 4 = 19; CUMPLE

*/

package SumaCoincidencia;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Array para almacenar los 10 valores iniciales menores que 30
        int[] valoresIniciales = new int[10];
        System.out.println("Ingrese 10 valores enteros menores que 30:");

        // Leer 10 valores enteros menores que 30
        for (int i = 0; i < 10; i++) {
            int valor;

            // Validacion: mientras valor >= 30 (sea mayor o igual a 30) se lanza un mensaje
            do {
                System.out.print("Valor " + (i + 1) + ": ");
                valor = scanner.nextInt();
                if (valor >= 30) {
                    System.out.println("Por favor, ingrese un valor menor que 30.");
                }
            } while (valor >= 30);

            /*
             * Validacion:
             * mientras valor >= 30 no se almacenará nada en valoresIniciales[i];
             */
            valoresIniciales[i] = valor;
        }

        System.out.println(
                "\nIngrese valores enteros positivos hasta encontrar uno cuya suma de dígitos coincida con alguno de los valores iniciales.");

        // numeroEncontrado se inicializa como (-1)
        int numeroEncontrado = -1;

        // mientras numeroEncontrado sea
        while (numeroEncontrado == -1) {

            System.out.print("Ingrese un valor entero positivo: ");
            int valorPositivo = scanner.nextInt();

            // Validar entrada del user
            if (valorPositivo <= 0) {
                System.out.println("Debe ingresar un número positivo.");
                continue;
            }

            // Llamada a sumarDigitos
            int sumaDigitos = sumarDigitos(valorPositivo);

            // Para cada valor en valoresIniciales
            for (int valor : valoresIniciales) {

                // Si la suma es igual al valor
                if (sumaDigitos == valor) {

                    // se asigna valorPositivo a numeroEncontrado
                    numeroEncontrado = valorPositivo;
                    break;
                }
            }
        }

        // Informar el número que cumplió la condición
        System.out.println("El número que cumple la condición es: " + numeroEncontrado);

        scanner.close();
    }

    /**
     * Método para sumar los dígitos de un número.
     * 
     * @param numero Número del cual se sumarán los dígitos.
     * @return La suma de los dígitos.
     */
    public static int sumarDigitos(int numero) {
        int suma = 0;
        while (numero > 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }
}
