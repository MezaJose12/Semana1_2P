package ec.edu.espe;

public class VerificacionResultado {
    private String cedula;
    private String resultado;
    private String nombre;
    private String apellido;
    private String edad;

    public VerificacionResultado(String cedula, String resultado,String nombre,String apellido,String edad) {
        this.cedula = cedula;
        this.resultado = resultado;
        this.apellido = apellido;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}


