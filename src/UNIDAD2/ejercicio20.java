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
public class ejercicio20{
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        double califExamen, califEjercicios, califInvestigacion,calFinal;
        
        System.out.println("ingrese la calificacion del examen: ");
        califExamen=leer.nextInt();
        
        System.out.println("ingrese la calificacion de los ejercicios: ");
        califEjercicios=leer.nextInt();
        
        System.out.println("ingrese la calificaion de investigacion");
        califInvestigacion=leer.nextInt();
        
        calFinal=califExamen*0.4+califEjercicios*0.35+califInvestigacion*0.25;
        
        
        System.out.println("la calificacion final de la unidad 2 es: "+calFinal);
        
        
    }
}
