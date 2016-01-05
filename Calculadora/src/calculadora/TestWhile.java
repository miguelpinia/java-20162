/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class TestWhile {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        String alto = "";

        while (!alto.equals("alto")) {
            System.out.println("Detener (escribe alto)");
            alto = sc.nextLine();
        }

    }

}
