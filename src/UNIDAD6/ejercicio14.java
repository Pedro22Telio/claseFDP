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
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner lector= new Scanner (System.in);
        
        int numMaterias,i=1;
        double calificacion,suma=0,promedio;
        
        System.out.println("programa que calcula las materias");
        System.out.println("ingresa el numero de materias que lleva");
        numMaterias=lector.nextInt();//6
        
        while(i<numMaterias){
            System.out.println("ingrese la calificacion de la materia"+i+":");
            calificacion=lector.nextDouble();
            suma=suma+calificacion;
            i++;
        
        }
        System.out.println("suma de las calificaciones"+suma);
        promedio=suma/numMaterias;
        System.out.println("el promedio de la calificacion es"+promedio);
    }
}
