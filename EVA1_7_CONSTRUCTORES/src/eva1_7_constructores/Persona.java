/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_7_constructores;

/**
 *
 * @author aldop
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    public Persona(){
    //SE USAN PARA INICIALIZAR OBJETOS
        System.out.println("EJECUCION DEL CONSTRUCTOR");
        nombre="-------";
        apellido="------------";
        edad= -1;
    }
    //FIRMA
   public Persona(String nombre,String apellido, int edad){
       //this---APUNTADOR A TODO EL CONTENIDO DEL OBJETO
       this.nombre=nombre;
       this.apellido=apellido;
       this.edad=edad;
       
       
}
public String getNombre(){
return nombre;
}
//(SOBRECARGA)public String getNombre(int X)
public void setNombre(String valor){
nombre=valor;
}
public String getApelldo(){
return apellido;

}
public void setApellido(String valor){
apellido=valor;
}
public int getEdad(){
 return edad;   
    
}
public void setEdad(int valor){
    edad=valor;  
}
public void ImprimirDatos(){
    System.out.println("NOMBRE:"+ nombre);
    System.out.println("APELLIDOS:"+ apellido);
    System.out.println("EDAD:"+ edad);

}
}

