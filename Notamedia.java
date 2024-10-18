/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   Notamedia.java                                     :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: iguillen <iguillen@42student.42madrid.c    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2024/10/10 15:07:27 by iguillen          #+#    #+#             */
/*   Updated: 2024/10/10 15:07:27 by iguillen         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int nalumnos;
        String nombre;
        float nota1;
        float nota2;
        float nota3;
        
        System.out.print("Dime tu nombre: ");
        nombre = sc.nextLine();
        
        System.out.print("Dime el numero de alumnos: ");
        nalumnos = sc.nextInt();
        
        System.out.print("Dime tu nota en materia 1: ");
        nota1 = sc.nextFloat();
        
        sc.nextLine();
        
        System.out.print("Dime tu nota en materia 2: ");
        nota2 = sc.nextFloat();
        
        sc.nextLine();
        
        System.out.print("Dime tu nota en materia 3: ");
        nota3 = sc.nextFloat();
        
        sc.nextLine();
        
        float notamedia = (nota1 + nota2 + nota3)/3;
        
        System.out.println("Nota media: " + notamedia);
        System.out.println("Nombre: " + nombre);
        System.out.println("Nº de alumnos: " + nalumnos);
    }
}