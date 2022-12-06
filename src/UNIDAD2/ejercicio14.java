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
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        double subtotal,total;
        final double DESCUENTO=0.40;
        System.out.println("ingrese el total de la compra: ");
        subtotal=lector.nextDouble();
        total=subtotal-(subtotal*DESCUENTO);
        
        System.out.println("el total de la compra con descuento es: "+ total);
    }
}
