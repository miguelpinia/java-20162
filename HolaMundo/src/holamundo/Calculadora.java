/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class Calculadora {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        double a = sc.nextDouble();
        System.out.println("Dame otro número: ");
        double b = sc.nextDouble();
        double resultado = a + b;
        System.out.println("El resultado de la suma es: " + resultado);
    }

}
