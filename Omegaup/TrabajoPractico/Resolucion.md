# Inversiones con Martín

# Parte 1: Entradas y Salidas
Se almacenaban los datos necesarios para evaluar las aplicaciones de inversión, pidiendo al usuario ingresar el capital disponible y la cantidad de aplicaciones que se desean evaluar.

# Parte 2: Método calculoInversion
Se agrega un nuevo array montosPermitidos[i] que almacena el monto permitido de inversión para cada aplicación. Este monto se calcula a través de un nuevo método calculoInversion, que toma en cuenta tanto el capital disponible como el tope de inversión de cada aplicación.

# Parte 3: Método de Cálculo de Interés Diario
Se implementa un nuevo método calcularInteresDiario, que calcula el interés diario para cada aplicación en base a su tasa nominal y el monto invertido. Este valor se almacena en el array interesesDiarios para su posterior evaluación.

# Parte 4: Búsqueda de la Mejor Aplicación (Mayor Interés Diario)
En esta etapa, se introduce la lógica para determinar cuál de las aplicaciones evaluadas tiene el mayor interés diario. Esto se logra recorriendo el array interesesDiarios y comparando los valores, almacenando el índice de la aplicación con el interés más alto. Luego, se imprime el número de la mejor aplicación y el valor de su interés diario.

# Mejoras: Verificación de Entradas
No se ha implementado aun la validación de entradas en la versión anterior. 

¿Que ocurre cuando se ingresan valores tipo string? ¿abc? 

```java
while (!scanner.hasNextInt()) {
    // El método .hasNextInt() de la clase Scanner verifica que el valor en la entrada es un número entero (int).
    System.out.println("Por favor, ingrese un número válido para capitalDisponible.");
    scanner.next(); // Limpiar el buffer
}
int capitalDisponible = scanner.nextInt();
```

cantidadAplicacionesEvaluar ¿Cuantas?