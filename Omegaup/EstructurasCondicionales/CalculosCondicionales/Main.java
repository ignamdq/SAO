package CalculosCondicionales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int modificaciones = 0;
        int temp = N;
        if (N % 2 == 0) {
            N = N / 2;
        } else {
            N = N + 1;
        }
        if (N != temp) {
            modificaciones++;
        }
        temp = N;
        if (N >= 100) {
            N = N / 100;
        } else if (N >= 10) {
            N = N / 10;
        }
        if (N != temp) {
            modificaciones++;
        }
        temp = N;
        if (N % 3 == 0) {
            N = N - 1;
        }
        if (N != temp) {
            modificaciones++;
        }
        System.out.println(N + " " + modificaciones);

        scanner.close();
    }
}