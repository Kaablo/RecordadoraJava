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
public class Memorias {

   
    private String nombre="";
    private Date fecha=new Date();
    private String descripcion ="";

//contructores
    public Memorias (){}

    public Memorias (String nom, Date fecha, String desc){

        this.nombre=nom;
        this.fecha=fecha;
        this.descripcion=desc;
    }

//Metodos getter
    public String dimeNombre(){
        return nombre;
    }

    public Date dimeFecha(){
        return fecha;
    }
    public String dimeDesc(){

        return descripcion;
    }
//metodos setter
    public void ponNombre(){
        
    }

    public void ponFecha(){

    }
    
    public void ponDesc(){

    }
