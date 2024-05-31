# Métodos numéricos -> Tema 1 al Tema 6

Indice


<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 1"> TEMA 1 </a>  </i> </b> </font> </h1>

# <h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T1"> Descripción del Problemario </a> </font> </h2>


1. **Overflow**:
   - Se refiere a una situación en la que un cálculo produce un resultado que es mayor de lo que una computadora puede representar en su sistema de numeración.
   - Puede ocurrir, por ejemplo, al realizar una división por un número próximo a 0.
   - Es importante tener en cuenta este fenómeno al diseñar algoritmos y sistemas numéricos para evitar errores de cálculo.

2. **Redondeo**:
   - Es un proceso en el que un número se aproxima a otro número.
   - Redondear significa simplificar un número pero mantener su valor cerca de lo que era.
   - Los errores de redondeo pueden surgir al representar números con un número finito de decimales en las máquinas de cálculo.
   - Existen diferentes métodos de redondeo y cada uno tiene sus propias reglas y ejemplos.

3. **Truncamiento**:
   - Se refiere a la eliminación de los dígitos menos significativos de un número.
   - Los errores de truncamiento surgen al obtener una aproximación numérica de la solución exacta.
   - Estos errores son inevitables y previsibles en los cálculos numéricos.
   - Es crucial considerar estos errores al seleccionar un método numérico para resolver un problema.

********************************************************************************************************************************************************************************************************************

# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia T1"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T1"> Competencia de la Asignatura </a> </h3>

     Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.
  
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Competencia del tema T1"> Competencia del tema </a> </h3>

    Aplica los tipos de errores para identificar la incertidumbre y limitaciones de los cálculos numéricos en una computadora.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


<h3> <font font face = "forte"> <a name="Temario T1"> Temario  </a> </h3>

    1. Introducción a los métodos numéricos 
         1.1 Importancia de los métodos numéricos. 
         1.2 Conceptos básicos: cifra significativa, precisión, exactitud, incertidumbre y sesgo. 
         1.3 Tipos de errores. 
         1.4 Software de cómputo numérico. 
        1.5 Métodos iterativos.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



# <h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos numéricos para resolver problemas científicos y de ingeniería utilizandola computadora"> Métodos numéricos para resolver problemas científicos y de ingeniería utilizandola computadora. </a> </font> </h2>


# <h3 align = "center"> <font font face = "forte"> <a name="Overflow"> 1. Overflow </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónO"> Descripción. </a> </h4>

El **Overflow** es un fenómeno que ocurre en la computación cuando un cálculo produce un resultado que excede el límite máximo que una computadora puede representar en su sistema de numeración. Este fenómeno puede ocurrir, por ejemplo, al realizar una división por un número muy cercano a 0. Es crucial tener en cuenta este fenómeno al diseñar algoritmos y sistemas numéricos para evitar errores de cálculo.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoO"> Algoritmo. </a> </h4>

1. **Identificar los límites de los números**: En cualquier sistema de numeración, hay un límite superior e inferior para los números que se pueden representar.

2. **Realizar el cálculo**: Ejecuta la operación matemática o el algoritmo que estás utilizando.

3. **Verificar si el resultado está dentro de los límites**: Comprueba si el resultado del cálculo está dentro de los límites del sistema de numeración.

