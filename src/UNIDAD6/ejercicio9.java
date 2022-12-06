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
public class ejercicio9 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int edadEl,edadElla,estatura;
        String artistaFavorito;
        System.out.println("programa para buscarle novio a una chica toxica");
        System.out.println("ingrese la edad de la chica");
        edadElla=entrada.nextInt();
        System.out.println("ingrese la edad del candidato");
        edadEl=entrada.nextInt();
        System.out.println("ingrese la estatura( en centimetros ) del candidato");
        estatura=entrada.nextInt();
        System.out.println("ingrese el grupo favorito del candidato");
        artistaFavorito=entrada.next();
        
        if(edadEl>edadElla&&estatura>=180&&artistaFavorito.equals("timbiriche")){
        
            System.out.println("el chico es tu candidato ideal");
            System.out.println("el chico es mayor que tu por: "+(edadEl-edadElla)+" anios");
            
        
        }
        else
            System.out.println("sigue buscando candidatos en tinder");
        }
    }

