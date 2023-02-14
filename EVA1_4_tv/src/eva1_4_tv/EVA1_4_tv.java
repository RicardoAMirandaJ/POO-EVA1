/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_tv;

/**
 *
 * @author ricar
 */
public class EVA1_4_tv {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //método() --> llamada a función
        Tv miTv = new Tv();
        miTv.bajarCanal();
        miTv.cambiarEstadoPoder();//la encendemos
        miTv.subirCanal();
        miTv.subirCanal();
        miTv.bajarCanal();
        miTv.bajarCanal();
        miTv.bajarCanal();
        miTv.bajarCanal();
    }
    
}
