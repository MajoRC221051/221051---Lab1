// ʕ•́ᴥ•̀ʔっ♡.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.ʕ•́ᴥ•̀ʔっ♡
// Autores:
// ʕ○ᵔᴥᵔʔ María José Ramírez Cifuentes /Carné: 221051 ʕ○ᵔᴥᵔʔ
// Sección: 40
// POO
// Laboratorio 1: Clases en Java
// ʕ•́ᴥ•̀ʔっ♡﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿ʕ•́ᴥ•̀ʔっ♡

import java.util.Random;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private int confiabilidad;
    private boolean tieneGalleta;
    Scanner myObj = new Scanner(System.in);

    /*
     * 
     */

     public Persona(String nombre,int edad,  boolean tieneGalleta ){
        this.nombre= nombre;
        this.edad = edad;
        Random confi = new Random();
        this.confiabilidad = confi.nextInt(10)+1;
        System.out.println(this.confiabilidad);
        this.tieneGalleta = tieneGalleta;
     }

     
     /** 
      * @param perro
      * @return String
      */
     public String give_galleta(Perro perro){
        String c="";
        if(tieneGalleta){
            c=this.nombre+"Le ha dado una galleta al peludo: "+perro.getNombrep();
        }
        return c;
    }

     
        
        /** 
         * @return String
         */
        public String getNombre(){
            return this.nombre;
        }
        
        /** 
         * @return int
         */
        public int getEdad(){
            return this.edad;
        }
        
        /** 
         * @return int
         */
        public int getConfiabilidad(){
            return this.confiabilidad;
        }

        
        /** 
         * @return boolean
         */
        public boolean getTieneGalleta(){
            return this.tieneGalleta;
        }   


        
        /** 
         * @param nombre
         */
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
    
        
        /** 
         * @param edad
         */
        public void setEdad(int  edad) {
            this.edad = edad;
        }
        
        /** 
         * @param tieneGalleta
         */
        public void setTienenGalletas(Boolean tieneGalleta) {
            this.tieneGalleta = tieneGalleta;
    
            
        }


    
    /** 
     * @return String
     */
    /*
     * 
     */

 

    /*
     * 
     */

    
		


/* (non-Javadoc)
	 * @see java.lang.Object#toString()
     * @Override
	 */
	public String toString(){
        String cadena = "";
        cadena += "\nNombre: "+nombre;
        cadena += "\nEdad:"+this.edad;
        cadena += "\nConfiabilidad: "+this.confiabilidad;
        String cadenaTieneGalleta = "";
        if(this.tieneGalleta == true){
            cadenaTieneGalleta =  "Si tiene Galletas";
        }
        else{
            cadenaTieneGalleta = "No tiene galletas";
        }
        cadena+= "\nTienenGalletas " +cadenaTieneGalleta;
        return cadena;
    }

}




