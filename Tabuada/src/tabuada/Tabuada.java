/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author HNROr
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tabuada = new Scanner (System.in);
        
        int contador, limite, tab, resultado;
 
        contador = 0;
        
        System.out.println("Qual tabuada você quer que eu resolva? ");
        tab = tabuada.nextInt();
        System.out.println("Até quantas vezes? ");
        limite = tabuada.nextInt();
       
        
        while(contador <= limite){
            resultado = tab * contador;
            System.out.println(tab + " x " + contador + " = " + resultado);
            contador = contador + 1;
        }
        
    }
    
}