4. **Manejar el overflow**: Si el resultado excede los límites, entonces ha ocurrido un overflow. En este caso, debes manejar el error de acuerdo con las necesidades de tu aplicación.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoO"> Pseudocódigo. </a> </h4>

    Función Verificar_Overflow(limite_inferior, limite_superior, resultado):
        Si resultado > limite_superior o resultado < limite_inferior:
            Levantar un error de Overflow
        De lo contrario:
            Devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónO"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Overflow;

    public class Ejercicio2 {
        public static void main(String[] args) {
            // Ejemplo de desbordamiento en multiplicación con enteros
            int a = Integer.MAX_VALUE; // Valor máximo para un entero
            int b = 2; // Multiplicación por 2
    
            // Intentamos multiplicar el valor máximo de un entero por 2
            int producto = a * b;
    
            // Imprimimos el resultado
            System.out.println("Resultado de la multiplicación: " + producto); // Se produce un desbordamiento
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-29 141302](https://github.com/rubivj13/MetodosNumericos_Tema6/assets/147438464/a850ac71-8c38-435a-b28e-d7ed0a668a13)


# <h3 align = "center"> <font font face = "forte"> <a name="Redondeo"> 2. Redondeo </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónR"> Descripción. </a> </h4>

El **Redondeo** es una operación matemática que se utiliza para aproximar un número a otro número más simple o más fácil de trabajar⁶. Es una técnica comúnmente utilizada en muchos campos, como la contabilidad, la estadística, la programación y el diseño de páginas web⁶. El redondeo puede ser hacia arriba o hacia abajo dependiendo del valor del número. Por ejemplo, los valores como 3.1, 3.3 ó 3.4 se redondean a la baja a 3, mientras que valores tales como 3.6, 3.8 ó 3.9 se redondean al alza a 4¹.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoR"> Algoritmo. </a> </h4>

1. **Identificar el número a redondear**: Este es el número que deseas simplificar.

2. **Determinar el número de decimales a mantener**: Decide cuántos decimales quieres mantener después del redondeo.

3. **Verificar el siguiente decimal**: Comprueba si el decimal siguiente al último decimal que quieres mantener es mayor o igual a 5.

4. **Realizar el redondeo**: Si el decimal es mayor o igual a 5, incrementa en 1 el último decimal que quieres mantener. Si es menor que 5, deja el último decimal como está.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoR"> Pseudocódigo. </a> </h4>

    Función Redondear(número, decimales):
        factor = 10 ^ decimales
        resultado = Redondear(número * factor) / factor
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónR"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Redondeo;
    
    public class Ejercicio1 {
        public static void main(String[] args) {
            // Ejemplo de error de redondeo en suma
            double num1 = 0.1;
            double num2 = 0.2;
            double suma = num1 + num2;
    
            System.out.println("Suma: " + suma); // Imprime 0.30000000000000004
    
            // Ejemplo de error de redondeo en multiplicación
            double num3 = 1.0 / 3.0;
            double resultado = num3 * 3;
    
            System.out.println("Resultado: " + resultado); // Imprime 0.9999999999999999
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-29 141937](https://github.com/rubivj13/MetodosNumericos_Tema6/assets/147438464/a8872e7a-b88b-4e5c-858e-1e65d5b62fbc)


# <h3 align = "center"> <font font face = "forte"> <a name="Truncamiento"> 3. Truncamiento </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónT"> Descripción. </a> </h4>

El **Redondeo** es una operación matemática que se utiliza para aproximar un número a otro número más simple o más fácil de trabajar⁶. Es una técnica comúnmente utilizada en muchos campos, como la contabilidad, la estadística, la programación y el diseño de páginas web⁶. El redondeo puede ser hacia arriba o hacia abajo dependiendo del valor del número. Por ejemplo, los valores como 3.1, 3.3 ó 3.4 se redondean a la baja a 3, mientras que valores tales como 3.6, 3.8 ó 3.9 se redondean al alza a 4¹.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="AlgoritmoR"> Algoritmo. </a> </h4>

1. **Identificar el número a redondear**: Este es el número que deseas simplificar.

2. **Determinar el número de decimales a mantener**: Decide cuántos decimales quieres mantener después del redondeo.

3. **Verificar el siguiente decimal**: Comprueba si el decimal siguiente al último decimal que quieres mantener es mayor o igual a 5.

4. **Realizar el redondeo**: Si el decimal es mayor o igual a 5, incrementa en 1 el último decimal que quieres mantener. Si es menor que 5, deja el último decimal como está.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="PseudocódigoR"> Pseudocódigo. </a> </h4>

    Función Redondear(número, decimales):
        factor = 10 ^ decimales
        resultado = Redondear(número * factor) / factor
        devolver resultado


--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h4> <font font face = "arial"> <a name="ImplementaciónT"> Implementación. </a> </h4>

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package Truncamiento;
    
    import java.util.function.DoubleUnaryOperator;
    
    public class Ejercicio4 {
        public static void main(String[] args) {
            // Definimos la función f(x) = x^3
            DoubleUnaryOperator funcion = x -> x * x * x;
    
            // Punto en el que aproximamos la derivada
            double punto = 2.0;
    
            // Tamaño del paso para las diferencias finitas
            double h = 0.01;
    
            // Aproximación de la derivada mediante diferencias finitas hacia adelante
            double derivadaAproximada = diferenciaFinitaAdelante(funcion, punto, h);
    
            // Valor verdadero de la derivada de f(x) = x^3 en x = 2
            double valorVerdadero = 3 * punto * punto;
    
            // Calculamos el error de truncamiento
            double errorTruncamiento = Math.abs(derivadaAproximada - valorVerdadero);
    
            // Imprimimos resultados
            System.out.println("Aproximación de la derivada: " + derivadaAproximada);
            System.out.println("Valor verdadero de la derivada: " + valorVerdadero);
            System.out.println("Error de truncamiento: " + errorTruncamiento);
        }
    
        // Método para calcular la derivada mediante diferencias finitas hacia adelante
        public static double diferenciaFinitaAdelante(DoubleUnaryOperator funcion, double x, double h) {
            return (funcion.applyAsDouble(x + h) - funcion.applyAsDouble(x)) / h;
        }
    }



<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-05-29 142455](https://github.com/rubivj13/MetodosNumericos_Tema6/assets/147438464/f1a2b0af-9e7c-4f84-a7c9-010a13a73e43)


------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 2"> TEMA 2 </a>  </i> </b> </font> </h1>

<h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T2"> Descripción del Problemario Tema 2 </a> </font> </h2>

En este conjunto de ejercicios, exploraremos cuatro métodos para determinar las raíces de funciones. Estos métodos son:

  1. Método de Bisección: Un enfoque sencillo pero efectivo para encontrar raíces en intervalos.
  2. Método de la Falsa Posición: Una técnica que combina la bisección con interpolación lineal.
  3. Método de la Secante: Un algoritmo iterativo que no requiere el cálculo de derivadas.
  4. Método de Newton-Raphson: Un método basado en la aproximación de la derivada.

Cada uno de estos métodos se encuentra organizado en carpetas específicas. Al ingresar a la carpeta correspondiente de cada método, encontrarás cinco ejercicios resueltos en el lenguaje de programación Java. Además, dentro de cada carpeta, proporcionamos una breve descripción y detalles importantes sobre la aplicación de cada método.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="SOBRE LA MATERIAT2"> SOBRE LA MATERIA </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T2"> Competencia de la Asignatura </a> </h3>

    Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

<h3> <font font face = "forte"> <a name="Competencia del TEMA T2"> Competencia del TEMA </a> </h3>

    Aplica los métodos numéricos con el objeto de solucionar ecuaciones mediante los métodos de intervalo e interpolación apoyada de un lenguaje de programación.  

<h3> <font font face = "forte"> <a name="TEMARIO T2"> TEMARIO  </a> </h3>

   2.1 Métodos de intervalo. 
   
   2.2 Método de bisección.
   
   2.3 Método de aproximaciones sucesivas. 
   
   2.4 Métodos de interpolación. 
   
   2.5 Aplicaciones.

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio"> Métodos numéricos para encontrar las raíces de ecuaciones que se encuentran en nuestro repositorio </a> </font> </h2>

<h3 align = "center"> <font font face = "forte"> <a name="Método de Bisección"> 1. Método de Bisección </a> </h3>

<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

El método de bisección, conocido también como de corte binario, de partición de intervalos o de Bolzano, es un tipo de búsqueda incremental en el que el intervalo se divide siempre a la mitad. Si la función cambia de signo sobre un intervalo, se evalúa el valor de la función en el punto medio. La posición de la raíz se determina situándola en el punto medio del subintervalo, dentro del cual ocurre un cambio de signo. El proceso se repite hasta obtener una mejor aproximación.


<h4> <font font face = "arial"> ALGORITMO: </h4>
Paso 1: Elija valores iniciales inferior, xl, y superior, xu, que encierren la raíz, de tal forma que la función cambie de signo en el intervalo. Esto se verifica comprobando
que f(xl) f(xu) < 0.

Paso 2: Una aproximación de la raíz xr se determina mediante:
Xr = (Xl + Xu) / 2

Paso 3: Realice las siguientes evaluaciones para determinar en qué subintervalo está la raíz: 

    a) Si f(xl)f(xr) < 0, entonces la raíz se encuentra dentro del subintervalo inferior o izquierdo. Por lo tanto, haga xu = xr y vuelva al paso 2. 
    b) Si f(xl)f(xr) > 0, entonces la raíz se encuentra dentro del subintervalo superioro derecho. Por lo tanto, haga xl = xr y vuelva al paso 2. 
    c) Si f(xl)f(xr) = 0, la raíz es igual a xr; termina el cálculo.

<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: x^3+4x^2-10      
Limites -> A:1 B:2      
Iteraciones: 10        
Error: 0.0001

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package biseccion1;
    
    import java.util.Scanner;
    
    public class Biseccion1 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("\t\t\t\t -- Método de bisección (EJERCICIO 1) --");
    
            System.out.print("Ingrese el límite inferior: ");
            double a = scanner.nextDouble();
    
            System.out.print("Ingrese el límite superior: ");
            double b = scanner.nextDouble();
    
            System.out.print("Ingrese el número máximo de iteraciones: ");
            int maxIter = scanner.nextInt();
    
            System.out.print("Ingrese el valor de tolerancia: ");
            double tol = scanner.nextDouble();
    
            // Encontrar la raíz de la función usando el método de bisección
            double root = bisectionMethod(a, b, maxIter, tol);
    
            // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
            System.out.printf("La raíz de la ecuación es: %.5f%n", root);
        }
    
        // Definir el método de bisección
        public static double bisectionMethod(double a, double b, int maxIter, double tol) {
            // Verificar si la función cambia de signo en el intervalo
            if ((func(a) * func(b)) > 0) {
                System.out.println("El método no puede encontrar una raíz en el intervalo.");
                return -1;
            }
    
            double c;
            // Iterar hasta que se alcance el número máximo de iteraciones
            for (int i = 0; i < maxIter; i++) {
                // Calcular el punto medio del intervalo
                c = (a + b) / 2;
                // Verificar si el punto medio está dentro de la tolerancia
                if (Math.abs(func(c)) < tol) {
                    // Devolver el punto medio como la raíz
                    return c;
                }
                // Actualizar el intervalo
                if (func(a) * func(c) < 0) {
                    b = c;
                } else {
                    a = c;
                }
            }
            // Devolver el punto medio del intervalo final como la raíz
            return (a + b) / 2;
        }
    
        // Definir la función para encontrar la raíz de
        public static double func(double x) {
            return Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
        }
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>
  
  ![Imagen de WhatsApp 2024-02-29 a las 21 23 35_14f59d0b](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/381b92ed-11ff-4282-9758-cc91cb53dd78)

