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
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        int noviasBadBunny, noviasTiti;
        System.out.println("Titi me pregunto si tengo muchas novias");
        System.out.println("\nTiti:-BadB ¿pero cuantas novias tu tienes muchacho?");
        noviasBadBunny=lector.nextInt();
        System.out.println("BadB:- y tu Titi ¿cuantas novias tiene?");
        noviasTiti=lector.nextInt();

        if(noviasBadBunny<noviasTiti);
            System.out.println("Titi tiene mas novias que BadBunny");
        
        
        if(noviasBadBunny>noviasTiti)
            System.out.println("BadBunny tiene mas novias que Titi");
       
        else{
            
            if (noviasBadBunny == noviasTiti);
        System.out.println("BadBunny tiene la misma cantidad de novias que Titi");
            
        }
        
        
        System.out.println("\ngracias por su tiempo");
        
    }
}
