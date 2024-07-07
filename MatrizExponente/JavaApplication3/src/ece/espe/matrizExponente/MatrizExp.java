package ece.espe.matrizExponente;

import java.util.Random;

public class MatrizExp implements MatrizExponente {
    private int[][] matriz;
    private int dimension;

    public MatrizExp(int[][] matriz, int dimension) {
        this.matriz = matriz;
        this.dimension = dimension;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
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
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private int[][] multiplicarMatrices(int[][] a, int[][] b) {
        int[][] producto = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                producto[i][j] = 0;
                for (int k = 0; k < dimension; k++) {
                    producto[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return producto;
    }
    
    @Override
    public void multiplicarPorExponente(int exponente) {
        int[][] resultado = new int[dimension][dimension];

        // Inicializar la matriz resultado como una matriz identidad
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j) {
                    resultado[i][j] = 1;
                } else {
                    resultado[i][j] = 0;
                }
            }
        }

        // Multiplicar la matriz por sí misma 'exponente' veces
        for (int e = 0; e < exponente; e++) {
            resultado = multiplicarMatrices(resultado, matriz);
        }

        // Actualizar la matriz con el resultado
        matriz = resultado;
        
    }
}
