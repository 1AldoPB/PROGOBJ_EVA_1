/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_5_vehiculo;

/**
 *
 * @author aldop
 */
public class EVA1_5_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo();
        vehiculo.setColor("AZUL");
        vehiculo.setKilometraje(1000000);
        vehiculo.setMarca("FORD");
        vehiculo.setModelo("MUSTANG");
        vehiculo.setYear(2025);
        
        Vehiculo[] agencia= new Vehiculo[10];
        System.out.println("arreglo: " + agencia);
        for(int i=0; i< agencia.length; i++){
        agencia[i]= new  Vehiculo();
        agencia[i].setColor("A");
        agencia[i].setKilometraje(i);
        agencia[i].setModelo("M");
        agencia[i].setPrecio(i);
        agencia[i].setYear(i);
        agencia[i].setMarca("A");
        agencia[i].imprimirDatos();
                }
        }
}