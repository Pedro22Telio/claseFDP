/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;

import java.util.Scanner;

/**
 *
 * @author perte
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner lector =new Scanner (System.in);
         int dato,vecesEncont=0;
        
         double[] calificaciones={100,70,85.5,70,100,100};
    String posiciones="";
    System.out.println("ingresa valor a buscar");
    dato=lector.nextInt();
    for(int i=(calificaciones.length-1);1>=0;i--){
        if (calificaciones[i]==dato) {
            //se incrementa la variable vecesEncontcada vez que se encuentra el dato
            vecesEncont++;
            //se registran las posicionesdonde se encuentran el dato
            posiciones+=i+",";
    
            System.out.println("el dato "+dato+" se encontro "+vecesEncont+" veces en las posiciones "+posiciones+" del arreglo");      
        }
    }
    }
}

