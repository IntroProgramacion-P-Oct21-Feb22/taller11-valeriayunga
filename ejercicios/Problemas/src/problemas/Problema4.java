/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        int cedula;
        String cedulaC;
        int eleccion;

        System.out.println("Ingrese el nombre del cliente");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la cédula del cliente");
        cedula = entrada.nextInt();

        cedulaC = String.valueOf(cedula);

        System.out.println("Ingrese:\n1 para calcular el valor de la "
                + "planilla de luz.\n2 para calcular el valor del predio "
                + "de un bien inmueble.\n");
        eleccion = entrada.nextInt();

        if (eleccion == 1) {
            calcularValorLuz(nombre, cedulaC);
        } else {
            if (eleccion == 2) {
                calcularPredio(nombre, cedulaC);
            } else {
                System.out.println("Opción incorrecta");
            }
        }
    }

    public static void calcularValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valorK;
        double numeroK;
        double valorTotal;
        String cadena = "";

        System.out.println("Ingrese el valor del kilowatio");
        valorK = entrada.nextDouble();

        System.out.println("Ingrese el número de kilowatios del mes");
        numeroK = entrada.nextDouble();

        valorTotal = valorK * numeroK;

        cadena = String.format("%sCliente %s con cédula %s debe cancelar "
                + "el valor de $%.2f\n",
                 cadena,a, b, valorTotal );
        
        System.out.printf("%s",cadena);

    }

    public static void calcularPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double inmueble;
        double descuento=2;
        double valorTotal;
        String cadena="";
        
        System.out.println("Ingrese el valor de inmueble");
        inmueble = entrada.nextDouble();
        
        valorTotal=(inmueble*descuento)/100;
        
         cadena = String.format("%sCliente %s con cédula %s "
                 + "tiene un bien inmueble valorado en $%.2f"
                 + " y tiene que pagar de predio $%.2f\n"
                 ,cadena, a, b,inmueble, valorTotal);
         
         System.out.printf("%s",cadena);
    }
}
