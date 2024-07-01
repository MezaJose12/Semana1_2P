import org.json.JSONObject;

public class JsonUtil {

    // Convierte un objeto Persona a un objeto JSON
    public static JSONObject personaToJson(Persona persona) {
        JSONObject json = new JSONObject();
        json.put("nombre", persona.getNombre());
        json.put("edad", persona.getEdad());
        json.put("email", persona.getEmail());
        return json;
    }

    // Convierte un objeto JSON a un objeto Persona
    public static Persona jsonToPersona(JSONObject json) {
        String nombre = json.getString("nombre");
        int edad = json.getInt("edad");
        String email = json.getString("email");
        return new Persona(nombre, edad, email);
    }
}

