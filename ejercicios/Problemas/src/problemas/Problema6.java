/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema6 {

    public static void main(String[] args) {
        int[] informacion = {1, 2, 3, 10, 20, 30, 100, 200, 300};
        double mediaAritmetica = obtenerMediaAritmetica(informacion);
        double desviacionEstandar = obtenerDesviacionEstandar(informacion,
                mediaAritmetica);

        System.out.printf("La media aritmética es:%.2f\n", mediaAritmetica);

        System.out.printf("La media desviación estandar es:%.2f\n",
                desviacionEstandar);

    }

    public static double obtenerMediaAritmetica(int[] arreglo) {
        int suma = 0;
        double media;
        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];

        }
        media = suma / arreglo.length;
        return media;
    }

    public static double obtenerDesviacionEstandar(int[] arreglo,
            double mediaAritmetica) {
        double rango;
        double varianza = 0.0;
        double desviacion;

        for (int i = 0; i < arreglo.length; i++) {
            rango = Math.pow(arreglo[i] - mediaAritmetica, 2f);
            varianza = varianza + rango;
        }
        varianza = varianza / 9f;
        desviacion = Math.sqrt(varianza);
        return desviacion;

    }
}
