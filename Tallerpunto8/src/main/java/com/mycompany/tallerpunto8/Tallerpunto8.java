package com.mycompany.tallerpunto8;

import java.util.Scanner;

/**
 *
 * @author Daniel Cogollo
 *  Implementar el algoritmo de Euclides que encuentre el máximo común divisor de dos números enteros y positivos.
    Algoritmo de Euclides de m y n:
    Éste transforma un par de enteros positivos (m, n) en una par (d, o), dividiendo repetidamente el entero mayor entre el 
    menor y reemplazando con el resto; cuando el resto es 0, el otro entero de la pareja será el máximo común divisor de 
    la pareja original.
    Ejemplo mcd (532 112)
 */

public class Tallerpunto8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int m = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n = scanner.nextInt();

        scanner.close();

        int mcd = encontrarMCD(m, n);

        System.out.println("El MCD de " + m + " y " + n + " es: " + mcd);
    }

    public static int encontrarMCD(int m, int n) {
        while (n != 0) {
            int temp = n;
            n = m % n;
            m = temp;
        }
        return m;
    }
}
