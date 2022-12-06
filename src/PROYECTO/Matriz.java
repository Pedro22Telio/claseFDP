/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTO;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author perte
 */
public class Matriz {
    public static void main(String[] args) {
       
   
        Random aleatorio= new Random ();
       
        int [][]Matriz=new int[5][5];
        
        for (int i = 0; i < Matriz.length; i++) {
            
            for (int j = 0; j < Matriz.length; j++) {
                Matriz[i][j] = aleatorio.nextInt(99-10+1)+10;
                
            }
         
        }
        System.out.println("Matriz 5x5 en numeros aleatorios\n");
        String imprimir="";
        for (int i = 0; i < Matriz.length; i++) {
        
            for (int j = 0; j < Matriz.length; j++) {
               
             imprimir=imprimir+" | "+Matriz[i][j];
            }
            imprimir=imprimir+" | \n"; 
        }
            
            System.out.println(imprimir);
}     

} 
          

