package Conversiones;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        float c = 2.3f; // la 'f' indica que es un valor float.
        byte d = 3;
        byte e = 10;

        // Línea 6: Conversión implícita - Asignar 'byte' a 'int' (No es necesario cast)
        a = d; // El tipo 'byte' se puede asignar implícitamente a 'int'

        // Línea 7: Conversión implícita - Operación entre 'int' y 'int', el resultado
        // es 'int'
        b = a * 2; // No se requiere cast, ya que ambos operandos son 'int'

        // Línea 8: Conversión explícita - Operación entre 'byte' y 'int', el resultado
        // es 'int', luego asignación a 'byte' (se requiere cast)
        d = (byte) (e * 2); // Se necesita convertir explícitamente el resultado a 'byte'

        // Línea 9: Conversión implícita - Operación entre 'float' y 'int', el resultado
        // es 'float', luego asignación a 'int' (se requiere cast)
        a = (int) (c + 1 * 3); // Se necesita convertir explícitamente el resultado a 'int'

        // Línea 10: Conversión explícita - Operación entre 'int' y 'int', el resultado
        // es 'int', luego asignación a 'byte' (se requiere cast)
        e = (byte) (a + 1); // Se necesita convertir explícitamente el resultado a 'byte'

        // Mostrar los resultados
        System.out.println("Valor de a: " + a);
        System.out.println("Valor de b: " + b);
        System.out.println("Valor de d: " + d);
        System.out.println("Valor de e: " + e);
    }
}
