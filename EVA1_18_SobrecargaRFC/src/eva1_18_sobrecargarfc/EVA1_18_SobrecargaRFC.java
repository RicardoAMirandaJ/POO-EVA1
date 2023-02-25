/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecargarfc;

/**
 *
 * @author ricar
 */
public class EVA1_18_SobrecargaRFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String RFC = generarRFC("RICARDO", "MIRANDA", "JIMÉNEZ", 04, 03, 20);
       System.out.println(RFC);
    }
    public static String generarRFC(String nombre, String apPat, String apMat, int año, int mes, int dia){
        String nom = nombre.charAt(0) + "";
        String apP1 = apPat.charAt(0) + "";
        String apP2 = apPat.charAt(1)+ "";
        String apM = apMat.charAt(0) + "";
        String RFC = apP1 + apP2 + apM + nom + año + mes + dia;
        return RFC;
    }
    //Sobrecargar para los Casos:
    //Falta un apellido --> Sustituir por X 
    //Faltan dos apellidos -->Sustituir por XX
}
