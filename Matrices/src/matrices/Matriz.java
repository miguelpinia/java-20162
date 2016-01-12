package matrices;

public class Matriz {

    private double[][] matriz;

    /**
     * Constructor por default. Inicializa el arreglo a 3x3.
     */
    public Matriz() {
        matriz = new double[3][3];
    }

    /**
     * Constructor al que le pasamos el número de renglones
     * y el número de columnas que deseamos.
     *
     * @param renglones El número de renglones
     * @param columnas El número de columnas.
     */
    public Matriz(int renglones, int columnas) {
        matriz = new double[renglones][columnas];
    }

    /**
     * Agrega un nuevo valor en el renglon i y la columna j.
     *
     * @param i El renglon.
     * @param j La columna.
     * @param valor El valor a agregar.
     */
    public void agregaValor(int i, int j, double valor) {
        matriz[i][j] = valor;
    }

    /**
     * Remplaza la matriz original por una nueva matriz.
     *
     * @param nuevaMatriz La nueva matriz.
     */
    public void remplazaMatriz(double[][] nuevaMatriz) {
        matriz = nuevaMatriz;
    }

    public Matriz suma(Matriz nueva) {
        if (matriz.length != nueva.matriz.length) {
            return null;
        }
        if (matriz[0].length != nueva.matriz[0].length) {
            return null;
        }
        double[][] resultado
            = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado[i][j] =
                        matriz[i][j] + nueva.matriz[i][j];
            }
        }
        Matriz resultadoSuma = new Matriz();
        resultadoSuma.remplazaMatriz(resultado);
        return resultadoSuma;
    }

    public Matriz resta(Matriz nueva) {
        if (matriz.length != nueva.matriz.length) {
            return null;
        }
        if (matriz[0].length != nueva.matriz[0].length) {
            return null;
        }
        double[][] resultado
            = new double[matriz.length][matriz[0].length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                resultado[i][j] =
                        matriz[i][j] - nueva.matriz[i][j];
            }
        }
        Matriz resultadoResta = new Matriz();
        resultadoResta.remplazaMatriz(resultado);
        return resultadoResta;
    }

    public Matriz multiplicacion(Matriz a) {
        if (matriz[0].length != a.matriz.length) {
            return null;
        }

        double[][] resultado
            = new double[matriz.length][a.matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                for (int k = 0; k < a.matriz.length; k++) {
                    resultado[i][j] += matriz[i][k] * a.matriz[k][j];
                }
            }
        }
        Matriz resMul = new Matriz();
        resMul.remplazaMatriz(resultado);
        return resMul;
    }

    public void imprimeMatriz() {
        String salida = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                salida += matriz[i][j] + "\t";
            }
            salida += "\n";
        }
        System.out.println(salida);
    }

}
