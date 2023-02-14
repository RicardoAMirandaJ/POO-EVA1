/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_tv;

/**
 *
 * @author ricar
 */
public class Tv {
    private int volumen;
    private int canal;
    private boolean poder;
    //constructores
    public Tv(){//constructor default
        volumen = 0;
        canal = 0;
        poder = false;//apagado
    }
    //métodos para operar la TV (interfaz)
    //encender y apagar la TV
    public void cambiarEstadoPoder(){
        //verificar el estado de la TV
        if(poder == true){
            poder = false;
            System.out.println("Apagando pandalla");
        }else{
            poder = true;
            System.out.println("Encendiendo pantalla");
        }
    }
    //volumen
    public void subirVolumen(){
        if (poder == true){//if (poder) la tv está prendida
            if(volumen < 100){//no debemos de pasar de 100
                volumen = volumen + 1;//acumulador
                //volumen++;
                //volumen+=1;
                System.out.println("Volumen: " + volumen);
            }
        }
    }
    public void bajarVolumen(){
        if (poder == true){//if (poder)
            if (volumen > 0){
                volumen = volumen - 1;//acumulador
                //volumen--;
                //volumen-=1;
                System.out.println("Volumen: " + volumen);
            }
        }
    }
    public void bajarCanal(){
        if (poder == true){
            canal = canal -1;
            if(canal < 0)
                canal = 100;
                
                System.out.println("Canal: " + canal);
            }
        }
    public void subirCanal(){
        if (poder == true){
            canal = canal + 1;
                if(canal > 100)
                    canal = 0;
                    System.out.println("Canal: " + canal);   
        }
    }
}
