package ec.espe.matriz;

import java.util.Random;

public class MatrizAleatoria implements Matriz {
    private double[][] matriz;
    private int dimension;
    
    public MatrizAleatoria(int dimension) {
        this.dimension = dimension;
        this.matriz = new double[dimension][dimension];
    }

    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    @Override
    public void generar(int dimension) {
        Random random = new Random();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] = random.nextInt(9) + 1; // Números aleatorios entre 1 y 9
            }
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Matriz generada:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print((int) matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        hacerMatrizIdentidad();
        
        System.out.println("Matriz identidad:");
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print((int) matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void hacerMatrizIdentidad() {
        for (int i = 0; i < dimension; i++) {
            // Dividir la fila i por el elemento matriz[i][i]
            double divisor = matriz[i][i];
            if (divisor == 0) continue; // Evitar división por cero
            for (int j = 0; j < dimension; j++) {
                matriz[i][j] /= divisor;
            }

            // Hacer cero los elementos en la columna i para todas las filas excepto la fila i
            for (int k = 0; k < dimension; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j < dimension; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }
        }
    }
}
