/*
MODULARIZACIÓN

Calculadora

Con el conocimiento que adquirimos hasta el momento, estamos en condiciones de desarrollar uestra primera aplicación con menú de opciones:
una calculadora que constará de diferentes niveles de dificultad.

Calculadora - Nivel I

Crear un programa que contenga un menú de opciones con las operaciones a realizar de una calculadora:

Seleccione una opción:
(1) Sumar
(2) Restar
(3) Multiplicar
(4) Dividir
(9) Cerrar la aplicación

Luego de que el usuario selecciona una operación, se solicita el ingreso de 2 enteros y se retorna el resultado
Al presionar enter se vuelve a visualizar el menú de opciones.

La aplicación termina cuando se elige la opción 9 "Cerrar"

Cada operación deberá implementarse a través de funciones:

(1) Función Sumar
Deberá recibir dos parámetros y retornar la suma del primero (1ro) más el segundo (2do)

(2) Función Restar
Deberá recibir dos parámetros y retornar la resta del primero (1ro) menos el segundo (2do)

(3) Función Multiplicar
Deberá recibir dos parámetros y retornar la multiplicación del primero (1ro) por el segundo (2do)

(4) Función Dividir
Deberá recibir dos parámetros y retornar la división del primero (1ro) entre el segundo (2do)
Recordar que el segundo (2do) parametro !=0

*/

package Practicas.U4.Calculadora;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        // Se define el Scanner con el formato (.) para decimales
        // aunque trabajaremos con enteros
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Menú de opciones
        int opcion;

        // Se muestra el Menú mientras opcion != 9
        do {
            // Menú de opciones
            System.out.println("Calculus, ¡Tu calculadora amiga!");
            System.out.println("=============================");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("9.- Cerrar la aplicación");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            // Lógica según la opción seleccionada
            switch (opcion) {

                // Sumar
                case 1:
                    System.out.print("Ingrese el primer número: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo número: ");

                    int num2 = scanner.nextInt();
                    System.out.println("El resultado de la suma es: " + sumar(num1, num2));

                    break;

                // Restar
                case 2:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado de la resta es: " + restar(num1, num2));

                    break;

                // Multiplicar
                case 3:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();
                    System.out.println("El resultado de la multiplicación es: " + multiplicar(num1, num2));

                    break;

                // Dividir
                case 4:
                    System.out.print("Ingrese el primer número: ");
                    num1 = scanner.nextInt();

                    System.out.print("Ingrese el segundo número: ");
                    num2 = scanner.nextInt();

                    // Verificar si el divisor no es cero
                    if (num2 != 0) {
                        System.out.println("El resultado de la división es: " + dividir(num1, num2));
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }

                    break;
                case 9:

                    // Salir de la aplicación
                    System.out.println("Cerrando la aplicación...");

                    break;

                default:
                    // Opción no válida
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 9);

        scanner.close();
    }

    // Función para sumar dos números
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Función para restar dos números
    public static int restar(int a, int b) {
        return a - b;
    }

    // Función para multiplicar dos números
    public static int multiplicar(int a, int b) {
        return a * b;
    }

    // Función para dividir dos números
    public static double dividir(int a, int b) {
        return (double) a / b;
    }
}
