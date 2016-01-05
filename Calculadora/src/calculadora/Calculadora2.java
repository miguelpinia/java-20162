package calculadora;

import java.util.Scanner;

public class Calculadora2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("Bienvenido");
            System.out.println("Selecciona la "
            + "operación que quieres realizar");
            System.out.println("1) Suma (+)");
            System.out.println("2) Resta (-)");
            System.out.println("3) Multiplicación (*)");
            System.out.println("4) División (/)");
            System.out.println("5) Salir");
            String operacion = sc.next();
            opcion = Integer.parseInt(operacion);
            switch (opcion) {
                case 1:
                    System.out.println("Dame el primer número: ");
                    double a = sc.nextDouble();
                    System.out.println("Dame el segundo número: ");
                    double b = sc.nextDouble();
                    double resultado = a + b;
                    System.out.println("El resultado de la suma "
                    + "es: " + resultado);
                    break;
                case 2:
                    System.out.println("Dame el primer número: ");
                    double a1 = sc.nextDouble();
                    System.out.println("Dame el segundo número: ");
                    double b1 = sc.nextDouble();
                    double resultado1 = a1 - b1;
                    System.out.println("El resultado de la resta "
                    + "es: " + resultado1);
                    break;
                case 3:
                    System.out.println("Dame el primer número: ");
                    double a2 = sc.nextDouble();
                    System.out.println("Dame el segundo número: ");
                    double b2 = sc.nextDouble();
                    double resultado2 = a2 * b2;
                    System.out.println("El resultado de la multiplicación "
                    + "es: " + resultado2);
                    break;
                case 4:
                    System.out.println("Dame el primer número: ");
                    double a3 = sc.nextDouble();
                    System.out.println("Dame el segundo número: ");
                    double b3 = sc.nextDouble();
                    double resultado3 = a3 / b3;
                    System.out.println("El resultado de la división "
                    + "es: " + resultado3);
                case 5:
                    System.out.println("Adiós!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        }
    }

}
