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
public class Problema7 {

    public static void main(String[] args) {

        String arreglo[] = valoresArreglo();
        imprimirArreglo(arreglo);
    }

    public static String[] valoresArreglo() {
        Scanner entrada = new Scanner(System.in);
        int elementos;
        String ciudades;
        System.out.println("Ingrese los elementos del arreglo");
        elementos = entrada.nextInt();

        String[] arreglo = new String[elementos];
        ciudades = entrada.nextLine();

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese una ciudad del Ecuador");
            ciudades = entrada.nextLine();
            arreglo[i] = ciudades;
        }

        return arreglo;
    }

    public static void imprimirArreglo(String[] arreglo) {
        String mensaje = "";

        for (int i = 0; i < arreglo.length; i++) {

            String valor = arreglo[i];
            int longitud = valor.length();

            if (longitud == 4 || longitud == 5) {
                mensaje = String.format("%s%s\n",
                        mensaje, arreglo[i]);
            }
        }
        System.out.printf("La impreción del arreglo con cadenas de "
                + "4 o 5 caracteres es:%s\n", mensaje);
    }
}
