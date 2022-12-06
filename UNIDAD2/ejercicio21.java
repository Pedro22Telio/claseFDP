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
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double saldoFinal, saldoInicial, puntos, equivPuntos;
        final double VALOR_PUNTOS=0.12;
        
        System.out.println("ingrese el saldo inicial: ");
        saldoInicial=sc.nextDouble();
        
        System.out.println("ingrese los puntos acumulados: ");
        puntos=sc.nextDouble();
        equivPuntos=puntos*VALOR_PUNTOS;
        System.out.println("sus puntos acumulados equivalen a: $"+ equivPuntos+" pesos");
        saldoFinal=saldoInicial-equivPuntos;
    
        System.out.println("despues de aplicar los puntos acumulados, su saldo final es: "+saldoFinal);
        
        
    }
}
