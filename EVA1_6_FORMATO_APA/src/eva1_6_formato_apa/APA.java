/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author aldop
 */
public class APA {
    private String Autor;
    private String Titulo;
    private int Año;
    private String Ciudad;
    private String Editorial;
     
    public String getAutor(){
            return Autor;
        }
        public void setAutor(String v){
            Autor=v;
    }
        public String getTitulo(){
            return Titulo;
    }
        public void setTitulo(String v){
        Titulo=v;
    }
    public int getAño(int v){
    return Año;
    }
    public void setAño(int v){
        Año=v;
    }public String getCiudad(){
    return Ciudad;
    }
    public void setCiudad(String v){
    Ciudad=v;   
    }
    public String getEditorial(){
    return Editorial;
    }
    public void setEditorial(String v){
    Editorial=v;
    }
   
 
public void imprimirApa(){
        System.out.println("----------DATOS DEL LIBRO------------");
        System.out.println("AUTOR:" + Autor);
        System.out.println("Titulo:" + Titulo);
        System.out.println("AÑO:"+ Año);
        System.out.println("Ciudad:" + Ciudad);
        System.out.println("Editorial:" + Editorial);
        
}
}
