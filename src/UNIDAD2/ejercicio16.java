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
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double dias,horas,minutos,total_de_segundos;
        System.out.println("ingrese los dias");
        dias=leer.nextDouble();
        System.out.println("ingrese las horas");
        horas=leer.nextDouble();
        System.out.println("ingrese los minutos");
        minutos=leer.nextDouble();
        
        dias=dias*24*60*60;
        horas=horas*60*60;
        minutos=minutos*60;
        
        total_de_segundos=dias+horas+minutos;
        
        System.out.println("el total de segundos es: "+total_de_segundos);
        
        
    }
}
