package com.mycompany.punto2taller;

/**
 *
 * @author DANIEL ANDRES COGOLLO 
 */
public class Punto2Taller {

    public static void main(String[] args) {
        int hora_militar = 00;
        int hora_normal;
        int minutos = 59;
        String ampm;
        if (hora_militar > 12)
        {
            hora_normal = hora_militar - 12;
            ampm = "PM";
        }
        else 
        {
            hora_normal = hora_militar;
            ampm = "AM";
        }
        System.out.printf("HORA MILITAR %d:%d %n", hora_militar ,minutos);
        System.out.printf("HORA AM/PM %d:%d %s%n ", hora_normal, minutos, ampm);
    }
}
