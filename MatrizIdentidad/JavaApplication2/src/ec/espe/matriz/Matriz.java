package ec.espe.matriz;

public interface Matriz {
    void generar(int dimension);// matriz con numeros aleatorios entre 1 y 9
    void imprimir(); //matriz generada y identidad
    void hacerMatrizIdentidad(); // transformar la matriz generada en la identidad con procesos de filas y columnas 
}