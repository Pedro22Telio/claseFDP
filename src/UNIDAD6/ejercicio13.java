/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD6;

import java.util.Scanner;

/**
 *
 * @author perte
 */
public class ejercicio13 {
    public static void main(String[] args) {
        int i=1;
        
        System.out.println("CICLO WHILE");
               
        while(i<=5){
            System.out.println(i+"");
            i+=1;
            //i++ es el mas usual
        }
        System.out.println("\nCICLO DO-WHILE");
        i=1;
        do {            
            System.out.println(i+"");
            
         i++;   
        } while (i<=5);
        
        System.out.println("\nCICLO FOR");
        
        for ( i = 1; i <=5; i++) {
           
            System.out.println(i+"");
        }
            
        }
    }
    
         

