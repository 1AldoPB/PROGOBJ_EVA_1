/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_formato_apa;

/**
 *
 * @author aldop
 */
public class EVA1_6_FORMATO_APA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        APA a =new APA();
        
        APA[] Formato=new APA[1];
         System.out.println("arreglo: " + Formato);
        for(int i=0; i< Formato.length; i++){
        Formato[i]= new  APA();
        Formato[i].setAutor("Eric Nylund");
        Formato[i].setAño(2001);
        Formato[i].setCiudad("New York (Nueva York)");
        Formato[i].setEditorial("Del Rey");
        Formato[i].setTitulo("Halo: The Fall of Reach");
        Formato[i].imprimirApa();
        
    }
    }
}
