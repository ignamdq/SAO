/*
Realizar la especificación de un programa que en base a un día y mes de cumpleaños de una persona
indique el signo del zodíaco al que pertenece. Se deberá mostrar el mensaje de error correspondiente en caso de que se ingrese un mes, un día, o una combinación de mes y día (fecha) incorrectas.
*/

package EstructurasCondicionales.SignoZodiaco;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Ingrese el día de su cumpleaños: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes de su cumpleaños (1-12): ");
        int mes = scanner.nextInt();

        // Validar que el mes sea correcto
        if (mes < 1 || mes > 12) {
            System.out.println("Mes incorrecto.");
        }

        // Validar que el día sea correcto según el mes
        boolean diaCorrecto = false;
        switch (mes) {
            case 2:
                // Febrero (28 días, o 29 en años bisiestos, aquí consideramos 28)
                diaCorrecto = dia >= 1 && dia <= 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                // Abril, junio, septiembre y noviembre (30 días)
                diaCorrecto = dia >= 1 && dia <= 30;
                break;
            default:
                // Meses con 31 días
                diaCorrecto = dia >= 1 && dia <= 31;
        }

        // Verificar si el día es incorrecto
        if (!diaCorrecto) {
            System.out.println("Día incorrecto.");
        }

        // Determinar el signo zodiacal en base al día y mes
        String signo = "";
        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 19)) {
            signo = "Aries";
        } else if ((mes == 4 && dia >= 20) || (mes == 5 && dia <= 20)) {
            signo = "Tauro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Géminis";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Cáncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leo";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgo";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpio";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitario";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricornio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Acuario";
        } else if ((mes == 2 && dia >= 19) || (mes == 3 && dia <= 20)) {
            signo = "Piscis";
        }

        // Mostrar el signo zodiacal del usuario
        System.out.println("El signo zodiacal correspondiente a la fecha ingresada es: " + signo);

        // Cerrar el scanner
        scanner.close();
    }
}
