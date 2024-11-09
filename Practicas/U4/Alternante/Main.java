package Practicas.U4.Alternante;

public class Main {

    public static void main(String[] args) {

        // Puedes cambiar este número para probar otros casos o pedir al user
        int numero = 18307;

        if (esAlternante(numero)) {
            System.out.println(numero + " es un número alternante.");
        } else {
            System.out.println(numero + " no es un número alternante.");
        }
    }

    /**
     * Método que verifica si un número es alternante
     * 
     * @param numero El número entero positivo a verificar
     * @return true si el número es alternante, false en caso contrario
     */

    public static boolean esAlternante(int numero) {

        // Obtener el último dígito y determinar si es par o impar
        int digitoAnterior = numero % 10;
        boolean esParAnterior = (digitoAnterior % 2 == 0);

        // Dividir el número entre 10 para avanzar al siguiente dígito
        numero /= 10;

        // Iterar sobre los dígitos restantes
        while (numero > 0) {
            int digitoActual = numero % 10; // Obtener el siguiente dígito
            boolean esParActual = (digitoActual % 2 == 0);

            // Comprobar si el paridad de los dígitos no alterna
            if (esParActual == esParAnterior) {
                return false; // Si dos dígitos consecutivos tienen la misma paridad, no es alternante
            }

            // Actualizar para el siguiente ciclo
            esParAnterior = esParActual;
            numero /= 10;
        }

        // Si todos los dígitos alternan correctamente, el número es alternante
        return true;
    }
}