<h3 align = "center"> <font font face = "forte"> <a name="Método de la Falsa Posición"> 2. Método de la Falsa Posición </a> </h3>

<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

Aun cuando la bisección es una técnica perfectamente válida para determinar raíces, su método de aproximación por “fuerza bruta” es relativamente ineficiente. La falsa posición es una alternativa basada en una visualización gráfica.


<h4> <font font face = "arial"> ALGORITMO: </h4>
1. Seleccionar los valores iniciales de a y b y evaluar en este intervalo, de manera que la función cambie de signo, establecer una tolerancia de error.

2. La primera aproximación se calcula con la siguiente ecuación: Xr = b - f(b)(a-b) / f(a)-f(b)

3. Realizar las siguientes evaluaciones:

    - Si f(a) * f(Xr) = 0 : se terminan los cálculos
    
    - Si f(a) * f(Xr) > 0 : la raíz se encuentra entre Xr y b. Hacer a = Xr.
    
    - Si f(a) * f(Xr) < 0 : la raíz se encuentra entre Xr y a. Hacer b = Xr.

4. Calcular el nuevo Xr.

5. Calcular el error aproximado para ver si se cumple el criterio establecido.

<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: 10x^(3)+2x^(2)-9x-8   
Limites -> A:1 B:2      
Iteraciones: 10        
Error: 0.0001

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package falsaposicion4;
    
    import java.util.Scanner;
    
    public class FalsaPosicion4 {
    
        public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
    
           System.out.println("\t\t\t\t -- Método de la falsa posición (EJERCICIO 4) --");
    
           System.out.print("Ingrese el límite inferior: ");
           double a = scanner.nextDouble();
    
           System.out.print("Ingrese el límite superior: ");
           double b = scanner.nextDouble();
    
           System.out.print("Ingrese el número máximo de iteraciones: ");
           int maxIter = scanner.nextInt();
    
           System.out.print("Ingrese el valor de tolerancia: ");
           double tol = scanner.nextDouble();
    
           // Se calcula la raíz de la ecuación utilizando el método de la posición falsa
           double root = falsePositionMethod(a, b, maxIter, tol);
    
           // Se imprime el resultado en formato decimal con 5 cifras después del punto decimal
           System.out.printf("La raíz de la ecuación es: %.5f%n", root);
        }
    
        // Método que implementa el algoritmo de la posición falsa
        public static double falsePositionMethod(double a, double b, int maxIter, double tol) {
           // Se verifica si la función cambia de signo en el intervalo [a, b]
           if (func(a) * func(b) > 0) {
               // Si no cambia de signo, se imprime un mensaje indicando que la función no encuentra la raiz en el intervalo dado 
               System.out.println("El método no puede encontrar una raíz en el intervalo.");
               return -1;
            }
    
            double xa, xb, xr = 0;
            xa = a;
            xb = b;
    
            for (int i = 0; i < maxIter; i++) {
                xr = xb - (func(xb) * (xb - xa) / (func(xb) - func(xa)));
                if (Math.abs(func(xr)) < tol) {
                    // Si la diferencia absoluta de la función en x2 es menor que la tolerancia, se devuelve x2 como la raíz
                    return xr;
                }
                if (func(xa) * func(xr) < 0) {
                    // Si la función cambia de signo entre x0 y x2, se actualiza x1
                    xb = xr;
                } else {
                    // De lo contrario, se actualiza x0
                    xa = xr;
                }
            }
            // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, se devuelve el último valor de x2 como la raíz aproximada
            return xr;
        }
    
        // Método que define la función cuya raíz se desea encontrar
        public static double func(double x) {
           return 10 * Math.pow(x, 3) + 2 * Math.pow(x, 2) - 9 * x - 8;
        }
        
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>
  
  ![Imagen de WhatsApp 2024-02-29 a las 21 23 35_14f59d0b](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/3f97ba75-643d-4d6c-b0de-0c91d9e27208)

