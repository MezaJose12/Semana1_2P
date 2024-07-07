package ec.espe.matriz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la dimensión de la matriz: ");
        int dimension = scanner.nextInt();
        
        MatrizAleatoria matrizAleatoria = new MatrizAleatoria(dimension);
        matrizAleatoria.generar(dimension);
        matrizAleatoria.imprimir();
    }
}

