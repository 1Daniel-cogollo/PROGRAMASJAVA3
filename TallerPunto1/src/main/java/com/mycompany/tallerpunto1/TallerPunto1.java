package com.mycompany.tallerpunto1;

import java.util.Scanner;

/**
 *
 * @author DANIEL ANDRES COGOLLO GRUPO 01
 */

public class TallerPunto1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("DIGITE LA LONGITUD :");
        double longitud = scanner.nextDouble();
        
        System.out.println("DIGITE LA ANCHURA  :");
        double anchura = scanner.nextDouble();
        
        double superficie = calcular_superficie(longitud, anchura);
        
        System.out.println("LA SUPERFICIE ES :"+superficie);
    }
    public static double calcular_superficie (double longitud, double anchura){
    return longitud * anchura;
    }
}
