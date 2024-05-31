/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Migue
 */
public class Ejercicio3_Desvordamiento {
        public static void main(String[] args) {
        // Ejemplo de desbordamiento en una operación aritmética con enteros grandes
        long a = Long.MAX_VALUE; // Valor máximo para un long
        long suma = a + 1; // Intentamos sumar 1 al valor máximo de un long

        // Imprimimos el resultado
        System.out.println("Resultado de la suma: " + suma); // Se produce un desbordamiento
    }
}
