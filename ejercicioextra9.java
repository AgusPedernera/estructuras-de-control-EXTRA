/*
 *Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 */
package estructuras.de.control.extra;
import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dividendo y el divisor");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int resto=0;
        int resultado=0;
       
        while (num1 > num2) {
           num1 -= num2 ;
           
            resultado++;
            
            
        }
            
          System.out.println("El resultado de la division por resta es " + resultado + " y el resto es "+ num1);  
            
      
        
            
        
    }
    
}
