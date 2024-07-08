// EmpleadoMedioTiempo.java
public class EmpleadoMedioTiempo extends Empleado {
    private double salarioPorHora;
    private int horasTrabajadas;

    public EmpleadoMedioTiempo(String nombre, String id, double salarioPorHora, int horasTrabajadas) {
        super(nombre, id);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}
