/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

/**
 *
 * @author miguel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double[][] a = new double[3][4];
        double[][] b = new double[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = j;
                b[i][j] = j;
            }
        }
        Matriz a1 = new Matriz();
        Matriz a2 = new Matriz();
        a1.remplazaMatriz(a);
        a2.remplazaMatriz(b);
//        a1.imprimeMatriz();
//        System.out.println("======================");
//        a2.imprimeMatriz();
        Matriz resultadoSuma = a1.suma(a2);
        System.out.println("Resultado de la suma");
        resultadoSuma.imprimeMatriz();

        double[][] m1 = {{2, 2, 1}
                         , {1, 1, 1}};
        double[][] m2 = {{1, 2, 3, 4}
                         , {5, 6, 7, 8}
                         , {1, 2, 3, 4}};
        Matriz matriz1 = new Matriz();
        Matriz matriz2 = new Matriz();
        matriz1.remplazaMatriz(m1);
        matriz2.remplazaMatriz(m2);
        matriz1.multiplicacion(matriz2).imprimeMatriz();
        System.out.println("=== Multiplicación por "
        + "escalar ======");

        matriz2.multiplicacionEscalar(10).imprimeMatriz();

//        Matriz res = matriz2.multiplicacionEscalar(10);
//        res.imprimeMatriz();
    }

}
