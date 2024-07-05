package ec.edu.espe;

public class Funcion {
    public int[] array(int vector[]) {
        int cont = 0;
        int array[] = new int[5];
        for (int i = 0; i < 10; i += 2) {
            for (int j = 1; j < 10 && cont < 5; j += 2) {
                array[cont] = vector[i] + vector[j];
                cont++;
            }
        }
        return array;
    }
}
