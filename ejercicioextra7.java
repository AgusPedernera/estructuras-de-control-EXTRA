/*
 Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
y el promedio de n números (n>0). El valor de n se solicitará al principio del programa 
y los números serán introducidos por el usuario. Realice dos versiones del programa, 
una usando el bucle “while” y otra con el bucle “do - while”.

 */
package estructuras.de.control.extra;

import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantida de numeros que desea ingresar");
        int N = leer.nextInt();
        int i = 0;
        int mayor = 0, menor=0, num,suma=0;
  
        
        while (i< N) {
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            suma+=num;
            menor=num;
            i++;
            if (mayor < num) {
                
                mayor=num;
                
            }else if (menor > num) {
                menor = num;
                
            }
            
        }
        System.out.println("El numero mayor es " + mayor);  
        System.out.println("El numero menor es " + menor);
        System.out.println("El promedio de todos los numeros es "+(double) suma/N);
    }
    
}
