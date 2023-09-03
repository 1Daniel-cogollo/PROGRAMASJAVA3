package com.mycompany.tallerpunto7;

import java.util.Scanner;

/**
 *
 * @author DANIEL COGOLLO 
 *  Crear un programa que valore el salario neto semanal de los trabajadores de una empresa de acuerdo a las siguientes 
    normas:
    • Horas semanales trabajadas <38 a una tasa.
    • Horas extras (38 o más) a una tasa 50% superior a la ordinaria.
    • Impuestos de 0%, si el salario bruto es menor o igual a 750 euros; 10%, si el salario bruto es mayor que 750 euros.
    Lea los datos necesarios para calcular el salario de un trabajador
 */
public class Tallerpunto7 {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese la tasa por hora: ");
        double tasa = scanner.nextDouble();
        
        double Salario_Bruto;
        if (horasTrabajadas < 38) {
            Salario_Bruto = horasTrabajadas * tasa;
        } else {
            double horasOrdinarias = 38 * tasa;
            double horasExtras = (horasTrabajadas - 38) * (tasa * 1.5);
            Salario_Bruto = horasOrdinarias + horasExtras;
        }

        double impuesto;
        if (Salario_Bruto <= 750) {
            impuesto = Salario_Bruto * 0;
        } else {
            impuesto = Salario_Bruto * 0.1;
        }

        double salario_Neto = Salario_Bruto - impuesto;

        System.out.println("Salario bruto: " + Salario_Bruto + " euros");
        System.out.println("Impuestos: " + impuesto + " euros");
        System.out.println("Salario neto: " + salario_Neto + " euros");
    }
}
