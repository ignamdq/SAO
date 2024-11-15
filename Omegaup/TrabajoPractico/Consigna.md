# Inversiones con Martín

Martín estaba scrolleando en Instagram cuando de repente le aparece una nota sobre inversiones. En el artículo se analizan las distintas opciones que hay hoy en día de apps que ofrecen cuentas remuneradas con distintos porcentajes de rendimientos pero también con topes de inversión.

## Ejemplos
- **Ualá** le ofrece una tasa alta pero solo lo remunera por importes de hasta $500.000.
- **Naranja X** le ofrece una tasa un poco menor pero lo remunera hasta $600.000.
- **Personal Pay** tiene una tasa bastante más baja pero no tiene tope de inversión, con lo cual puede recibir rendimientos de todo el dinero que coloque.

Martín quiere saber, dependiendo de cuánto dinero tiene, en cuál de las tres aplicaciones le conviene colocar su dinero. Le interesa colocar **todo el dinero en una sola aplicación**.

## Requerimiento

Martín quiere que armes un programa donde él:
1. Coloque la **cantidad de dinero** que quiere invertir.
2. Indique la **cantidad de aplicaciones** a evaluar.
3. Especifique para cada aplicación:
   - La **TNA** (tasa nominal anual).
   - El **tope de inversión** (monto máximo sobre el cual se generan intereses).

El programa debe devolver el número de la aplicación más conveniente.

## Observaciones
Para calcular el **interés diario** obtenido con una determinada tasa de interés, el cálculo es:  
`interesDiario = TNA / 365 * importeInvertido`

Se requiere para su resolución utilizar la función `calcularMayorInteresDiario()` la cual:
- Recibe el monto a invertir, la tasa nominal de interés anual y el tope de inversión de la aplicación.
- Devuelve el interés diario obtenido por Martín.

## Entrada
1. Importe a invertir `C`.  
2. Cantidad de aplicaciones a evaluar `N`.  
3. Por cada aplicación:
   - Tasa nominal anual `TNA` (`Ti`).  
   - Monto tope máximo de inversión (`Mi`).  
     - Si la aplicación **no tiene tope**, se recibirá `-1`.

## Salida
El número de la aplicación en la que conviene invertir el dinero.

```bash
#Casos de prueba

# Caso 1
Entrada: 500000 3 0.45 500000 0.42 600000 0.37 -1
Salida: 1

# Caso 2
Entrada: 600000 3 0.45 500000 0.42 600000 0.37 -1
Salida: 2

# Caso 3
Entrada: 650000 3 0.45 500000 0.42 600000 0.37 -1
Salida: 2

# Caso 4
Entrada: 700000 3 0.45 500000 0.42 600000 0.37 -1
Salida: 3
```