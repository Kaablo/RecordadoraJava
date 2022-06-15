import java.util.Date;
import java.util.Properties;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        System.out.print("\n      -----------------------------------------------------------------------------------------------\n         "
                + "Bienvenido/a, soy ReVi, tu recordadora virtual. ¿A qué recuerdos te gustaría acceder hoy?\n\n         "
                + "PERSONAS (P), EVENTOS (E) o LISTAS (L)\n"
                + "      -----------------------------------------------------------------------------------------------\n\n\n");

        Scanner sca= new Scanner(System.in);
        
        String eleccion = sca.nextLine();
        
        Accion(eleccion);
            
        }
    
    static void Accion(String letra){
        
        
    }
}
