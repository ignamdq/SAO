// Calcular el presupuesto para la comida durante las vacaciones
package PresupuestoVacaciones;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // (a) Almacenamos la cantidad de días que vas a estar de viaje.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días que va a estar de viaje: ");
        int diasDeViaje = scanner.nextInt(); // Guardamos los días del viaje en la variable

        // (b) Estimamos el presupuesto máximo para todo el viaje.
        System.out.print("Ingrese su presupuesto máximo para el viaje: ");
        double presupuestoMaximo = scanner.nextDouble(); // Guardamos el presupuesto total

        // (c) Estimamos cuántas comidas vas a tener en todo tu viaje.
        System.out.print("Ingrese la cantidad de comidas que estima tener durante su viaje: ");
        int comidasTotales = scanner.nextInt(); // Guardamos el total de comidas

        // (d) Calculamos cuánto puedes gastar en cada comida.
        // El 80% del presupuesto es lo destinado para las comidas
        double presupuestoComida = presupuestoMaximo * 0.80;

        // Calculamos cuánto se puede gastar por comida
        double gastoPorComida = presupuestoComida / comidasTotales;

        // (e) Mostramos el resultado en consola con dos decimales.
        // Formateamos el gasto por comida y el presupuesto con dos decimales
        System.out.printf(
                "Podés gastar $%.2f en cada comida para que te alcance la plata durante los %d días de viaje.%n",
                gastoPorComida, diasDeViaje);

        // Cerramos el scanner para liberar recursos.
        scanner.close();
    }
}
