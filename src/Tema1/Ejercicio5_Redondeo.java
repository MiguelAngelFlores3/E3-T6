/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema1;

/**
 *
 * @author Migue
 */
public class Ejercicio5_Redondeo {

    public static void main(String[] args) {
        // Ejemplo de error de redondeo en una operación simple
        double num1 = 1.0 / 3.0; // 1/3
        double num2 = 3.0; // 3
        double producto = num1 * num2;

        System.out.println("Producto: " + producto); // Imprime un valor ligeramente diferente de 1.0
    }
}
