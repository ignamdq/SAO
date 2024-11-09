package Practicas.U4.Factorial;

public class Main {

    public static void main(String[] args) {

        // Le paso el parámetro
        System.out.println(factorial(9));
    }

    // Método que calcula el factorial de un número natural

    public static int factorial(int n) {

        // Inicializamos el resultado en 1

        int resultado = 1;

        for (int i = 1; i <= n; i++) {

            // Se multiplica el resultado por el valor de i en cada iteración
            resultado *= i;
        }

        return resultado; // Retornamos el resultado final
    }
}
