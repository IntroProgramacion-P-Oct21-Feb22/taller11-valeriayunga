/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int[]datos=new int [2+2];
    for (int i= 0; i<4;i++){
        datos[i]=2+2;
    }
        for (int i = 0; i<4;i++){
            datos[i]=datos[i]-1;
        
    }
          for (int i = 0; i<4;i++){
              System.out.printf("%s\n",datos[i]);
          }
    }
    
    
}
