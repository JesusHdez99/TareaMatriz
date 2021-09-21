
/**3.Elaborar un algoritmo y programa en Java
que lea números enteros para los elementos de dos matrices de 5x5, que calcule
cada elemento de una tercera matriz sumando los elementos correspondientes de
las dos anteriores. Al final imprimir la tercera matriz.
 * 
 * @author yisus
 */
import java.util.Scanner;
public class Algoritmo3 {
public static void main(String args[]){
        int M[][] = new int[5][5];
        int M2[][] = new int [5][5];
        int s[][]= new int [5][5];
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
      Scanner sc = new Scanner(System.in); 
System.out.println("Para la Matriz 1, ingrese un numero de la fila"+(i+1)+" de la posicion "+(j+1)+": ");
M[i][j]= sc.nextInt();
            }
       }
        for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
      Scanner sc = new Scanner(System.in); 
System.out.println("Para La matriz 2, ingrese un numero de la fila"+(i+1)+" de la posicion "+(j+1)+": ");
M2[i][j]= sc.nextInt();
            }
       }
   //suma de matrices  
   for (int i=0;i<5;i++){
            for(int j=0;j<5;j++){
      s[i][j]=M[i][j]+M2[i][j];
            }
       }
   System.out.println(" La Matriz 1 ingresada es la siguiente: ");
System.out.println("["+M[0][0]+"]"+"["+M[0][1]+"]"+"["+M[0][2]+"]"+"["+M[0][3]+"]"+"["+M[0][4]+"]");
System.out.println("["+M[1][0]+"]"+"["+M[1][1]+"]"+"["+M[1][2]+"]"+"["+M[1][3]+"]"+"["+M[1][4]+"]");
System.out.println("["+M[2][0]+"]"+"["+M[2][1]+"]"+"["+M[2][2]+"]"+"["+M[2][3]+"]"+"["+M[2][4]+"]");
System.out.println("["+M[3][0]+"]"+"["+M[3][1]+"]"+"["+M[3][2]+"]"+"["+M[3][3]+"]"+"["+M[3][4]+"]");
System.out.println("["+M[4][0]+"]"+"["+M[4][1]+"]"+"["+M[4][2]+"]"+"["+M[4][3]+"]"+"["+M[4][4]+"]");
        
 System.out.println(" La Matriz 2 ingresada es la siguiente: ");
System.out.println("["+M2[0][0]+"]"+"["+M2[0][1]+"]"+"["+M2[0][2]+"]"+"["+M2[0][3]+"]"+"["+M2[0][4]+"]");
System.out.println("["+M2[1][0]+"]"+"["+M2[1][1]+"]"+"["+M2[1][2]+"]"+"["+M2[1][3]+"]"+"["+M2[1][4]+"]");
System.out.println("["+M2[2][0]+"]"+"["+M2[2][1]+"]"+"["+M2[2][2]+"]"+"["+M2[2][3]+"]"+"["+M2[2][4]+"]");
System.out.println("["+M2[3][0]+"]"+"["+M2[3][1]+"]"+"["+M2[3][2]+"]"+"["+M2[3][3]+"]"+"["+M2[3][4]+"]");
System.out.println("["+M2[4][0]+"]"+"["+M2[4][1]+"]"+"["+M2[4][2]+"]"+"["+M2[4][3]+"]"+"["+M2[4][4]+"]");       
        
  System.out.println(" La Matriz Nueva es la siguiente: ");
System.out.println("["+s[0][0]+"]"+"["+s[0][1]+"]"+"["+s[0][2]+"]"+"["+s[0][3]+"]"+"["+s[0][4]+"]");
System.out.println("["+s[1][0]+"]"+"["+s[1][1]+"]"+"["+s[1][2]+"]"+"["+s[1][3]+"]"+"["+s[1][4]+"]");
System.out.println("["+s[2][0]+"]"+"["+s[2][1]+"]"+"["+s[2][2]+"]"+"["+s[2][3]+"]"+"["+s[2][4]+"]");
System.out.println("["+s[3][0]+"]"+"["+s[3][1]+"]"+"["+s[3][2]+"]"+"["+s[3][3]+"]"+"["+s[3][4]+"]");
System.out.println("["+s[4][0]+"]"+"["+s[4][1]+"]"+"["+s[4][2]+"]"+"["+s[4][3]+"]"+"["+s[4][4]+"]"); 

    }
  }