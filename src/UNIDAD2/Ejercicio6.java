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
public class Ejercicio6 {
        public static void main(String[] args) {
        Scanner lector=new Scanner(System.in);
        //conversor de libras a kilos
        double kilos,libras;
        System.out.println("Ingrese el valor en kilos");
        kilos=lector.nextDouble();
        libras=kilos/0.454;
        System.out.println("El resultado es: "+ libras);
    }
    
}

    

