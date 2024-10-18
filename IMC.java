/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   IMC.java                                           :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: iguillen <iguillen@42student.42madrid.c    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/10/10 15:06:10 by iguillen          #+#    #+#             */
/*   Updated: 2024/10/10 15:06:10 by iguillen         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String nombre;
        float estatura;
        float peso;
        float imc;
        
        System.out.print("Dime tu nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Dime tu estatura: ");
        estatura = sc.nextFloat();
        
        sc.nextLine();
        
        System.out.print("Dime tu peso: ");
        peso = sc.nextFloat();
        
        sc.nextLine();
        
        imc = peso / (estatura * estatura);
        
        System.out.println("tu IMC es de " + (100 * imc / 100));
        
        if (imc < 18.5) {
            System.out.println("infrapeso.");
        } else {
            if (imc < 25) {
                System.out.println("normal");
            } else {
                if (imc < 30) {
                    System.out.println("sobrepeso");
                } else {
                    System.out.println("obesidad");
                }
            }
        }
    }
}