/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Migue
 */
public class Ejercicio1_Redondeo {
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
