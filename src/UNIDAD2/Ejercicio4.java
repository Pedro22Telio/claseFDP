/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UNIDAD2;

/**
 *
 * @author Petergod
 */
import java.util.Scanner;
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc;
        sc = new Scanner (System.in);
        int nacimiento, edad ,actual;
        System.out.println("ingrese anio de nacimiento");
        nacimiento=sc.nextInt();
        System.out.println("ingrese anio actual");
        actual=sc.nextInt();
        edad=actual-nacimiento;
        System.out.println("El resultado es :"+edad);
        
        // TODO code application logic here
    }
    
}
