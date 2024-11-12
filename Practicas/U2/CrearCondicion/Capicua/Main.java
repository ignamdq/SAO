// El código es válido si se trata de un número entero de 3 dígitos y capicúa.
// Capicúa un numero que se lee igual de izquierda a derecha y viceversa.

package Capicua;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un código de 3 dígitos: ");
        int codigo = scanner.nextInt();

        scanner.close();

        // La variable esValido verifica dos condiciones:
        boolean esValido =

                // (a) que el código tenga 3 dígitos
                // debe ser mayor o igual a 100 y menor o igual que 999
                (codigo >= 100 && codigo <= 999) &&

                // (b) que el código sea un número capicúa
                // (codigo / 100), da la centena
                // (codigo % 100) / 10) * 10, da la decena
                // (codigo % 10) * 100), da la unidad
                        (codigo == (codigo / 100) + ((codigo % 100) / 10) * 10 + (codigo % 10) * 100);

        // Si las dos condiciones se cumplen el codigo es válido
        System.out.println("¿Es un código válido? " + esValido);

    }
}