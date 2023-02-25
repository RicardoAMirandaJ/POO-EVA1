/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_16_sobrecarga2;

/**
 *
 * @author ricar
 */
public class EVA1_16_SOBRECARGA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("suma: " + suma (4,5));
        System.out.println("suma: " + suma (4.0,5.0));
        System.out.println("suma: " + suma ("Hola","Mundo"));
        suma();
    }
    public static int suma(int val1, int val2){
        return val1 + val2;
    }
    //suma doble, doble
    public static double suma(double val1, double val2){
        return val1 + val2;
    }
    //suma string, string
    public static String suma(String val1, String val2){
        return val1 + val2;
    }
    public static void suma(){
        System.out.println("Metodo sin parametros suma");
    }
    
}