<h3 align = "center"> <font font face = "forte"> <a name="Método de la Secante"> 3. Método de la Secante. </a> </h3>

<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

Un problema potencial en la implementación del método de Newton-Raphson es la evaluación de la derivada. Aunque esto no es un inconveniente para los polinomios ni para muchas otras funciones, existen algunas funciones cuyas derivadas en ocasiones resultan muy difíciles de calcular.
Esta técnica es similar a la del método de Newton-Raphson en el sentido de que una aproximación de la raíz se predice extrapolando una tangente de la función hasta el eje x. Sin embargo, el método de la secante usa una diferencia dividida en lugar de una derivada para estimar la pendiente.

<h4> <font font face = "arial"> ALGORITMO: </h4>

1. Definición del problema:
    - Supongamos que tenemos una función (f(x)) que es continua en un intervalo ([a, b]).
    - Además, (f(a)) y (f(b)) tienen signos opuestos (es decir, (f(a) \cdot f(b) < 0)).

2. Cálculo de la aproximación inicial:
    - Tomamos dos aproximaciones iniciales: (x_0) y (x_1).
    - La siguiente aproximación, (x_2), se calcula mediante la fórmula: x_2 = x_1 - (f(x_1) (x_1 - x_0)) / (f(x_1) - f(x_0))

3. Iteración:
    -Repetimos el proceso:
    --Calculamos (x_3) usando (x_1) y (x_2).
    --Calculamos (x_4) usando (x_2) y (x_3).
    --Continuamos hasta alcanzar la precisión deseada.

4.Convergencia:
  -El método de la secante tiene una convergencia superlineal inferior al método de Newton-Raphson.


<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: 4x^(4)-16    
Limites -> Aproximación1: 2   
Aproximación2: 1        
Iteraciones: 10        
Error: 0.0001


<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package msecante2;
    
    import java.util.Scanner;
    
    public class MSecante2 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("\t\t\t\t -- Método de la secante (EJERCICIO 2) --"); 
            
            System.out.print("Ingrese Ingrese la primera aproximación: ");
            double x0 = scanner.nextDouble(); 
            
            System.out.print("Ingrese la segunda aproximación: ");
            double x1 = scanner.nextDouble(); 
            
            System.out.print("Ingrese el número máximo de iteraciones: ");
            int maxIter = scanner.nextInt(); 
            
            System.out.print("Ingrese el valor de tolerancia: ");
            double tol = scanner.nextDouble(); 
    
            // Se calcula la raíz de la ecuación utilizando el método de la secante
            double root = secantMethod(x0, x1, maxIter, tol); 
    
            // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
            System.out.printf("La raíz de la ecuación es: %.5f%n", root); 
        }
    
        public static double secantMethod(double x0, double x1, int maxIter, double tol) {
            if (func(x0) * func(x1) == 0) {
                System.out.println("El método no puede encontrar una raíz en el intervalo."); // Mensaje que se muestra si la raiz no esta dentro de las 2 aproximaciones
                return -1;
            }
    
            double x2 = 0;
            for (int i = 0; i < maxIter; i++) {
                x2 = x1 - (func(x1) * (x1 - x0) / (func(x1) - func(x0))); // Calcula la raiz siguendo la formula del método de la secante 
                if (Math.abs(x1 - x2) < tol) {
                    return x2; // Si el cambio en las aproximaciones es menor que el valor de tolerancia, devolver la aproximación actual como la raíz
                }
                x0 = x1; // Actualizar el valor de x0
                x1 = x2; // Actualizar el valor de x1
            }
            return x2; // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, devolver la última aproximación
        }
    
        public static double func(double x) {
            return 4 * Math.pow(x, 4) - 16; // Definir la función cuya raíz se desea encontrar
        }
        
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>
  
  ![secantePro](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/2f0a1932-df69-44f4-9372-1d96e5a8fb24)


<h3 align = "center"> <font font face = "forte"> <a name="Método de Newton-Raphson"> 4. Método de Newton-Raphson. </a> </h3>
   
<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

El método de Newton-Raphson se utilizó empleando la derivada (al evaluar, es la pendiente de la recta tangente) de una función, para calcular su intersección con el eje de la variable independiente; esto es, la raíz.



<h4> <font font face = "arial"> ALGORITMO: </h4>

1. Escoge un valor inicial para (x). Este valor es una estimación donde esperamos encontrar una raíz.

2. Evalúa la función usando el valor de (x) del paso 1.

3. Calcula la derivada de la función utilizando el valor de (x) del paso 1.

4. Actualiza la estimación de la raíz mediante la siguiente fórmula: x(r+1) = xr - (f(xr)/f’(xr))

5. Repite los pasos 2-4 hasta que la estimación de la raíz converja a un valor preciso.


<h4> <font font face = "arial"> IMPLEMENTACIÓN: </h4>

<h5> <font font face = "arial"> Descripción del ejemplo. </h5>

Función: 15x^(2)+5 x-3    
Derivada de la Función: 30x+5       
Aproximación inicial: 0       
Iteraciones: 10        
Error: 0.0001


