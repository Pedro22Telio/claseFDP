/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PROYECTO;


import java.util.Scanner;

/**
 *
 * @author perte
 */
public class BOLETA {

    public static void main(String[] args) {
        int filas = 3;
        int columnas = 3;
        double suma = 0;
        double promedio = 0;
        
        Scanner sc =new Scanner(System.in);
        
        double[][] materias = new double[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingresa la calificacion numero "+j+" del alumno "+i);
                materias[i][j] = sc.nextDouble();
            }   
        }
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                suma = suma + materias[i][j];   
            }
            promedio = suma / materias[0].length;
            System.out.println("| El promedio es: | "+promedio+" | ");
            suma = 0;
            
        }
    }
  
    }
           
            
        
    
  
