/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Migue
 */
public class Ejercicio2_Redondeo {

    public static void main(String[] args) {
        // Ejemplo de error de redondeo en sustracción
        double num1 = 1.0;
        double num2 = 0.9999999999999999; // Este número es muy cercano a 1
        double resta = num1 - num2;

        System.out.println("Resta: " + resta); // Imprime un valor muy pequeño en lugar de 0
    }
}
