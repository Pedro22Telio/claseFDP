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
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        double area,radio;
        System.out.println("ingrese el radio del circulo");
        radio=leer.nextDouble();
        
        area=Math.PI*Math.pow(radio,2);
        
        System.out.println("el area del circulo es: "+area);
       
        
        
        
    }
    
}
