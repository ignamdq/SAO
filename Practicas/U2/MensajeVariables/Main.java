// Mensaje con variables
package MensajeVariables;

public class Main {

    public static void main(String[] args) {

        // 4. Declaración y asignación de variables individuales.
        String nombre = "Alejandra";
        int edad = 27;
        String cumpleaños = "9 de Agosto";
        String ciudad = "Tierra del Fuego";
        String ocupacion = "Chef";
        String hobbie = "Ver Dragon Ball Z";

        // 6. Desafío Bonus: declaración de múltiples variables en una sola línea.
        String nombre2 = "Marcelo", ciudad2 = "Madrid", hobbie2 = "ver películas";

        // 5. Párrafo que combine las variables.
        System.out.println("Hola, mi nombre es " + nombre + ". Tengo " + edad + " años y cumplo el "
                + cumpleaños + ". Vivo en " + ciudad + ", trabajo como " + ocupacion
                + " y mi pasatiempo favorito es " + hobbie + ".");

        // Opcional: Impresión de variables declaradas en una línea
        System.out.println("Otra persona: " + nombre2 + " vive en " + ciudad2 + " y le gusta " + hobbie2 + ".");
    }
}
