// Suma de valores
package SumaValores;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 4. Declaración de tres variables: num1, num2 y resultado.
        int num1, num2, resultado;

        // Creación de un objeto Scanner para recibir la entrada del usuario.
        Scanner scanner = new Scanner(System.in);

        // 5. Solicitud de valores al usuario para num1 y num2.
        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextInt();

        // 6. Asignación de la suma de num1 y num2 a la variable resultado.
        resultado = num1 + num2;

        // 7. Muestra por consola el valor de resultado.
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + resultado);

        // Cierre del scanner para evitar fugas de recursos.
        scanner.close();
    }
}
