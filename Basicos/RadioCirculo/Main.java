package RadioCirculo;

import java.util.Scanner;
import java.util.Locale;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        // Establecer el Locale a EE.UU. para usar el punto como separador decimal
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el área del círculo
        System.out.print("Ingresa el área del círculo: ");
        double area = scanner.nextDouble();

        // Calcular el radio usando la fórmula r = √(A/π)
        double radio = Math.sqrt(area / Math.PI);

        // Crear un objeto DecimalFormat para formatear el número a 2 decimales
        DecimalFormat df = new DecimalFormat("#.00");

        // Mostrar el resultado con dos decimales
        System.out.println("El radio del círculo es: " + df.format(radio));

        scanner.close();
    }
}
