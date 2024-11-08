package HoraPlanetaLejano;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadSegundos = scanner.nextInt();
        int segundosPorDia = 42000;
        int cantidadDias = cantidadSegundos / segundosPorDia;
        int residuo1 = cantidadSegundos % segundosPorDia;
        int segundosPorHora = 3500;
        int cantidadHoras = residuo1 / segundosPorHora;
        int residuo2 = residuo1 % segundosPorHora;
        int segundosPorMinuto = 50;
        int cantidadMinutos = residuo2 / segundosPorMinuto;
        int residuo3 = residuo2 % segundosPorMinuto;
        System.out.printf("%d %d %d %d%n", cantidadDias, cantidadHoras, cantidadMinutos, residuo3);
        scanner.close();
    }
}