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

   
   <h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
  ![Imagen de WhatsApp 2024-02-28 a las 22 18 18_c66bb2e7](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/bded96b1-64f6-4520-9fc0-b2dd1b794379)


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


<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>

  ![Captura de pantalla 2024-02-29 222857](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/035fc501-0729-4ff8-9c91-900f354df65a)



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


   
<h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
  ![Imagen de WhatsApp 2024-02-28 a las 22 19 49_a0a34287](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/9167c198-e4b2-45a3-a2df-138f31b95052)


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


<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>
  
![Captura de pantalla 2024-02-29 222857](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/ff4d59e5-87b9-4cce-b9eb-a180f6f37302)



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



   
   <h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
  ![Imagen de WhatsApp 2024-02-28 a las 22 23 41_62839bca](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/0326197f-06b9-42ae-837c-d9d5f1f6d232)


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




<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>
  
  ![Captura secante](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/c15e9096-ce5d-4661-954c-e61b4e67d089)


<h3 align = "center"> <font font face = "forte"> <a name="Método de Newton-Raphson"> 4. Método de Newton-Raphson. </a> </h3>
   
<h4> <font font face = "arial"> DESCRIPCIÓN: </h4>

El método de Newton-Raphson se utilizó empleando la derivada (al evaluar, es la pendiente de la recta tangente) de una función, para calcular su intersección con el eje de la variable independiente; esto es, la raíz.



<h4> <font font face = "arial"> ALGORITMO: </h4>

1. Escoge un valor inicial para (x). Este valor es una estimación donde esperamos encontrar una raíz.

2. Evalúa la función usando el valor de (x) del paso 1.

3. Calcula la derivada de la función utilizando el valor de (x) del paso 1.

4. Actualiza la estimación de la raíz mediante la siguiente fórmula: x(r+1) = xr - (f(xr)/f’(xr))

5. Repite los pasos 2-4 hasta que la estimación de la raíz converja a un valor preciso.




   
    <h4> <font font face = "arial"> REPRESENTACIÓN GRÁFICA </h4>
   
![Captura de pantalla 2024-02-28 222609](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/0ab55093-032e-4ea5-8a94-7f196b8e4658)


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


<h5> <font font face = "arial"> <b> <i> Visualización de la raíz en GeoGebra. </i> </b> </h5>
  
  ![Captura newton](https://github.com/rubivj13/Metodos_Numericos/assets/147438464/6668835b-f928-4b66-9665-b42f00146e1c)

