/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerpunto6;

import static com.mycompany.tallerpunto6.Tallerpunto6.hipotenusa;
import java.util.Scanner;

/**
 *
 * @author Daniel Cogollo
 *  Escribir un programa para obtener la hipotenusa y los ángulos agudos de un triángulo rectángulo a partir de las 
    longitudes de los catetos.
 */
public class Tallerpunto6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double cateto1;
        double cateto2;
        double hipotenusa;
        
        
        System.out.println("DIGITE EL PRIMER CATETO : ");
        cateto1 = scanner.nextDouble();
        System.out.println("DIGITE EL SEGUNDO CATETO :");
        cateto2 = scanner.nextDouble();    
        
        hipotenusa = hipotenusa(cateto1, cateto2);
        cateto1 = Math.toDegrees(Math.atan(cateto1 / cateto2));
        cateto2 = 90 - cateto1;
        
        System.out.println("HIPOTENUSA : " + hipotenusa);
        System.out.println("CATETO1  : " + cateto1 + "GRADOS");
        System.out.println("CATETO2  : " + cateto2 + "GRADOS");
        
        
    }
     public static double hipotenusa(double cateto1, double cateto2){
        return Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
    }
}
