/*
Una compañía desea transmitir datos por teléfono pero está preocupada de que sus teléfonos estén "pinchados".
Todos sus datos se transmiten como enteros de cuatro dígitos.

Escribir un método que cifre los datos para poderlos transmitir con mayor seguridad.
Dicha rutina deberá recibir un entero de 4 dígitos y retornarlo cifrado como sigue:

(a) Sustituir cada dígito por (ese_digito+7)%10.
(b) Luego intercambiar el primer y tercer dígitos luego el segundo y cuarto dígitos.

Ejemplo: cifrar(2345) debe retornar 1290.
*/

package Practicas.U4.Cifrador;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese un número entero de 4 dígitos para cifrar: ");

        int numero = scanner.nextInt();

        // Verificar si el número tiene 4 dígitos
        if (numero >= 1000 && numero <= 9999) {

            // Llamar al método cifrar y mostrar el resultado
            int numeroCifrado = cifrar(numero);

            System.out.println("El número cifrado es: " + numeroCifrado);
        } else {
            System.out.println("Por favor, ingrese un número de exactamente 4 dígitos.");
        }
        scanner.close();
    }

    // Método para cifrar un número de 4 dígitos
    public static int cifrar(int numero) {

        // Extraer los dígitos individuales del número
        int digito1 = (numero / 1000) % 10; // Primer dígito
        int digito2 = (numero / 100) % 10; // Segundo dígito
        int digito3 = (numero / 10) % 10; // Tercer dígito
        int digito4 = numero % 10; // Cuarto dígito

        // Cifrar cada dígito sumando 7 y aplicando módulo 10
        digito1 = (digito1 + 7) % 10;
        digito2 = (digito2 + 7) % 10;
        digito3 = (digito3 + 7) % 10;
        digito4 = (digito4 + 7) % 10;

        // Intercambiar el primer dígito con el tercer dígito y el segundo con el cuarto
        int temp = digito1;
        digito1 = digito3;
        digito3 = temp;

        temp = digito2;
        digito2 = digito4;
        digito4 = temp;

        // Construir el número cifrado combinando los dígitos intercambiados
        int numeroCifrado = digito1 * 1000 + digito2 * 100 + digito3 * 10 + digito4;

        return numeroCifrado;
    }
}