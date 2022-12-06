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
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        double x,y,aux;
        
        System.out.println("ingrese valor de x");
        x=lector.nextDouble();
        System.out.println("ingrese el valor de y");
        y=lector.nextDouble();
        
        aux=x;
        x=y;
        y=aux;
        
        System.out.println("el valor de x es: "+x);
        System.out.println("el valor de y es: "+y);

    }
}
