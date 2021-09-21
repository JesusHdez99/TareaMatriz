
/**1.Elaborar un algoritmo y programa en Java
que lea números de tipo entero para una matriz de 4 renglones por 5 columnas y
además que los imprima.
 *
 * @author yisus
 */

import java.util.Scanner;
public class Algoritmo1 {
public static void main(String args[]){
        int M[][] = new int[4][5];
        for (int i=0;i<4;i++){
            for(int j=0;j<5;j++){
      Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero de la fila "+(i+1)+" de la posicion "+(j+1)+": ");
M[i][j]= sc.nextInt();
            }
       }
     for (int i=0;i<4;i++){
       for (int j=0;j<5;j++){
           System.out.println("vector["+i+"]["+j+"]  = "+M[i][j]);
       }
      }
    }
  }