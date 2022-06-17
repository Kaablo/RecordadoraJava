/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recordadorajava;

import java.util.Date;


/**
 *
 * @author pablo
 */
public class Persona {

    private String nombre="";
    private String fecha= "0/0/00";
    private String descripcion ="";
    private int telefono=0;

    //constructor
    public Persona (){}
    
    public Persona (String nom, String fecha, int tel, String desc){
        
        this.nombre=nom;
        this.fecha=fecha;
        this.descripcion=desc;
        this.telefono=tel;   
    }

    //Metodos getter
    public String dimeNombre(){
        return nombre;
    }

    public String dimeFecha(){
        return fecha;
    }
    public String dimeDesc(){

        return descripcion;
    }
    public int dimeTelef(){
        return telefono;
    }

    //metodos setter
    public void ponNombre(){
        
    }

    public void ponFecha(){

    }
    
    public void ponDesc(){

    }
    
    public void ponTelef(){
        
    }

    //Método toString
    @Override
    
    public String toString(){
        return "Nombre: "+ nombre+ "\nCumpleaños: "+fecha+"\nTeléfono: "+telefono+"\nOtros datos: "+descripcion;
    }
    
    
}