<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package mnewton3;
    
    import java.util.Scanner;

    public class MNewton3 {
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.println("\t\t\t\t -- Método de Newton (EJERCICIO 3) --"); 
            
            System.out.print("Ingrese la aproximación inicial: ");
            double x0 = scanner.nextDouble(); 
    
            System.out.print("Ingrese el número máximo de iteraciones: ");
            int maxIter = scanner.nextInt(); 
    
            System.out.print("Ingrese el valor de tolerancia: ");
            double tol = scanner.nextDouble(); 
    
            // Se calcula la raíz de la ecuación utilizando el método de Newton
            double root = newtonMethod(x0, maxIter, tol); 
    
            // La parte %.5f%n sirve para formatear el resultado de la variable root como un número decimal con 5 dígitos después del punto decimal.
            System.out.printf("La raíz de la ecuación es: %.5f%n", root); 
        }
    
        public static double newtonMethod(double x0, int maxIter, double tol) {
            double fx = func(x0); // Calcula el valor de la función en x0
            double df = funcDerivada(x0); // Calcula el valor de la derivada de la función en x0
    
            if (df == 0) {
                System.out.println("El método no puede encontrar una raíz en la aproximacion."); // Mensaje que se muestra si la derivada en la conjetura inicial no tiene una raiz
                return -1;
            }
    
            double x1 = 0;
            for (int i = 0; i < maxIter; i++) {
                x1 = x0 - (fx / df); // Actualiza la aproximación utilizando la fórmula del método de Newton
                double error = Math.abs(x1 - x0); // Calcula el error relativo
                if (error < tol) {
                    return x1; // Si el error es menor que el valor de tolerancia, devuelve la aproximación actual como la raíz
                }
                x0 = x1; // Actualiza la aproximación para la iteración siguiente
                fx = func(x0); // Calcula el valor de la función en la nueva aproximación
                df = funcDerivada(x0); // Calcula el valor de la derivada de la función en la nueva aproximación
            }
            return x1; // Si se alcanza el número máximo de iteraciones sin encontrar una raíz con la tolerancia especificada, devuelve la última aproximación
        }
    
        public static double func(double x) {
            return 15 * Math.pow(x, 2) + 5 * x - 3 ; // Definir la función cuya raíz se desea encontrar
        }
    
        public static double funcDerivada(double x) {
            return 30 * x + 5;  //Definir la derivada de la función
        }
    }


<h5> <font font face = "arial"> <b> <i> Corrida del programa. </i> </b> </h5>

![newtonPto](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/fd08d1b1-81f7-42f1-bb90-63378f45ccc9)

---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h1> <font color = "darkred" size="+5" font face = "cooper black"> <b> <i> <a name="TEMA 3"> TEMA 3 </a>  </i> </b> </font> </h1>

<h2 align = "center"> <font  font face = "bauhaus 93">  <a name="Descripción del Problemario T3"> Descripción del Problemario </a> </font> </h2>

En este conjunto de ejercicios, exploraremos cuatro métodos la solución de sistemas de ecuaciones lineales. Estos métodos son:

1. **Eliminación Gaussiana**:
   - Método para resolver sistemas de ecuaciones lineales.
   - Transforma la matriz ampliada en forma escalonada.
   - Luego, se resuelve sustituyendo hacia atrás.
   - Clasifica el sistema como compatible determinado, indeterminado o incompatible.

2. **Método de Gauss-Jordan**:
   - Variante de la eliminación de Gauss.
   - Llega a la forma escalonada reducida.
   - Proporciona directamente las soluciones del sistema.

3. **Método de Gauss-Seidel**:
   - Resuelve sistemas iterativamente.
   - Actualiza las incógnitas en cada iteración.
   - Adecuado para matrices simétricas y dominantes.

4. **Método de Jacobi**:
   - Otra técnica iterativa para sistemas lineales.
   - Actualiza las incógnitas con valores iniciales.
   - Adecuado para matrices diagonales dominantes.

Cada uno de estos métodos se encuentra organizado en carpetas específicas. Al ingresar a la carpeta correspondiente de cada método, encontrarás cinco ejercicios resueltos en el lenguaje de programación Java. 

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Sobre la materia T3"> Sobre la materia </a> </font> </h2>

<h3> <font font face = "forte"> <a name="Competencia de la Asignatura T3"> Competencia de la Asignatura </a> </h3>

    Aplica los métodos numéricos para resolver problemas científicos y de ingeniería utilizando la computadora.

<h3> <font font face = "forte"> <a name="Competencia del tema T3"> Competencia del tema </a> </h3>

''

<h3> <font font face = "forte"> <a name="Temario T3"> Temario  </a> </h3>

''

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<h2 align = "center"> <font  font face = "bauhaus 93"> <a name="Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio"> Métodos Numéricos sobre los métodos de solución de sistemas de ecuaciones lineales que se encuentran en nuestro repositorio </a> </font> </h2>

<h3 align = "center"> <font font face = "forte"> <a name="Eliminación Gaussiana"> 1. Eliminación Gaussiana </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónEG"> Descripción: </a> </h4>

   - También conocido como **método de eliminación de Gauss**, este algoritmo se utiliza para resolver sistemas de ecuaciones lineales. Aquí están los pasos clave:
   - Se trabaja con la **matriz ampliada** del sistema (que incluye los coeficientes de las incógnitas y los términos independientes).
   - Mediante operaciones de fila (intercambio, suma y multiplicación), se transforma la matriz ampliada en una **forma escalonada** (matriz triangular superior).
   - Luego, se resuelve el sistema sustituyendo hacia atrás desde la última fila.
   - Si se llega a la **forma escalonada reducida**, se denomina **eliminación de Gauss-Jordan**.
   - La clasificación del sistema (compatible determinado, indeterminado o incompatible) se deduce de la forma escalonada de la matriz ampliada.


<h4> <font font face = "arial"> <a name="AlgoritmoEG"> Algoritmo: </a> </h4>

  1. Ir a la primera columna número cero de izquierda a derecha.
  2. Si la primera fila tiene un cero en esta columna, intercambiarlo con otra que no lo tenga.
  3. Luego, obtener ceros debajo de este elemento delantero, sumando múltiplos adecuados del renglón superior a los renglones debajo de él.
  4. Cubrir el renglón superior y repetir el proceso anterior con la submatriz restante.

Este método se basa en la manipulación de ecuaciones y utiliza operaciones elementales en las filas de la matriz asociada, como intercambiar filas, multiplicar por un escalar y sumar o restar múltiplos de filas, para lograr la forma escalonada.

Es importante mencionar que si finalizamos las operaciones al hallar la forma escalonada reducida (forma lo más parecida a la matriz identidad), entonces el método se denomina eliminación de Gauss-Jordan.

<h6> <font font face = "arial"> Ejemplo </h6>

![Captura de pantalla 2024-03-14 081648](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/6d5bf86d-d638-49b6-832f-35c46df56603)


<h6> <font font face = "arial"> Solución </h6>

La matriz a resolver:

