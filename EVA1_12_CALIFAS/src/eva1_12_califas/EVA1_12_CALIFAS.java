/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_califas;

/**
 *
 * @author ricar
 */
public class EVA1_12_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cali;
        cali = califas(85);//almaceno el resultado en una variable
        System.out.println("Califa para 85: " + cali);
        System.out.println("Califa para 70: " + califas(70)); 
        califas(100);//ignoro el resultado
    }
    public static String califas (int califa){
        String resu = "";
        if((califa >=91)&&(califa <= 100)){
            resu = "A";
        }
        else if((califa >= 81) && (califa <= 90)){
            resu = "B";
        }
        else if((califa >= 71) && (califa <= 80)){
            resu = "C";
        }
        else{
            resu = "D";
        }
        return resu;
    }
}
