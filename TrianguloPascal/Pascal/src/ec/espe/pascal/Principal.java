
package ec.espe.pascal;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        int filas = scanner.nextInt();

        GeneradorTrianguloPascal trianguloPascal = new TrianguloPascal();
        trianguloPascal.generarTrianguloPascal(filas);

        scanner.close();
    }
}

