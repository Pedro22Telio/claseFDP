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
public class ejercicio3 {
    public static void main(String[] args) {
        int[] temperaturas={35,28,32,27,30};
        Scanner lector=new Scanner(System.in);
        int dato,vecesEncont=0;
        boolean encontrado=false;
        
        System.out.println("ingresa valor a buscar");
        dato=lector.nextInt();
        
        for (int i = 0; i < temperaturas.length; i++) {
            if(temperaturas[i]==dato){
                //opcion1:marcar con la variable boobleana
                // que se ha encontrado el dato
                encontrado=true;
                //opcion2 mostrarla posicionen que se encuentra
                //el dato que se esta buscando
                System.out.println("el dato "+dato+"  se encuentra en la posicion "+i+" del arreglo");
                break;
            
            }
        
         
        }
        //si el programa tiene varios valores que coinciden con el valor de buscar entonces
        if (encontrado==true) 
            System.out.println("el dato fue encontrado ");
            
        else 
            System.out.println("no se encontro el dato");
    //+==============================================================+//
    double[] calificaciones={100,70,85.5,70,100,100};
    String posiciones="";
    System.out.println("ingresa valor a buscar");
    dato=lector.nextInt();
    for(int i=0;i<calificaciones.length;i++){
        if (calificaciones[i]==dato) {
            //se incrementa la variable vecesEncontcada vez que se encuentra el dato
            vecesEncont++;
            //se registran las posicionesdonde se encuentran el dato
            posiciones+=i+",";
           
        }
    }
        System.out.println("el dato "+dato+" se encontro "+vecesEncont+" veces en las posiciones "+posiciones+" del arreglo");
    
    
    }
    
}
