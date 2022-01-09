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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double nota;
        double[] notas = new double[4];
        String cadena = "El promedio de las notas:";
        String pCualitativo = "";
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese su nota");
            nota = entrada.nextDouble();

            cadena = String.format("%s;%.2f", cadena, nota);

            notas[i] = nota;

        }
        pCualitativo = obtenerPromedioCualitativo(notas[0], notas[1],
                notas[2], notas[3]);

        System.out.printf("%s es: %s ", cadena, pCualitativo);
    }

    public static String obtenerPromedioCualitativo(double n1, double n2,
            double n3, double n4) {

        double promedio;
        String cualitativo = "";

        promedio = (n1 + n2 + n3 + n4) / 4;

        if (promedio >= 0 && promedio <= 5) {
            cualitativo = "Regular";
        } else {
            if (promedio >= 5.1 && promedio <= 8) {
                cualitativo = "Bueno";

            } else {
                if (promedio >= 8.1 && promedio <= 9) {
                    cualitativo = "Muy Bueno";
                } else {
                    if (promedio >= 9.1 && promedio <= 10) {
                        cualitativo = "Sobresaliente";
                    }
                }
            }
        }
        return cualitativo;
    }

}
