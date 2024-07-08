
package ec.espe.pascal;

public class TrianguloPascal extends GeneradorTrianguloPascal {

    @Override
    public void generarTrianguloPascal(int filas) {
        int[][] trianguloPascal = new int[filas][];

        for (int i = 0; i < filas; i++) {
            trianguloPascal[i] = new int[i + 1];
            trianguloPascal[i][0] = 1;
            trianguloPascal[i][i] = 1;

            for (int j = 1; j < i; j++) {
                trianguloPascal[i][j] = trianguloPascal[i - 1][j - 1] + trianguloPascal[i - 1][j];
            }
        }

        imprimirTrianguloPascal(trianguloPascal, filas);
    }

    private void imprimirTrianguloPascal(int[][] trianguloPascal, int filas) {
        for (int i = filas - 1; i >= 0; i--) {
            for (int j = 0; j < filas - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(trianguloPascal[i][j] + " ");
            }
            System.out.println();
        }
    }
}

