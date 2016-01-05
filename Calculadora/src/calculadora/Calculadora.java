package calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Selecciona la "
        + "operación que quieres realizar");
        System.out.println("1) Suma (+)");
        System.out.println("2) Resta (-)");
        System.out.println("3) Multiplicación (*)");
        System.out.println("4) División (/)");
        String operacion = sc.nextLine();
        int opcion = Integer.parseInt(operacion);
        if (opcion == 1) {
            System.out.println("Dame el primer número: ");
            double a = sc.nextDouble();
            System.out.println("Dame el segundo número: ");
            double b = sc.nextDouble();
            double resultado = a + b;
            System.out.println("El resultado de la suma "
            + "es: " + resultado);
        } else if (opcion == 2) {
            System.out.println("Dame el primer número: ");
            double a = sc.nextDouble();
            System.out.println("Dame el segundo número: ");
            double b = sc.nextDouble();
            double resultado = a - b;
            System.out.println("El resultado de la resta "
            + "es: " + resultado);
        } else if (opcion == 3) {
            System.out.println("Dame el primer número: ");
            double a = sc.nextDouble();
            System.out.println("Dame el segundo número: ");
            double b = sc.nextDouble();
            double resultado = a * b;
            System.out.println("El resultado de la multiplicación "
            + "es: " + resultado);
        } else if (opcion == 4) {
            System.out.println("Dame el primer número: ");
            double a = sc.nextDouble();
            System.out.println("Dame el segundo número: ");
            double b = sc.nextDouble();
            double resultado = a / b;
            System.out.println("El resultado de la división "
            + "es: " + resultado);
        }


    }
}
