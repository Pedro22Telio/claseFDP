/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD3;

/**
 *
 * @author perte
 */
public class ejercioExamen {
    public static void main(String[] args) {
 
        String[][] matriz = new String[8][12];
        matriz[0][0] = "Marta";
        matriz[0][1] = "Luis";
        matriz[0][2] = "Nacho";
        matriz[1][0] = "Juancho";
        matriz[1][1] = "Anabel";
        matriz[1][2] = "Julio";
        matriz[2][0] = "María";
        matriz[2][1] = "David";
        matriz[2][2] = "Gema";
        for (int x=0; x < matriz.length; x++) {
  System.out.print("|");
    for (int y=0; y < matriz[x].length; y++) {
      System.out.print (matriz[x][y]);
      if (y!=matriz[x].length-1) System.out.print("\t");
    }
  System.out.println("|");
}
        
    
    }
    
     
    
}
