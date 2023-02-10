/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_constructores;

/**
 *
 * @author ricar
 */
public class EVA1_3_CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaBancaria cuenta1 = new CuentaBancaria("1", 50, "Ricardo Miranda");
        /*
        cuenta1.setNomCliente("Ricardo Miranda");
        cuenta1.setNumCuenta("1");
        cuenta1.setSaldo(40000000);*/
        
        System.out.println("DATOS DEL CLIENTE:");
        String nombre = cuenta1.getNomCliente();
        System.out.println(nombre);
        String numCuenta = cuenta1.getNumCuenta();
        System.out.println(numCuenta);
        double saldo = cuenta1.getSaldo();
        System.out.println(saldo);
        //------------------------
        CuentaBancaria cuenta2 = new CuentaBancaria("2",1000000, "Ivan Vargas");
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println(cuenta2.getNomCliente());
        System.out.println(cuenta2.getNumCuenta());
        System.out.println(cuenta2.getSaldo());
        //------------------------
        CuentaBancaria cuenta3 = new CuentaBancaria();
        System.out.println("DATOS DEL CLIENTE:");
        System.out.println(cuenta3.getNomCliente());
        System.out.println(cuenta3.getNumCuenta());
        System.out.println(cuenta3.getSaldo());
    }
    
}
