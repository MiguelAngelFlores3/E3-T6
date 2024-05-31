/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Migue
 */
public class Ejercicio3_Redondeo {

    public static void main(String[] args) {
        // Ejemplo de error de redondeo en división
        double numerador = 1.0e20; // Numerador grande
        double denominador = 1.0;  // Denominador pequeño
        double division = numerador / denominador;

        System.out.println("División: " + division); // Imprime un valor infinito
    }
}
