// ʕ•́ᴥ•̀ʔっ♡.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.ʕ•́ᴥ•̀ʔっ♡
// Autores:
// ʕ○ᵔᴥᵔʔ María José Ramírez Cifuentes /Carné: 221051 ʕ○ᵔᴥᵔʔ
// Sección: 40
// POO
// Laboratorio 1: Clases en Java
// ʕ•́ᴥ•̀ʔっ♡﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿.﹀.︿ʕ•́ᴥ•̀ʔっ♡


import java.util.Scanner;


public class Driver {
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        boolean flagPerro = false, flagPersona = false;
        Scanner scanner = new Scanner(System.in);
        Perro perro = new Perro("", "", "",  0, 0);
        Persona persona = new Persona("nombre", 0,  false);
        System.out.println("¡Hola, Bienvenid@ ");
        
        /** 
     * menu
     */
        int opcion = 0;
        while(opcion != 4){
            System.out.println("------------------------------------------------------------");
            System.out.println("Bienvenid@, ¿qué deseas hacer el día de hoy?: ");
            System.out.println("Menú:");
            System.out.println("1. Ingresar nueva Persona.");
            System.out.println("2. Ingresar nuevo perro.");
            System.out.println("3. Tener interacción con los peludos.");
            System.out.println("4. Salir del programa"); 
            System.out.println("------------------------------------------------------------"); 
            opcion = scanner.nextInt();

            /** 
     * Opción crear persona
     */
            if(opcion ==1){
                String nombre, tieneGalletas;
                int edad;
                Boolean tieneGalletaClase = false;

                System.out.println("Ingresa su nombre, por favor: ");
                nombre = scanner.next();

                System.out.println("Ingresa su edad ");
                edad = scanner.nextInt();

                System.out.println("¿Posee aún galletas?  ");
                tieneGalletas = scanner.next();
                if (tieneGalletas == "si") {
                    tieneGalletaClase = true;
                } else {
                    tieneGalletaClase = false;
                }

                /** 
     * sets para definir variables
     */

                persona.setNombre(nombre);
                persona.setEdad(edad);
                persona.setTienenGalletas(tieneGalletaClase);

                System.out.println("Gracias, sus datos se han registrado correctamente");

                flagPersona = true;
            }

            /** 
     * opcion crear perro
     */
            else if(opcion == 2){
                String nombrep, raza, color;
                float peso, tamaño;

                System.out.println("-----¡Empecemos ;)!-------");
                System.out.println("Ingrese el nombre del perro, por favor: ");
                nombrep = scanner.next();
                System.out.println("Ingrese la raza del perro, por favor: ");
                raza = scanner.next();
                System.out.println("Ingrese el color del perro, por favor: ");
                color = scanner.next();
                System.out.println("Ingrese el peso del perro(en libras), por favor: ");
                peso = scanner.nextFloat();
                System.out.println("Ingrese el tamaño del perro(en metros), por favor: ");
                tamaño = scanner.nextFloat();

                /** 
     * sets para definir variables
     */
                perro.setNombrep(nombrep);
                perro.setRaza(raza);
                perro.setColor(color);
                perro.setPeso(peso);
                perro.setTamaño(tamaño);

                System.out.println("Felicidades, ha sido registrado correctamente");
                System.out.println(perro.ToString());
                flagPerro = true;
            }

            /** 
     * Opción animo e interacción
     */
            else if(opcion==3){
                if (flagPerro == false || flagPersona == false) {
                    System.out.println("Gracias, ya casi estamos listo. Inserta los datos de el peludo y tu persona :)");
                }else{ 
                    int umbral = perro.getUmbral();
                    if (umbral < -5) {
                        System.out.println(perro.muerde());
                    } else if (umbral >= -5 && umbral <= 5) {
                        System.out.println(perro.ladra());
                    }else if (umbral > 5) {
                        System.out.println(perro.mueveCola());
                    }
                    perro.mood(persona);}

                    /** 
     * Salir
     */

            }else if(opcion ==4){
                System.out.println("ʕ•́ᴥ•̀ʔっ♡ ¡Hasta la próxima! ʕ•́ᴥ•̀ʔっ♡"); 
            }
            
        }
    }
}