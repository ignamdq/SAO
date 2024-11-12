// Puede ver la TV si
// (a) Realizó la tarea, (b) Tocó sus prácticas de piano y (c) Lo hizo de memoria.

package VerTV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Realizó la tarea? (S/N): ");
        String realizoTareaInput = scanner.nextLine().toUpperCase();
        boolean realizoTarea = realizoTareaInput.equals("S");

        System.out.print("¿Tocó el piano? (S/N): ");
        String tocoPianoInput = scanner.nextLine().toUpperCase();
        boolean tocoPiano = tocoPianoInput.equals("S");

        System.out.print("¿Lo hizo de memoria? (S/N): ");
        String loHizoDeMemoriaInput = scanner.nextLine().toUpperCase();
        boolean loHizoDeMemoria = loHizoDeMemoriaInput.equals("S");

        boolean puedeVerTV = realizoTarea && tocoPiano && loHizoDeMemoria;

        System.out.println("¿Puede ver la TV? " + (puedeVerTV ? "Sí" : "No"));

        scanner.close();
    }
}
