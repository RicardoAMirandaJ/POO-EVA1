/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_2_clases_java;

/**
 *
 * @author ricar
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private boolean estadoCivil;
    //METODOS: COMPORTAMIENTO
    //lectura y escritura de atributos:
    //Métodos get --> leer, método set --> escribir
    //métodos:
    //modificador valor de retorno nombre (argumentos)(implementación)
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String valor){
        nombre = valor;
}
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String valor){
        apellido = valor;
}
    public int getEdad(){
        return edad;
    }
    public void setEdad(int valor){
        edad = valor;
}
     public boolean getEstadoCivil(){
        return estadoCivil;
    }
    public void setEstadoCivil(boolean valor){
        estadoCivil = valor;
}
    public void imprimirDatos(){
        System.out.println("Datos almacenados:");
                           //concatenación
                           //+ suma (números) + concatena <-- sobrecarga de operadores
        System.out.println("Nombre completo: " + nombre + " " + apellido);
        System.out.println("Edad: " + edad + " anos");
        if(estadoCivil)
            System.out.println("Estado civil: casado");
        else
            System.out.println("Estado civil: soltero");
    }
}
