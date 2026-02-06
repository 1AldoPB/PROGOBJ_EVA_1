/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva1_5_vehiculo;

/**
 *
 * @author aldop
 */
public class Vehiculo{
        private String marca;
        private String modelo;
        private int year;
        private String color;
        private double precio;
        private int kilometraje;
        // COMPORTAMIENTO
        public String getMarca(){
            return marca;
        }
        public void setMarca(String v){
            marca=v;
    }
        public String getModelo(){
            return modelo;
    }
        public void setModelo(String v){
        modelo=v;
    }
    public int getYear(int v){
    return year;
    }
    public void setYear(int v){
        year=v;
    }public String getColor(){
    return color;
    }
    public void setColor(String v){
    color=v;   
    }
    public double getPrecio(){
    return precio;
    }
    public void setPrecio(double v){
    precio=v;
    }
    public int getKilometraje(){
    return kilometraje;
    }
    public void setKilometraje(int v){
    kilometraje=v;
    }
 
public void imprimirDatos(){
        System.out.println("----------DATOS DEL VEHICULO------------");
        System.out.println("Marca:" + marca);
        System.out.println("Modelo:" + modelo);
        System.out.println("AÑO:"+ year);
        System.out.println("Color:" + color);
        System.out.println("Precio:" + precio);
        System.out.println("Kilometraje" + kilometraje);
    }
}
    


