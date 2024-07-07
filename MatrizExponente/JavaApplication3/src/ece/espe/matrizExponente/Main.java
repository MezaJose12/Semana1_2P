
package ece.espe.matrizExponente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Ingrese la dimension:");       
        int dimension = lee.nextInt();
        System.out.println("Ingrese el exponente:");
        int exponente = lee.nextInt();

        MatrizExp matrizExp = new MatrizExp(new int[dimension][dimension], dimension);
        matrizExp.generar(dimension);
        matrizExp.imprimir();
        matrizExp.multiplicarPorExponente(exponente);
        matrizExp.imprimir();
    }
}