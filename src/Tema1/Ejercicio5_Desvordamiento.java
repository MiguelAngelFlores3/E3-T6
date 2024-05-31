/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Migue
 */
public class Ejercicio5_Desvordamiento {

    public static void main(String[] args) {
        // Ejemplo de desbordamiento en una operación de multiplicación con enteros
        int a = 1000000; // Número grande
        int b = 1000000; // Número grande
        long producto = (long) a * b; // Multiplicación de dos enteros grandes

        // Imprimimos el resultado
        System.out.println("Resultado de la multiplicación: " + producto); // Se produce un desbordamiento
    }
}
