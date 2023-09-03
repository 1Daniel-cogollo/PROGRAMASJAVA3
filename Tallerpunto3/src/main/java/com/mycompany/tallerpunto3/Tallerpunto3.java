/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerpunto3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Tallerpunto3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("DIGITE EL NUMERO QUE SEA CALCULAR :");
        int n = scanner.nextInt();
        double suma = suma_terminos(n);
            System.out.println("suma ("+n+") :" + suma);   
    }
    public static double suma_terminos (int n)
    {
        double suma = 0;
        for (int i =1; i<=n; i++)
        {
            double termino = 1/Math.pow(2, i);
            suma+=termino;
        }
        return suma;
    }
}
