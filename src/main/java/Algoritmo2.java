
/**2.Elaborar un algoritmo y programa en Java
que lea números enteros para una matriz de 5 x 7, que imprima los elementos de
la matriz y que al final de cada renglón imprima la suma de todos sus
elementos.
 *
 * @author yisus
 */
import java.util.Scanner;
public class Algoritmo2 {
public static void main(String args[]){
        int M[][] = new int[5][7];
        int s[]= new int[5];
        for (int i=0;i<5;i++){
            for(int j=0;j<7;j++){
      Scanner sc = new Scanner(System.in); 
System.out.println(" ingrese un numero de la matriz "+(i+1)+" de la posicion "+(j+1)+": ");
M[i][j]= sc.nextInt();
            }
       }
       
System.out.println(" La Matriz ingresada es la siguiente: ");
System.out.println("["+M[0][0]+"]"+"["+M[0][1]+"]"+"["+M[0][2]+"]"+"["+M[0][3]+"]"+"["+M[0][4]+"]"+"["+M[0][5]+"]"+"["+M[0][6]+"]");
System.out.println("["+M[1][0]+"]"+"["+M[1][1]+"]"+"["+M[1][2]+"]"+"["+M[1][3]+"]"+"["+M[1][4]+"]"+"["+M[1][5]+"]"+"["+M[1][6]+"]");
System.out.println("["+M[2][0]+"]"+"["+M[2][1]+"]"+"["+M[2][2]+"]"+"["+M[2][3]+"]"+"["+M[2][4]+"]"+"["+M[2][5]+"]"+"["+M[2][6]+"]");
System.out.println("["+M[3][0]+"]"+"["+M[3][1]+"]"+"["+M[3][2]+"]"+"["+M[3][3]+"]"+"["+M[3][4]+"]"+"["+M[3][5]+"]"+"["+M[3][6]+"]");
System.out.println("["+M[4][0]+"]"+"["+M[4][1]+"]"+"["+M[4][2]+"]"+"["+M[4][3]+"]"+"["+M[4][4]+"]"+"["+M[4][5]+"]"+"["+M[4][6]+"]");

     
    for(int a=0;a<5;a++){
     s[a]=M[a][0]+M[a][1]+M[a][2]+M[a][3]+M[a][4]+M[a][5]+M[a][6];
    } 
    
    for(int a=0;a<5;a++){
     System.out.println("La suma del Renglon "+a+" es igual a: "+s[a]);
    }
}
        }


