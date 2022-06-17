import java.util.Date;
import java.util.Properties;
import java.util.Scanner;
import recordadorajava.Persona;


public class Main {
    public static void main(String[] args) throws Exception {
        
       
        
        System.out.print("\n\n      -----------------------------------------------------------------------------------------------\n         "
                + "Bienvenido/a, soy ReVi, tu recordadora virtual. ¿A qué recuerdos te gustaría acceder hoy?\n\n         "
                + "PERSONAS (P), EVENTOS (E) o LISTAS (L)\n"
                + "      -----------------------------------------------------------------------------------------------\n\n\n");
        Scanner sca= new Scanner(System.in);
        
        String eleccion = sca.nextLine();
        
      
        Accion(eleccion);
        
            
    }
    
    static void Accion(String letra){
        
        letra.toUpperCase();
        switch (letra){
            case "P":
                    RPersona();
            case "E":
                    REvento();
            case "L":
                    RLista();
            default:
                    System.out.print("La letra elegida es incorrecta");
                    try {
                    //Ponemos a "Dormir" el programa durante los ms que queremos
                        Thread.sleep(2*1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ReInicio();
                    
        }
    }
    static void ReInicio(){
        System.out.print("\n\n\n      -----------------------------------------------------------------------------------------------\n         "
                + "¿A qué recuerdos te gustaría acceder hoy?\n\n         "
                + "PERSONAS (P), EVENTOS (E) o LISTAS (L)\n"
                + "      -----------------------------------------------------------------------------------------------\n\n\n");

        Scanner sca= new Scanner(System.in);
        
        String eleccion = sca.nextLine();
        
        Accion(eleccion);
    }
    
    static void RPersona(){
        System.out.print("\n\n\n      -----------------------------------------------------------------------------------------------\n         "
                + "Acesso concedido a tus recuerdos sobre personas. ¿Quieres crear uno nuevo o consultarlo?\n\n         "
                + "NUEVO (N) o CONSULTAR (C)\n"
                + "      -----------------------------------------------------------------------------------------------\n\n\n");
        
         Scanner sca= new Scanner(System.in);
        
        String eleccion = sca.nextLine();
        eleccion.toUpperCase();
        
        switch (eleccion){
            case "N":
                System.out.print("\n\n\n      -----------------------------------------------------------------------------------------------\n         "
                + "Creando recuerdo sobre una persona...\n ¿Como se llama esa persona?\n\n         "
                + "Nombre:\n");
               
                String nombre = sca.nextLine();
                eleccion.toUpperCase();
                
                System.out.print("\n\n ¿Cuando nació? \n\n Cumpleaños(XX/XX/XXXX): ");                
                String cumple =sca.nextLine();
                
                System.out.print("\n\n ¿Cuál es su telefono? \n\n Telefono: ");                               
                Scanner sca2= new Scanner(System.in);
                int tel = sca2.nextInt();
                
                System.out.print("\n\n ¿Otros datos? \n\n Datos: ");
                String desc =sca.nextLine();
              
                Persona n001 = new Persona(nombre, cumple, tel, desc);
                
            default:
                
                Persona n002 = new Persona("Pablo", "16/12/95",608181809, "Parece simpático");
                System.out.print(n002.toString());
                
                try {
                    //Ponemos a "Dormir" el programa durante los ms que queremos
                        Thread.sleep(2*1000);
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                    ReInicio();
        }
    }
}
        