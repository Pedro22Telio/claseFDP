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
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        double base,altura,area;
        System.out.println("ingrese la base del triangulo: ");
        base=lector.nextDouble();
        System.out.println("ingrese la altura del triangulo: ");
        altura=lector.nextDouble();
        area=(base*altura)/2;
        
        System.out.println("el area del triangulo es: "+ area);
       
                
    }
    
}