![Captura de pantalla 2024-03-14 082025](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/267ac5c3-b5d2-429b-865f-96311a6a5a1e)


De la tercera fila se obtiene 2z=2, es decir, z=1. De la segunda fila obtenemos y=-1. Finalmente de la primera fila se obtiene x+2y+z=0, es deci, x=1.

Concluimos que la solución del sistema de ecuaciones es:

**x=1 
y=−1 
z=1**

<h4> <font font face = "arial"> <a name="ImplementaciónEG"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 083239](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/34355e8a-75a4-4020-afda-458b3d5a78e0)

<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package eliminacióngaussiana.pkg1;
    
    public class EliminaciónGaussiana1 {
    
        public static void main(String[] args) {
            double[][] A = {{1, 2, 1}, {1, 0, 1}, {0, 1, 2}};
            double[] b = {0, 2, 1};
    
            double[] xyz = gaussElimination(A, b);
    
            System.out.println("Solución del sistema de ecuaciones:");
            System.out.println("x = " + xyz[0]);
            System.out.println("y = " + xyz[1]);
            System.out.println("z = " + xyz[2]);
        }
    
        public static double[] gaussElimination(double[][] A, double[] b) {
            int n = A.length;
    
            // Eliminación hacia adelante
            for (int k = 0; k < n-1; k++) {
                for (int i = k+1; i < n; i++) {
                    double factor = A[i][k] / A[k][k]; 
                    for (int j = k+1; j < n; j++) {
                        A[i][j] -= factor * A[k][j];
                    }
                    b[i] -= factor * b[k];
                }
                
            }
    
            // Sustitución hacia atrás
            double[] xyz = new double[n];
            for (int i = n-1; i >= 0; i--) {
                double sum = 0.0;
                for (int j = i+1; j < n; j++) {
                    sum += A[i][j] * xyz[j];
                }
                xyz[i] = (b[i] - sum) / A[i][i];
            }
            
            return xyz;
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 083727](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/25c8adaf-641e-49ca-9632-fd2420bfb9ce)

<h3 align = "center"> <font font face = "forte"> <a name="Método de Gauss-Jordan"> 2. Método de Gauss-Jordan </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónGJ"> Descripción: </a> </h4>

   - Este método es una variante de la eliminación de Gauss.
   - Después de obtener la forma escalonada, se continúa hasta alcanzar la **forma escalonada reducida** (similar a la matriz identidad).
   - La matriz resultante proporciona directamente las soluciones del sistema de ecuaciones.
   - Útil para encontrar la **inversa de una matriz** y resolver sistemas de ecuaciones lineales.


<h4> <font font face = "arial"> <a name="AlgoritmoGJ"> Algoritmo: </a> </h4>

  1. Primero, se anota el sistema de ecuaciones en forma matricial, también llamada matriz aumentada.
  2. Se transforma esta matriz en una matriz identidad. Para ello, se pueden realizar las siguientes operaciones en las filas de la matriz:
      - Cambiar el orden de las filas.
      - Multiplicar o dividir todos los términos de una fila por un número diferente de 0.
      - Sustituir una fila por la suma de la misma fila más otra fila multiplicada por un número.
  3. Una vez que se ha obtenido la matriz identidad, las soluciones del sistema de ecuaciones son los términos independientes de la matriz.

Este método es eficiente para matrices 2x2 y 3x3. Al finalizar, no es necesario utilizar la sustitución hacia atrás para conseguir la solución.

Es importante mencionar que si finalizamos las operaciones al hallar la forma escalonada reducida (forma lo más parecida a la matriz identidad), entonces el método se denomina eliminación de Gauss-Jordan.

<h6> <font font face = "arial"> Ejemplo </h6>

La matriz a resolver:

![Captura de pantalla 2024-03-14 093329](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/9f6eef94-97ff-4b0c-93e3-b19e6c091bf7)


<h6> <font font face = "arial"> Solución </h6>

Como primer paso dividimos el primer renglón R1 entre la componente a11:

![Captura de pantalla 2024-03-14 093436](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/de742227-e4f5-43ea-99ba-bab49121ad94)


Como segundo paso se requiere «convertir» las componentes inferiores de la componente a11 en ceros (0):

![Captura de pantalla 2024-03-14 093642](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/8f3df11f-28cf-4211-bc83-7be1501f6722)


Al tercer renglón (R3) se le restará el primer renglón multiplicado por la componente a 31.

![Captura de pantalla 2024-03-14 093757](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/c5d458c9-2d6d-4416-9401-689209979654)


Se procede a dividir el segundo renglón R2 entre la componente a 22:

![Captura de pantalla 2024-03-14 093846](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/4bb3b745-15df-49d2-a45d-e811d1c2e98b)


Ahora se repite todo el proceso para las demás columnas hasta obtener la forma deseada.

![Captura de pantalla 2024-03-14 094129](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/cc5affd2-a8e4-450f-91e8-df1252ecbf6c)


Finalmente, convertimos al sistema convencional de ecuaciones:

![Captura de pantalla 2024-03-14 094237](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/c37794dd-72a6-4fed-87d5-bb3ab4b09ef0)



<h4> <font font face = "arial"> <a name="ImplementaciónEG"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 094543](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/f7d0201a-943a-4e89-8526-8dd14ce454a9)


