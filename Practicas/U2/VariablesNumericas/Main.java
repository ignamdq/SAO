package VariablesNumericas;

// Variables numéricas
public class Main {

    public static void main(String[] args) {
        // 1. Declaración de la variable 'uno' y asignación de un número cualquiera.
        int uno = 5;

        // 2. Declaración de la variable 'dos' y asignación del valor de 'uno'.
        int dos = uno;

        // 3. Cambio del valor de la variable 'uno'.
        uno = 10;

        // Impresión de valores para ver el resultado final.
        System.out.println("Valor de uno: " + uno); // debería imprimir 10
        System.out.println("Valor de dos: " + dos); // debería imprimir 5
    }
}
