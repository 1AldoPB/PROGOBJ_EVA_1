
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aldop
 */
public class pv {
    Scanner sc=new Scanner(System.in);
    private String productos;
    private String marca;
    private double peso;
    private double precio;
    private double cantidad;
    public String getProductos(){
    return productos;
   }
    public void setProductos(String v){
        System.out.println("INTRODUZCA EL PRODUCTO");
    productos=sc.nextLine();
        productos=v;
    
    }
    public String getMarca(){
    return marca;
    
    }
    public void setMarca(String v){
        System.out.println("INTRODUZCA LA MARCA");
    marca=sc.nextLine();
    marca=v;
    
    }
    public double getPeso(){
    return peso;
    
    }
    public void setPeso(double v){
        System.out.println("INTRODUZCA EL PESO");
    peso=sc.nextDouble();
    peso=v;
    
    }
    public double getPrecio(){
    return precio;
    
    }
    public void setPrecio(double v){
        System.out.println("PONGA EL PRECIO");
    precio=sc.nextDouble();
    precio=v;
    
    
    }
    public double getCantidad(){
    return cantidad;
    
    }
    public void setCantidad(double v){
        System.out.println("INTRODUZZCA LA CANTIDAD DE VENTA");
    cantidad=sc.nextDouble();
    cantidad=v;
    
    
    }
    public void imprimirDatos(){
        System.out.println("-------ASIGNACION DE PRODUCTOS");
        System.out.println("Producto:" + productos);
        System.out.println("Maarca:" + marca);
        System.out.println("Peso:" + peso);
        System.out.println("precio:" + precio);
        System.out.println("Cantidad:" + cantidad);
    
    
    
    
    }
    
}
