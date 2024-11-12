package NormalizarCadenas;

import java.text.Normalizer;

public class Main {

    public static String normalizarNombre(String nombre) {
        // Convertir a minúsculas y luego a título
        nombre = nombre.toLowerCase();
        String[] palabras = nombre.split(" ");
        StringBuilder nombreNormalizado = new StringBuilder();

        for (String palabra : palabras) {
            if (palabra.length() > 0) {
                // Capitalizar primera letra de cada palabra
                nombreNormalizado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1)).append(" ");
            }
        }

        // Eliminar tildes y caracteres especiales
        return Normalizer.normalize(nombreNormalizado.toString().trim(), Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
    }

    public static void main(String[] args) {
        String nombreOriginal = "José María Pérez";
        String nombreNormalizado = normalizarNombre(nombreOriginal);

        System.out.println("Nombre original: " + nombreOriginal);
        System.out.println("Nombre normalizado: " + nombreNormalizado);
    }
}
