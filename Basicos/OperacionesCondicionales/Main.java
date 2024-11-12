/*
 * Problema: Operaciones Condicionales con Números
 * 
 * Descripción:
 * 
 * Dado un número de pares de enteros, el programa determina si el primer número es múltiplo del segundo.
 * Para cada par de números, si el primer número es múltiplo del segundo, se muestra la suma de ambos.
 * Si no es múltiplo o el segundo número es cero, se muestra el resultado de elevar el primer número a la potencia del segundo.
 * El programa finaliza después de procesar la cantidad de pares especificada por el usuario.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, veces;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de pares de números: ");
        veces = entrada.nextInt();

        for (int i = 0; i < veces; i++) {
            System.out.print("Ingrese el primer número: ");
            n1 = entrada.nextInt();
            System.out.print("Ingrese el segundo número: ");
            n2 = entrada.nextInt();

            if (n2 != 0 && esMultiplo(n1, n2)) {
                System.out.println("La suma: " + suma(n1, n2));
            } else {
                System.out.println("La potencia: " + potencia(n1, n2));
            }
        }
        entrada.close(); // Cierra el scanner para liberar recursos
    }

    public static boolean esMultiplo(int n1, int n2) {
        return n1 % n2 == 0;
    }

    public static int suma(int n1, int n2) {
        return n1 + n2;
    }

    public static int potencia(int n1, int n2) {
        int acumulador = 1;
        for (int i = 0; i < n2; i++) {
            acumulador *= n1;
        }
        return acumulador;
    }
}
