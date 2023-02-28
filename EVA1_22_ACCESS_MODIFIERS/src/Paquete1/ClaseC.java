/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete1;

import Paquete2.ClaseE;

/**
 *
 * @author ricar
 */
public class ClaseC {
    public int publicC;
    int defaultC;
    private int privateC;
    
    public void prueba(){
        ClaseA objA = new ClaseA();
        //objA.publicA; atributos visibles
        //objA.defaultA;
        
        ClaseB objB = new ClaseB();
        //objB.publicB; atributos visibles
        //objB.defaultB;
        
        ClaseD objD = new ClaseD();
        //objD.publicD; atributos visibles
        //objD.defaultD;
        
        //Clase E esta en otro paquete y archivo
        //hay que agregar la clausula "import"
        ClaseE objE = new ClaseE();
        //objE.publicE; solo el atributo publico
        
        //ClaseF es default y es invisible
        //para las clases de este Paquete1
        //ClaseF objF = new ClaseF();
    }
}

class ClaseD{
    public int publicD;
    int defaultD;
    private int privateD;
    
}
