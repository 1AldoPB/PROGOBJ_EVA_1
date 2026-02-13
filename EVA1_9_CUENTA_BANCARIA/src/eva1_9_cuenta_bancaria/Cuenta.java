/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_9_cuenta_bancaria;

import java.util.Scanner;

/**
 *
 * @author aldop
 */
public class Cuenta {

    public Cuenta(String aldo_, double par) {
    }
    Scanner sc=new Scanner(System.in);
    private String titular;
    private double monto;
    private double montoActual;
    public void cuentaBancaria(){
    this.titular="-----";
    this.monto=0;
    
    }
        public void cuentaBancaria(String titular,double monto){
        this.titular="titular";
        this.monto=100000;
                }
    public void ingresar(double monto){
        if (monto>0 )
    this.monto+=monto;
        else{
            System.out.println("NO SE PUEDE REALIZAR LA OPERACION");
        
        }
    
    }
    public void retirar(double monto){
        if (this.monto>0) 
    this.monto-=monto;
        else{
            System.out.println("SALDO INSUFICIENTE");
        }
    }

    public void imprimirSaldo(double s){
    monto=s;
        System.out.println("SU Saldo es:" + s);
    }
}
