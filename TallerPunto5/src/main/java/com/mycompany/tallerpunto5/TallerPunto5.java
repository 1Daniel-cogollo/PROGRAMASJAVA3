package com.mycompany.tallerpunto5;

import java.util.Scanner;

/**
 *
 * @author Daniel Cogollo
 *  Un vendedor minorista en línea requiere un informe de las ventas del día. Para ello cuenta con tres arreglos de n 
    elementos cada uno: A, B y C. El primero almacena el código de los productos vendidos en el día, El segundo almacena 
    el valor de venta de cada producto, y el tercero la cantidad de unidades vendidas de cada producto.
    Requiere un aplicativo que le calcule rápidamente los siguientes datos: 
    • Total productos vendidos en el día.
    • Total ingresos por ventas del día.
    • El producto más vendido.
    • El producto más costoso vendido.
 */
public class TallerPunto5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("INGRESE LA CANTIDAD DE PRODUCTOS DE COMPRA : ");
        int productos = scanner.nextInt();
        int i;
        int totalProductosVendidos = 0;
        double totalIngresos = 0;
        int CantidadMaximaVendida = 0;
        double maxValorVenta = 0;
        //int maxValorVentaIndex = 0;
        int codigoProducto = 0;
        double valor_venta = 0;
        int Cantidad_venta = 0;
        
        for (i = 0; i < productos; i++)
        {
            System.out.println("INGRESE LA CANTIDAD DEL PRODUCTO" + (i+1) + " :");
            codigoProducto = scanner.nextInt();
            
            System.out.println("INGRESE EL VALOR DEL PRODUCTO " + (i+1) + " :");
            valor_venta = scanner.nextInt();
            
            System.out.println("INGRESE LA CANTIDAD DE VENTAS " + (i+1) + " :");
            Cantidad_venta = scanner.nextInt();
        }
        for (i = 0; i < productos; i++)
        {
            totalProductosVendidos += Cantidad_venta;
            totalIngresos += valor_venta * Cantidad_venta;
            
            if (Cantidad_venta > CantidadMaximaVendida)
            {
                CantidadMaximaVendida = i;
            }
            if (valor_venta > maxValorVenta )
            {
                maxValorVenta = valor_venta;
            }
        }
        System.out.println("TOTAL PRODUCTOS VENDIDOS EN EL DIA : " + totalProductosVendidos);
        System.out.println("TOTAL INGRESOS POR VENTAS DEL DIA : " + totalIngresos);
        System.out.println("EL PRODUCTO MAS VENDIDO (POR CODIGO) ES :" + codigoProducto + " con " + CantidadMaximaVendida);
        System.out.println("EL PRODUCTO MAS VENDIDO (POR CODIGO) ES :" + codigoProducto + " con " + maxValorVenta);
    }
}
