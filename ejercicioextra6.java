/*
Leer la altura de N personas y determinar el promedio de estaturas 
que se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 */
package estructuras.de.control.extra;

import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese que cantidad de personas quiere ingresar");
        int N = leer.nextInt();
        double suma = 0;
        double altura = 0;
        int contador = 0;
        double suma2 = 0;
       
    
        for (int i = 0; i < N; i++) {
            
            System.out.println("Ingrese la altura de la persona "+i);  
            altura = leer.nextDouble();
           suma+=altura;
           
            if (altura < 1.60) {
            suma2+=altura;
             contador++;
                
            }
        }
        
        
        System.out.println("El promedio de alturas es "+ suma/N);
        System.out.println("El promedio de alturas menor a 1,60 es "+ suma2/contador);
    }
    
}
