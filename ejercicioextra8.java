/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares 
y la cantidad de números impares. Al igual que en el ejercicio anterior los números negativos 
no deben sumarse. Nota: recordar el uso de la sentencia break.

 */
package estructuras.de.control.extra;
import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num ;
        int contador= 0;
        int par = 0, impar =0;
        
        do {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            
            if (num>0) {
                contador++;
                
            }
            
            if (num % 2 == 0 && num >0) {
                par++;
                
            }else if (num>0){
                
                impar++;
                
                
            }
        } while (num % 5 != 0);
        
            
        System.out.println("La cantidad de numeros positivos ingresados es " + contador);    
        System.out.println("La cantidad de numeros pares ingresados es " +par);
        System.out.println("La cantidad de numeros impares es " +impar);
        
        
        }
    }
    

