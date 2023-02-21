/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_automovil;

/**
 *
 * @author ricar
 */
public class EVA1_6_AUTOMOVIL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil car1 = new Automovil("FORD","F-150",2023,"Ricardo Miranda","8J3-5D2");
        car1.imprimirDatos();
        car1.setAño(2010);
        car1.imprimirDatos();
    }
    
}
