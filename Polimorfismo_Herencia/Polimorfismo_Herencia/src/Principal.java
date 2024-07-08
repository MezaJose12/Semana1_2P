// Principal.java
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();

        while (true) {
            System.out.println("Ingrese el tipo de empleado (tiempo completo/medio tiempo) o 'salir' para terminar:");
            String tipo = scanner.nextLine().toLowerCase();

            if (tipo.equals("salir")) {
                break;
            }

            System.out.println("Ingrese el nombre del empleado:");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el ID del empleado:");
            String id = scanner.nextLine();

            Empleado empleado = null;
            switch (tipo) {
                case "tiempo completo":
                    System.out.println("Ingrese el salario mensual:");
                    double salarioMensual = scanner.nextDouble();
                    scanner.nextLine(); // Consumir el salto de línea
                    empleado = new EmpleadoTiempoCompleto(nombre, id, salarioMensual);
                    break;
                case "medio tiempo":
                    System.out.println("Ingrese el salario por hora:");
                    double salarioPorHora = scanner.nextDouble();
                    System.out.println("Ingrese las horas trabajadas:");
                    int horasTrabajadas = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    empleado = new EmpleadoMedioTiempo(nombre, id, salarioPorHora, horasTrabajadas);
                    break;
                default:
                    System.out.println("Tipo de empleado no reconocido.");
                    continue;
            }

            empleados.add(empleado);
        }

        System.out.println("\nLos empleados registrados son:");
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre() + ", ID: " + empleado.getId() + ", Salario: " + empleado.calcularSalario());
        }

        scanner.close();
    }
}
