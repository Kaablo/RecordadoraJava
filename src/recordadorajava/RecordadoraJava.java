import java.util.Date;
import java.util.Properties;
import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("\n      -----------------------------------------------------------------------------------------------\n         Bienvenido/a, soy ReVi, tu recordadora virtual. ¿A qué recuerdos te gustaría acceder hoy?\n\n         PERSONAS (P), EVENTOS (E) o LISTAS (L)\n      -----------------------------------------------------------------------------------------------\n\n\n");

        Scanner sca= new Scanner(System.in);
        
        String eleccion = sca.nextLine();


    }
}

class Memorias {

   
    private String nombre="";
    private Date fecha=new Date();

//contructores
    public Memorias (){}

    public Memorias (String nom, Date fecha){

        this.nombre=nom;
        this.fecha=fecha;
    }

//Metodos getter
    public String dimeNombre(){

        return nombre;
    }

    public Date dimeFecha(){

        return fecha;
    }

//metodos setter
    public void ponNombre(){
        
    }

    public void ponFecha(){

    }
}

class Persona extends Memorias {

    int telefono=0;
    String descripcion ="";

    //constructor
    public Persona (int tel, String desc){
        super();
        tel=telefono;
        desc=descripcion;
    }

    //Metodos getter
    public int dimeTelef(){

        return telefono;
    }

    public String dimeDesc(){

        return descripcion;
    }

    //metodos setter
    public void ponTelef(){
        
    }

    public void ponDesc(){

    }
}

class Evento extends Memorias {

    String Descripcion ="";

}

class Lista extends Memorias {
    
    String [] elementos;
}