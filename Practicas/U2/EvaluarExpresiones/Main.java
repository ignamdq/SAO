package EvaluarExpresiones;

public class Main {

    public static void main(String[] args) {
        // Primer conjunto de valores
        int x1 = 10;
        char y1 = 'a';

        // Evaluar la primera expresión
        boolean resultado1 = (y1 == 'b' || x1 >= 10);
        System.out.println("Resultado de la primera expresión: " + resultado1);

        // Segundo conjunto de valores
        int x2 = 3;
        int y2 = 8;

        // Evaluar la segunda expresión
        boolean resultado2 = !(x2 == 3 || x2 == y2) && !(y2 != 8 && x2 <= y2);
        System.out.println("Resultado de la segunda expresión: " + resultado2);
    }
}
