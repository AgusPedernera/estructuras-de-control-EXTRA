/*
Escribir un programa que lea un número entero y devuelva el número de 
dígitos que componen ese número. Por ejemplo, si introducimos el número 12345, 
el programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar que las variables de tipo 
entero truncan los números o resultados.

 */
package estructuras.de.control.extra;
import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        int contador = 0;
      
        while (num > 0) {
           contador++;
          num/=10;
        }
        System.out.println("La cantidad de digitos es " +contador);
    }
    
}
