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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        int figura;

        System.out.println("Escriba:\n1 para obtener el área de un cuadrado"
                + "\n2 para obtener el área de un triángulo\n"
                + "3 para obtener el área de un rectángulo");
        figura = entrada.nextInt();

        if (figura == 1) {
            obtenerAreaCuadrado();
        } else {
            if (figura == 2) {
                obtenerAreaTriangulo();
            } else {
                if (figura == 3) {
                    obtenerAreaRectangulo();
                } else {
                    System.out.println("valor erroneo");
                }
            }
        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double lado;
        double resultado;
        System.out.println("Ingrese la longitud de un lado del "
                + "cuadrado en cm²");
        lado = entrada.nextDouble();
        resultado = lado * lado;
        System.out.printf("El area del cuadrado es:%.2f cm²\n", resultado);

    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double resultado;

        System.out.println("Ingrese la longitud de la base del "
                + "triangulo en cm²");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura del triangulo en cm²");
        altura = entrada.nextDouble();

        resultado = (base * altura) / 2;
        System.out.printf("El area del triángulo es:%.2f cm²\n", resultado);

    }

    public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double base;
        double altura;
        double resultado;

        System.out.println("Ingrese la longitud de la base del "
                + "rectángulo en cm²");
        base = entrada.nextDouble();

        System.out.println("Ingrese la altura del rectángulo en cm²");
        altura = entrada.nextDouble();

        resultado = (base * altura);
        System.out.printf("El area del triángulo es:%.2f cm²\n", resultado);

    }

}
