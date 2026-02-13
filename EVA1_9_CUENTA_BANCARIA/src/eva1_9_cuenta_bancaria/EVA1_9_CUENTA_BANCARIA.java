/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_cuenta_bancaria;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_9_CUENTA_BANCARIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        Cuenta cuenta= new Cuenta("ALDO ", 5000.0);
       cuenta.imprimirSaldo(1000);
       cuenta.ingresar(0);
       cuenta.retirar(0);
       
    }
    
}
