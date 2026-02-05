/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_clases;

/**
 *
 * @author aldop
 */
public class EVA1_1_CLASES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso1;
        perso1=new Persona();
        Persona perso2 = new Persona();
        perso1.Apellido="PIÑON BORUNDA";
        perso1.Nombre="ALDO";
        perso1.Edad=24;
        perso1.imprimir();
    }
    
}
class Persona{
String Nombre;
String Apellido;
int Edad;
void imprimir(){
    System.out.println("NOMBRE:" + Nombre);
    System.out.println("APELLIDO:" + Apellido);
    System.out.println("EDAD:" + Edad);
}




}
