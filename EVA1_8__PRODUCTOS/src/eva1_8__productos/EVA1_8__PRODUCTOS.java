/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_8__productos;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class EVA1_8__PRODUCTOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     Punto pv=new Punto();
     pv.capturaDatos();
        pv.imprimirDatos();
        pv.calcularMonto();
        
    }
    
}
