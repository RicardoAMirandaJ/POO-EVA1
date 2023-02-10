/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author ricar
 */
public class EVA1_2_CLASES_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //CLASE ES LA RECETA:
        //OBJETO ES EL PLATILLO
        //INSTANCIACIÓN:
        //1. Declarar el identificador para el objeto
        //2. Asignar memoria con new
        //3. Invocar su constructor
        //Persona() --> constructor;
        //constructor --> método
        Persona perso1 = new Persona();
        Persona perso2 = new Persona();
        //System.out.println(perso1);
        /*:
        //ESTA SECCIÓN ES PORQUE INICIAMOS CON LOS
        //ATRIBUTOS CON MODIFICADOR DEFAULT
        perso1.nombre = "Ricardo";
        perso1.apellido = "Miranda";
        perso1.edad = 18;
        perso1.estadoCivil = true; //true es casado
        
        System.out.println(perso1.nombre);*/
        perso1.setNombre("Ricardo Alberto");
        // System.out.println(perso1.getNombre());
        perso1.setApellido("Miranda Jimenez");
        // System.out.println(perso1.getApellido());
        perso1.setEdad(18);
        // System.out.println(perso1.getEdad());
        perso1.setEstadoCivil (false);
        // System.out.println(perso1.getEstadoCivil());
        perso1.imprimirDatos();
        
        perso2.setNombre("Daniel Yadhir");
        perso2.setApellido("Castruita Amaton");
        perso2.setEdad(18);
        perso2.setEstadoCivil (false);
        perso2.imprimirDatos();
    }
}
