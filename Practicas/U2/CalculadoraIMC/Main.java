// Calculadora IMC
package CalculadoraIMC;

public class Main {

    public static void main(String[] args) {
        // Variables para el primer paciente: Nicolás López
        String nombre1 = "Nicolas López";
        int edad1 = 27;
        double peso1 = 83.5;
        double altura1 = 1.70; // Convertido a metros
        boolean tienePrepaga1 = true; // Tiene prepaga (Swiss Medical)
        String prepaga1 = "Swiss Medical"; // Nombre de la prepaga
        double imc1 = calcularIMC(peso1, altura1); // Calcular IMC

        // Variables para el segundo paciente: Esteban Piazza
        String nombre2 = "Esteban Piazza";
        int edad2 = 28;
        double peso2 = 80.1;
        double altura2 = 1.76; // Convertido a metros
        boolean tienePrepaga2 = true; // Tiene prepaga (OSDE)
        String prepaga2 = "OSDE"; // Nombre de la prepaga
        double imc2 = calcularIMC(peso2, altura2); // Calcular IMC

        // Variables para el tercer paciente: José Fermoso
        String nombre3 = "Jose Fermoso";
        int edad3 = 33;
        double peso3 = 63.7;
        double altura3 = 1.53; // Convertido a metros
        boolean tienePrepaga3 = false; // No tiene prepaga
        String prepaga3 = ""; // No tiene prepaga
        double imc3 = calcularIMC(peso3, altura3); // Calcular IMC

        // Variables para el cuarto paciente: Juana Fernández
        String nombre4 = "Juana Fernández";
        int edad4 = 26;
        double peso4 = 55.0;
        double altura4 = 1.62; // Convertido a metros
        boolean tienePrepaga4 = true; // Tiene prepaga (Omint)
        String prepaga4 = "Omint"; // Nombre de la prepaga
        double imc4 = calcularIMC(peso4, altura4); // Calcular IMC

        // Mostrar los resultados de los pacientes, incluyendo si tienen prepaga o no
        mostrarResultado(nombre1, edad1, imc1, tienePrepaga1, prepaga1);
        mostrarResultado(nombre2, edad2, imc2, tienePrepaga2, prepaga2);
        mostrarResultado(nombre3, edad3, imc3, tienePrepaga3, prepaga3);
        mostrarResultado(nombre4, edad4, imc4, tienePrepaga4, prepaga4);
    }

    // Método para calcular el IMC
    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    // Método para mostrar el resultado, incluyendo si el paciente tiene prepaga o
    // no
    public static void mostrarResultado(String nombre, int edad, double imc, boolean tienePrepaga, String prepaga) {
        if (tienePrepaga) {
            System.out.printf("%s tiene %d años, su índice de masa corporal es de %.2f y tiene prepaga %s.%n",
                    nombre, edad, imc, prepaga);
        } else {
            System.out.printf("%s tiene %d años, su índice de masa corporal es de %.2f y no tiene prepaga.%n",
                    nombre, edad, imc);
        }
    }
}
