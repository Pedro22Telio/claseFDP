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
public class ejercicio6 {
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
        
        
        String[] pokemones={"treecko","totodile","torchic","torkoal","psyduck","wobbfet","cyndaquil"};
        for (int i = 0; i < pokemones.length; i++) {
            System.out.println((i+1)+"."+pokemones[i]+"\n");
            
            
                
            }
        int i=1;
            for (String pokemon : pokemones) {
                System.out.println("numero de pokemon");
                System.out.println(i+"."+pokemon+"\n");
                i++;
        }
        
    }
}