<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package gaussjordan4;
    
    /**
     *
     * @author Rub_1
     */
    public class GaussJordan4 {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // Definir las matrices directamente
            double[][] matrix = {
                {3, -2, 5, 38},
                {2, 4, -1, -7},
                {-7, -3, 4, 5}
            };
    
            // Realizar el algoritmo de Gauss-Jordan
            gaussJordan(matrix);
            
            // Imprimir la matriz en su forma escalonada reducida por filas
            System.out.println("La matriz en su forma escalonada reducida por filas es:");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (Math.abs(matrix[i][j] - (int)matrix[i][j]) < 1e-6) {
                        System.out.print((int)matrix[i][j] + "\t");
                    } else {
                        System.out.print(matrix[i][j] + "\t");
                    }
                }
                System.out.println();
            }
            
            // Imprimir los valores de x, y, y z
            System.out.println("Solución del sistema de ecuaciones:");
            double x = matrix[0][matrix[0].length - 1];
            double y = matrix[1][matrix[0].length - 1];
            double z = matrix[2][matrix[0].length - 1];
            System.out.println("x = " + x);
            System.out.println("y = " + y);
            System.out.println("z = " + z);
        }
        
        public static void gaussJordan(double[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            
            for (int k = 0; k < rows; k++) {
                // Pivoteo parcial
                int maxRow = k;
                for (int i = k + 1; i < rows; i++) {
                    if (Math.abs(matrix[i][k]) > Math.abs(matrix[maxRow][k])) {
                        maxRow = i;
                    }
                }
                double[] temp = matrix[k];
                matrix[k] = matrix[maxRow];
                matrix[maxRow] = temp;
                
                // Reducción
                for (int i = 0; i < rows; i++) {
                    if (i != k) {
                        double factor = matrix[i][k] / matrix[k][k];
                        for (int j = k; j < cols; j++) {
                            matrix[i][j] -= factor * matrix[k][j];
                        }
                    }
                }
                
                // Normalización
                double divisor = matrix[k][k];
                for (int j = k; j < cols; j++) {
                    matrix[k][j] /= divisor;
                }
            }
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 095352](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/bb217e66-ca29-432a-b56e-e63fc5af5931)

<h3 align = "center"> <font font face = "forte"> <a name="Método de Gauss-Seidel"> 3. Método de Gauss-Seidel </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónGS"> Descripción: </a> </h4>

   - Este método se utiliza para resolver sistemas de ecuaciones lineales **iterativamente**.
   - Se basa en la descomposición de la matriz de coeficientes en una parte diagonal y una parte no diagonal.
   - En cada iteración, se actualizan las incógnitas utilizando los valores anteriores.
   - Adecuado para sistemas con **matrices simétricas y dominantes**.
   - Converge más rápido si la matriz es **diagonalmente dominante**.


<h4> <font font face = "arial"> <a name="AlgoritmoGS"> Algoritmo: </a> </h4>

Este método es una versión acelerada de Jácobi. En el cual es necesario contar con un vector aproximado completo para proceder a la sustitución en las ecuaciones de recurrencia y obtener una nueva aproximación. En el método de Gauss-Seidel se propone ir sustituyendo los nuevos valores de la aproximación siguiente conforme se vayan obteniendo sin esperar a tener un vector completo. De esta forma se acelera la convergencia.

Para resolverlo podemos seguir los siguientes pasos:

  - Asignar valores iniciales a las incógnitas, pudiendo ser hipotéticos o arbitrarios.
  - Empezar con la primera ecuación y calcular el valor de la incógnita con el coeficiente más grande, usando los valores asignados en el paso 1 para las otras incógnitas.
  - Proceder a la siguiente ecuación y calcular el valor de la incógnita con el coeficiente más grande, usando el valor calculado en el paso anterior y los valores iniciales para las otras incógnitas.
  - Repetir este proceso para las ecuaciones restantes, calculando siempre el valor de la incógnita con el coeficiente más grande en cada ecuación y usando los últimos valores calculados para las otras incógnitas.
  - Continuar iterando hasta que los valores de las incógnitas no cambien significativamente entre iteraciones.

<h6> <font font face = "arial"> Ejemplo </h6>

La matriz a resolver:

![Captura de pantalla 2024-03-14 102904](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/458c3e77-e9c7-43a2-b103-920edb9dfa8b)



<h6> <font font face = "arial"> Solución </h6>

Primero ordenamos las ecuaciones, de modo que en la diagonal principal esten los coeficientes mayores para asegurar la convergencia.

![Captura de pantalla 2024-03-14 103005](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/47d0ee06-e7e9-41f7-8e40-663588402e0e)


Despejamos cada una de las variables sobre la diagonal:

![Captura de pantalla 2024-03-14 103105](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/1d7a7bde-cd70-4f54-ae39-b52064d89db0)


Suponemos los valores iniciales X2 = 0 y X3 = 0 y calculamos X1

![Captura de pantalla 2024-03-14 103155](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/0301c346-48c4-47a7-9546-6debf0b94594)


Este valor junto con el de X3 se puede utilizar para obtener X2

![Captura de pantalla 2024-03-14 103249](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/7ebda8e3-20e9-4d59-943b-1eac163cea6f)


La primera iteración se completa sustituyendo los valores de X1 y X2 calculados obteniendo:

![Captura de pantalla 2024-03-14 103338](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/5e10ab47-c106-44c8-9b12-5a948a115020)


En la segunda iteración, se repite el mismo procedimiento:

![Captura de pantalla 2024-03-14 103429](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/68f0a07d-ab3f-44e9-b6f7-a26105bc9bdb)


Comparando los valores calculados entre la primera y la segunda iteración

![Captura de pantalla 2024-03-14 103519](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/d096c967-b8f9-4043-b37e-df4acc59391d)


Como podemos observar, no se cumple la condición.

![Captura de pantalla 2024-03-14 103604](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/670dfe30-d5de-4b74-b991-29798753f8cb)


Entonces tomamos los valores calculados en la última iteración y se toman como supuestos para la siguiente iteración. Se repite entonces el proceso:

![Captura de pantalla 2024-03-14 103643](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/306613b6-4ccf-40f7-93ab-ade3c53b47d8)


Comparando los valores obtenidos.

![Captura de pantalla 2024-03-14 103737](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/b94845e5-4f2f-4e02-8d0e-714747abfdf0)


Dado que se cumple la condición, el resultado es:

**X1 = 3.0**

**X2 = -2.5**

**X3 = 7.0**



<h4> <font font face = "arial"> <a name="ImplementaciónGS"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 104237](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/4431315d-e5cb-45c2-9110-d6a1f1bdc921)



