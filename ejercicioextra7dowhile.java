/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras.de.control.extra;
import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra7dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
          System.out.println("Ingrese la cantida de numeros que desea ingresar");
        int N = leer.nextInt();
        int i = 0;
        int mayor = 0, menor=0, num,suma=0;
  
        
          do {
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
          while (i< N);
          
          
        System.out.println("El numero mayor es " + mayor);  
        System.out.println("El numero menor es " + menor);
        System.out.println("El promedio de todos los numeros es "+(double) suma/N);
        }
    
       
        
}



    
    
    
    

