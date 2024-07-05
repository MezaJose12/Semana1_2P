package ec.edu.espe;

public class ValidarCedula {
    public String verificar(int vector[]) {
        int r, sep = 0, sei = 0, tot;
        for (int i = 0; i < 9; i += 2) {
            r = vector[i] * 2;
            if (r > 9) {
                r -= 9;
            }
            sep += r;
        }
        for (int i = 1; i < 9; i += 2) {
            sei += vector[i];
        }
        tot = 10 - ((sep + sei) % 10);
        if (tot == 10) {
            tot = 0;
        }
        if (vector[9] == tot) {
            return "Correcto";
        } else {
            return "Incorrecto";
        }   
    }
}
