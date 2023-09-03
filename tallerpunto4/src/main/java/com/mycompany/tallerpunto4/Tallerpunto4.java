package com.mycompany.tallerpunto4;

import java.util.Scanner;

/*REALIZADO POR DANIEL COGOLLO 
Encontrar un número natural N más pequeño de forma que la suma de los N primeros números exceda una cantidad 
introducida por el teclado*/
public class Tallerpunto4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numero = 1;
        int sumaNumeros = 0;
        System.out.println("DIGITE EL NUMERO A CALCULAR :");
        int NumeroPrincipal = scanner.nextInt();
        while (sumaNumeros <= NumeroPrincipal){
            sumaNumeros += numero;
            numero++;
        }
        System.out.println("EL NUMERO NATURAL MAS PEQUEÑO DE LOS n PRIMEROS NUMEROS EXCEDE LA CANTIDAD ES :" + (numero -1));
    }
}
