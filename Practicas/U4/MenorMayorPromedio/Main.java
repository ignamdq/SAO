/*
 * Escribir un programa que muestre un menú de opciones y permita elegir entre las operaciones menor, mayor, promedio y suma de 3 números enteros.
 * Completar los métodos faltantes al código provisto por la cátedra (SaoEjercicio1.java)
*/

package Practicas.U4.MenorMayorPromedio;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        int num1 = 0, num2 = 0, num3 = 0;

        // Menú
        do {
            System.out.println("Seleccione su opción:");
            System.out.println("1. Menor de los tres números");
            System.out.println("2. Mayor de los tres números");
            System.out.println("3. Promedio de los tres números");
            System.out.println("4. Suma de los tres números");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Si el usuario elige una opción válida (1-4), pedimos los tres números
            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingrese el primer número: ");
                num1 = scanner.nextInt();
                System.out.print("Ingrese el segundo número: ");
                num2 = scanner.nextInt();
                System.out.print("Ingrese el tercer número: ");
                num3 = scanner.nextInt();
            }

            // Evaluamos la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("El menor de los tres números es: " + menor(num1, num2, num3));
                    break;
                case 2:
                    System.out.println("El mayor de los tres números es: " + mayor(num1, num2, num3));
                    break;
                case 3:
                    System.out.println("El promedio de los tres números es: " + promedio(num1, num2, num3));
                    break;
                case 4:
                    System.out.println("La suma de los tres números es: " + suma(num1, num2, num3));
                    break;
                case 9:
                    System.out.println("Saliendo de la aplicación...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }

        } while (opcion != 9); // Continuar hasta que se elija la opción 9 para salir

        scanner.close();
    }

    public static int menor(int num1, int num2, int num3) {
        int menor = num1;
        if (num2 < menor)
            menor = num2;
        if (num3 < menor)
            menor = num3;
        return menor;
    }

    public static int mayor(int num1, int num2, int num3) {
        int mayor = num1;
        if (num2 > mayor)
            mayor = num2;
        if (num3 > mayor)
            mayor = num3;
        return mayor;
    }

    public static double promedio(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;
    }

    public static int suma(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