<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package gaussseidel3;
    
    public class GaussSeidel3 {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            double[][] coeficientes = {
                {3, -0.1, -0.2},
                {0.1, 7, -0.3},
                {0.3, -0.2, 10}
            };
            double[] terminosIndependientes = {7.85, -19.3, 71.4};
            double[] solucion = resolverSistema(coeficientes, terminosIndependientes);
            for (int i = 0; i < solucion.length; i++) {
                System.out.println("x[" + (i+1) + "] = " + solucion[i]);
            }
    
        }
    
        public static double[] resolverSistema(double[][] coeficientes, double[] terminosIndependientes) {
            int n = coeficientes.length;
            double[] x = new double[n];
            double[] nuevoX = new double[n];
            int iteracionesMaximas = 100;
            double epsilon = 1e-6;
    
            for (int iter = 0; iter < iteracionesMaximas; iter++) {
                for (int i = 0; i < n; i++) {
                    nuevoX[i] = terminosIndependientes[i];
                    for (int j = 0; j < n; j++) {
                        if (j != i) {
                            nuevoX[i] -= coeficientes[i][j] * x[j];
                        }
                    }
                    nuevoX[i] /= coeficientes[i][i];
                }
    
                boolean detener = true;
                for (int i = 0; i < n; i++) {
                    if (Math.abs(nuevoX[i] - x[i]) > epsilon) {
                        detener = false;
                        break;
                    }
                }
    
                if (detener) {
                    break;
                }
    
                System.arraycopy(nuevoX, 0, x, 0, n);
            }
            return x;
        }
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 142312](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/9c7c3b9d-5947-4c85-9aa9-9164e5b76c88)

<h3 align = "center"> <font font face = "forte"> <a name="Método de Jacobi"> 4. Método de Jacobi </a> </h3>

<h4> <font font face = "arial"> <a name="DescripciónJ"> Descripción: </a> </h4>

   - Similar al método de Gauss-Seidel, es otra técnica iterativa para resolver sistemas de ecuaciones lineales.
   - Divide la matriz de coeficientes en una parte diagonal y una parte no diagonal.
   - En cada iteración, se actualizan las incógnitas utilizando los valores iniciales.
   - Adecuado para sistemas con **matrices diagonales dominantes**.
   - Puede ser menos eficiente que Gauss-Seidel en términos de convergencia.


<h4> <font font face = "arial"> <a name="AlgoritmoJ"> Algoritmo: </a> </h4>

Este método es una versión acelerada de Jácobi. En el cual es necesario contar con un vector aproximado completo para proceder a la sustitución en las ecuaciones de recurrencia y obtener una nueva aproximación. En el método de Gauss-Seidel se propone ir sustituyendo los nuevos valores de la aproximación siguiente conforme se vayan obteniendo sin esperar a tener un vector completo. De esta forma se acelera la convergencia.

Para resolverlo podemos seguir los siguientes pasos:

  1. **Inicialización:** Se elige un vector inicial ( x^{(0)} ) para las soluciones.
  2. **Iteración:** En el paso ( k ), cada componente ( x_i^{(k+1)} ) del nuevo vector solución se calcula usando la fórmula:

     ![Captura de pantalla 2024-03-14 112233](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/fb829ecf-31bb-4f61-9622-56195d0fdb09)

    donde ( a_{ii} ) es el coeficiente de la diagonal de la matriz de coeficientes, ( b_i ) es el término independiente de la ecuación, y la suma se realiza sobre todos los ( j ) excepto ( i ).
  3. **Convergencia:** Se repite el proceso hasta que la diferencia entre las soluciones en iteraciones sucesivas sea menor que un umbral preestablecido.


<h6> <font font face = "arial"> Ejemplo </h6>

![Captura de pantalla 2024-03-14 112543](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/54dab2fb-0083-4a84-9781-753403130116)



<h4> <font font face = "arial"> <a name="ImplementaciónJ"> Implementación: </a> </h4>

<h5> <font font face = "arial"> Ejemplo a resolver. </h5>

![Captura de pantalla 2024-03-14 113047](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/503de3e6-85cf-457b-9a5e-30e25f60ccf1)



<h5> <font font face = "arial"> <b> <i> Ejemplo en código. </i> </b> </h5>

    package jacobi4;
    
    public class Jacobi4 {
    
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            double[][] coeficientes = {
                {6,2,-1,4},
                {1,5,1,3},
                {2,1,4,27}
            };
            
            double[] valoresIniciales = {0, 0, 0}; // Valores iniciales de las incógnitas
            double tolerancia = 0.0001; // Tolerancia para el criterio de convergencia
            int iteracionesMaximas = 1000; // Número máximo de iteraciones
            
            double[] solucion = jacobi(coeficientes, valoresIniciales, tolerancia, iteracionesMaximas);
            
            if (solucion != null) {
                System.out.println("Solución del sistema de ecuaciones:");
                System.out.println("x = " + solucion[0]);
                System.out.println("y = " + solucion[1]);
                System.out.println("z = " + solucion[2]);
            } else {
                System.out.println("El método no converge.");
            }
        }
        
        public static double[] jacobi(double[][] coeficientes, double[] valoresIniciales, double tolerancia, int iteracionesMaximas) {
            int n = valoresIniciales.length;
            double[] solucion = new double[n];
            double[] solucionAnterior = new double[n];
            int iteraciones = 0;
            double error = tolerancia + 1;
            
            // Inicializar la solución con los valores iniciales
            System.arraycopy(valoresIniciales, 0, solucion, 0, n);
            
            // Iterar hasta que se alcance la tolerancia o el número máximo de iteraciones
            while (error > tolerancia && iteraciones < iteracionesMaximas) {
                // Copiar la solución anterior
                System.arraycopy(solucion, 0, solucionAnterior, 0, n);
                
                // Calcular la nueva solución
                for (int i = 0; i < n; i++) {
                    double suma = 0;
                    for (int j = 0; j < n; j++) {
                        if (j != i) {
                            suma += coeficientes[i][j] * solucionAnterior[j];
                        }
                    }
                    solucion[i] = (coeficientes[i][n] - suma) / coeficientes[i][i];
                }
                
                // Calcular el error
                error = 0;
                for (int i = 0; i < n; i++) {
                    error += Math.abs(solucion[i] - solucionAnterior[i]);
                }
                
                iteraciones++;
            }
            
            // Verificar la convergencia
            if (error <= tolerancia) {
                return solucion;
            } else {
                return null; // No converge
            }
        }
        
    }


<h5> <font font face = "arial"> <b> <i> Ejecución del programa. </i> </b> </h5>

![Captura de pantalla 2024-03-14 113337](https://github.com/rubivj13/Metodos_Numericos_Tema-3/assets/147438464/a6842b59-ba5e-4f50-be8a-4f888f32b80d)


