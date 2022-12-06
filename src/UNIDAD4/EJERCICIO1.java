/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD4;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author perte
 */
public class EJERCICIO1 {
    public static void main(String[] args) {
        int[] num=new int[5];
        
        
        num[0]=120;
        num[1]=37;
        num[2]=15;
        num[3]=28;
        num[4]=11;
        //otra forma de declarar el arreglo
        int[] num2={100,70,65,208,23,11};
        //siguiente forma de declarar el vector
        int[] num3;
        Scanner lector=new Scanner (System.in);
        int tamanio;
        String nombre;
        System.out.println("ingrese nombre");
        nombre=lector.next();
        System.out.println("ingrese el tamanio del arreglo");
        tamanio=lector.nextInt();
        num3= new int[tamanio];
        
        //imprimir el contenido
        
        System.out.println("el contenido de "+nombre+Arrays.toString(num));
        System.out.println("el contenido de "+nombre+Arrays.toString(num2));
        System.out.println("el contenido de "+nombre+Arrays.toString(num3));
        
        System.out.println("el contenido buscado por "+nombre+" es ");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]+"|");
        }
        System.out.println("el contenido buscado por "+nombre+" es ");   
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]+".");
        
        }   
        System.out.println("el contenido buscado por "+nombre+" es ");
        for (int i = 0; i < num3.length; i++) {
             System.out.println(num3[i]+"~");
        }
         
    }
}
