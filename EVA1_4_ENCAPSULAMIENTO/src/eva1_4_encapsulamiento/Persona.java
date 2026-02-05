/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_4_encapsulamiento;

/**
 *
 * @author aldop
 */
public class Persona {
    //ATRIBUTOS
   private String nombre;
   private String apellido;
   private int edad;
   private char genero;
    //CONSTRUCTORES
    //COMPORTAMIENTO:// interfaz
   //get y set
   public String getNombre(){
   return nombre;
   }
   public void setNombre(String valor){
   nombre= valor;
   }
   public String getApellidos(){
   return apellido;
   
   }
   public void setApellidos(String valor){
   apellido=valor;
   }
   public int getEdad(){
   return edad;
   
   }
   public void setEdad(int valor){
   edad=valor;
   
   }
   public char getGenero(){
   return genero;
   }
   public void setGenero(char valor){
   genero=valor;
   
   }
   public void ImprimirDatos(){
       System.out.println("Nombre:" + nombre);
       System.out.println("EDAD:" + edad);
       System.out.println("Apellidos:" + apellido);
       System.out.println("Genero:" + genero);
   
   
   }
}
