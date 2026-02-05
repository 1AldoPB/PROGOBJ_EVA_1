/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_modificadores_acceso;

/**
 *
 * @author aldop
 */
public class EVA1_2_MODIFICADORES_ACCESO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona perso=new Persona();//CREANDO INSTANCIA DE LA PERSONA EN EL OBJETO
        System.out.println(perso);//GUARDA LA DIRECCION DEL OBJETO
        perso.Nombre="Aldo";
        
    }
    
}
class Persona{ 
String Nombre;
String Apellido;
int Edad;



}
