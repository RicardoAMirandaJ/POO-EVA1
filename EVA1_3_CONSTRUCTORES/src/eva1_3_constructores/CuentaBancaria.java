/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author ricar
 */
public class CuentaBancaria {
    //atributos de la clase
    private String numCuenta;
    private double saldo;
    private String nomCliente;
    //constructores
    //default y con argumentos
    public CuentaBancaria(){//constructor default
        numCuenta = "----";
        saldo = 0;
        nomCliente = "----";
    }
    public CuentaBancaria(String nCuenta, double otroSaldo, String nCliente){
      numCuenta = nCuenta;
      saldo = otroSaldo;
      nomCliente = nCliente;
    }
    
    //comportamiento
    //métodos get y set
    public String getNumCuenta(){
        return numCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getNomCliente(){
        return nomCliente;
    }
    public void setNumCuenta(String valor){
        numCuenta = valor;
    }
    public void setSaldo (double valor){
        saldo = valor;
    }
    public void setNomCliente (String valor){
        nomCliente = valor;
    }
}
