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
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int suma = optenerSumaArreglo(informacion);

        System.out.println(suma);
    }

    public static int optenerSumaArreglo(int[][] arreglo) {
        int suma=0;
        for (int fila = 0; fila < arreglo.length; fila++) {
            for (int col = 0; col < arreglo[fila].length; col++) {
                suma = suma + arreglo[fila][col];
               
            }
        }
         return suma;
    }
}
