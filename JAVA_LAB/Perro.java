// ʕ•́ᴥ•̀ʔっ♡.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.ʕ•́ᴥ•̀ʔっ♡
// Autores:
// ʕ○ᵔᴥᵔʔ María José Ramírez Cifuentes /Carné: 221051 ʕ○ᵔᴥᵔʔ
// Sección: 40
// POO
// Laboratorio 1: Clases en Java
// ʕ•́ᴥ•̀ʔっ♡﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿ʕ•́ᴥ•̀ʔっ♡

import java.util.Random;

public class Perro {
    private String nombrep;
    private String raza;
    private String color;
    private float peso;
    private float tamaño;
    private Random rand = new Random();
    private int umbral;
    private int animo;
    

    public Perro(String nombrep, String raza, String color, float peso, float tamaño){
        this.nombrep= nombrep;
        this.raza = raza;
        this.color = color;
        this.tamaño = tamaño;
        this.peso= peso;
        this.umbral = rand.nextInt(-20, 20)+1;
        this.animo = rand.nextInt(-5, 5)+1;
    }

    
    /** 
     * @param persona
     */
    public void mood(Persona persona){
        String respuesta="";
        this.animo=(int) ((1.0/persona.getConfiabilidad())*(rand.nextFloat()-0.5)*10+this.animo);
        if(persona.getTieneGalleta()){
            respuesta=persona.give_galleta(this);
        }
        System.out.println("El animo del perro ahora es de: "+this.animo);
    }
        public String ladra(){return "Guaf";}
        public String muerde(){return this.nombrep+" Auch!";}
        public String mueveCola(){return this.nombrep+" Mueve su cola";}

    
    /** 
     * @return String
     */
    /*
     * 
     */

    public String getNombrep(){
        return this.nombrep;
    }
    
    /** 
     * @return String
     */
    public String getRaza(){
        return this.raza;
    }
    
    /** 
     * @return String
     */
    public String getColor(){
        return this.color;
    }

    
    /** 
     * @return float
     */
    public float getPeso(){
        return this.peso;
    }
    
    /** 
     * @return float
     */
    public float getTamaño(){
        return this.tamaño;
    }
    
    /** 
     * @return int
     */
    public int getAnimo(){
        return this.animo;
    }

    
    /** 
     * @return int
     */
    public int getUmbral(){
        return this.umbral;
    }
    

/** 
 * @param nombrep
 */
/*
     * 
     */

    public void setNombrep(String nombrep) {
		this.nombrep = nombrep;
    }

    
    /** 
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
	}
    
    /** 
     * @param color
     */
    public void setColor(String color) {
		this.color = color;
    }

    
    /** 
     * @param peso
     */
    public void setPeso(float peso) {
		this.peso = peso;
    }

    
    /** 
     * @param tamaño
     */
    public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
    }


    
    /** 
     * @return String
     */
    public String ToString(){
        String cadena = "";
        cadena += "\nNombre: "+this.nombrep; 
        cadena += "\nRaza:"+this.raza;
        cadena +="\nColor: "+this.color;
        cadena += "\nPeso:" +this.peso;
        cadena += "\nTamaño: "+this.tamaño;
        cadena += "\nAnimo: "+this.animo;
        cadena +=  "\nUmbral: "+this.umbral;
        return cadena;
    } 
}
