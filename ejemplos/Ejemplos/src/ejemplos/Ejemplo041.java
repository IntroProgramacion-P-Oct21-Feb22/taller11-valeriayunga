/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // 
        Scanner entrada = new Scanner(System.in);
        // 

        System.out.printf("Ingrese el primer valor\n");
        int primerValor = entrada.nextInt();

        System.out.printf("Ingrese el segundo valor\n");
        int segundoValor = entrada.nextInt();
        obtenerMultiplicacion(primerValor, segundoValor); // se invoca al método (procedimiento) obtenerSuma

    }

    public static void obtenerMultiplicacion(int a, int b) {
        int m = a * b;
        System.out.printf("El valor de la multiplicación es: %d\n", m);
    }
    
    
}
