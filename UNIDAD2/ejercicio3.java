/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD2;

import java.util.Scanner;

/**
 *
 * @author perte
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner lec=new Scanner (System.in);
        int valor1, valor2, valor3;
        
        System.out.println("ingrese el valor 1");
        valor1=lec.nextInt();
        System.out.println("ingrese el valor 2");
        valor2=lec.nextInt();
        valor3= valor1-valor2;
        
        System.out.println("el total de la resta es: "+valor3);

        
    }
}
