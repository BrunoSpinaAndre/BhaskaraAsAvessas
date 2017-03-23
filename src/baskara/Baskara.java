/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baskara;

import java.util.Scanner;

/**
 *
 * @author bruno.sandre
 */
public class Baskara {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
      
        //ENTRADA
        System.out.print("x1: ");
        double x1 = Double.parseDouble(console.nextLine());
        
        System.out.print("x2: ");
        double x2 =  Double.parseDouble(console.nextLine());
        
        System.out.print("C: ");
        double C =  Double.parseDouble(console.nextLine());
        
        //Processamento
        double s  = x1 + x2;
        double p = x1 * x2;
        double a = C / p;
        double b = -(s * a);
        
        // Saida
         System.out.println(" A equação que tem raizes "
                  + x1 
                  + "e "
                  + x2 
                  + " é "
                  + a + "x² + "
                         
                  + b+ "x "
                       + C);
             
        
    }

}
