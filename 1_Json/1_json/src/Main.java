import org.json.JSONObject;

public class Main {

    public static void main(String[] args) {
        // Crear un objeto Persona
        Persona persona = new Persona("Juan", 30, "juan@example.com");

        // Convertir el objeto Persona a JSON
        JSONObject json = JsonUtil.personaToJson(persona);
        System.out.println("Objeto JSON: " + json.toString());

        // Convertir el objeto JSON de nuevo a un objeto Persona
        Persona personaDesdeJson = JsonUtil.jsonToPersona(json);
        System.out.println("Nombre: " + personaDesdeJson.getNombre());
        System.out.println("Edad: " + personaDesdeJson.getEdad());
        System.out.println("Email: " + personaDesdeJson.getEmail());
    }
}

