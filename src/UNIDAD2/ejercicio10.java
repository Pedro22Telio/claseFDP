/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UNIDAD2;

import java.util.Scanner;

/**
 *
 * @author pertegod
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int numero;
        System.out.println("\n\ningrese un numero binario");
        numero = leer.nextInt(2);
        System.out.println("Su equivalente en sistema decimal es: "+numero);
      
         System.out.println("\n\ningrese un numero octal");
        numero = leer.nextInt(8);
        System.out.println("Su equivalente en sistema decimal es: "+numero);
        
         System.out.println("\n\ningrese un numero hexadecimal");
        numero = leer.nextInt(16);
        System.out.println("Su equivalente en sistema decimal es: "+numero);
          //SOLICITAR TOTAL APAGAR(SOLICITAR EL NOMBRE, EL PRECIO, Y CANTIDAD A COMPRAR)
          //MOSTRAR NOMBRE Y TOTAL A PAGAR
          //SOLICITAR DINERO RECIBIDO RESTAR EL TOTAL A PAGAR Y OBTENER EL CAMBIO
          
    }
}
