package ec.edu.espe;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import org.json.JSONObject;

public class Aplicativo {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        ValidarCedula cedulita = new ValidarCedula();
        Funcion cedulita1 = new Funcion();
        String NumCedula = null;
        String dato;
        
        try{    
            while(true){
                System.out.println("Ingresa tu cedula : ");
                NumCedula = lee.nextLine();  
                
                if(NumCedula.length()==10){
                    break;
                }
                else{
                    System.out.println("Imgresate mal la cedula esta debe tener 10 digitos enteros:");
                }
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
            return;
        }
        
        try{
            while(true){
                System.out.println("Ingresa tu nombre:");
                String nombre = lee.nextLine();
                
                if(nombre.matches("[a-zA-Z]+")){
                    break;
                }
                else{
                    System.out.println("El nombre ingresado es incorrecto:");
                }
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
            return;                        
        }

            System.out.println("Ingresa tu nombre:");
            String nombre = lee.nextLine();
            System.out.println("Ingresa tu apellido:");
            String apellido = lee.nextLine();
            System.out.println("Ingresa tu edad:");
            String edad = lee.nextLine();
        
        

        int vector[] = new int[10];
        for (int i = 0; i < 10; i++) {
            vector[i] = Character.getNumericValue(NumCedula.charAt(i)); 
        }

        dato = cedulita.verificar(vector);
        System.out.println("Verificacion de cedula: " + dato);

        int array1[] = cedulita1.array(vector);
        System.out.println("Resultado de la funcion array:");
        for (int i = 0; i < 5; i++) {
            System.out.println(array1[i]);
        }

        
        JSONObject jsonResultado = new JSONObject();
        jsonResultado.put("cedula", NumCedula);
        jsonResultado.put("edad:", edad);
        jsonResultado.put("Nombre:", nombre);
        jsonResultado.put("Apellido:", apellido);
        jsonResultado.put("resultado", dato);
        
        String filePath = "C:\\Users\\Jose\\Desktop\\Semana1_2P\\ValidarCcedula\\ValidarCedula\\result.json";
        try (FileWriter file = new FileWriter(filePath)) {
            file.write(jsonResultado.toString());
            file.flush();
            System.out.println("Resultado guardado en " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
