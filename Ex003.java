/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercícios;

/**
 *
 * @author Matheus
 */
import java.util.Scanner;
public class Ex003 {
    public static void main (String args[])
    {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um número:");
        double a = entrada.nextDouble();
        System.out.print("Digite outro número:");
        double b = entrada.nextDouble();
        System.out.print("Digite outro número:");
        double c = entrada.nextDouble();
        if ((a + b > c) && (a+ c > b) && (b + c > a))
        {
            System.out.print("Trinângulo ");
        }
        if ((a == b) && (a == c) && (b == c))
        {
            System.out.print("Equilátero");
        }
        else
        {
           if ((a != b) && (a != c) && (b != c))
           {
                System.out.print("Escaleno");
           }
           else
           {
               if((a == b) && (a != c) || ((a == c) && (a != b) || ((b == c) && (b != a))))
               {
                   System.out.println("Iscóceles");
               }
           }
        }
    }
    
}
