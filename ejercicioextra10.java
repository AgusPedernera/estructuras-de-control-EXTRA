/*
Realice un programa para que el usuario adivine el resultado de una 
multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar 
su respuesta nuevamente. Para realizar este ejercicio investigue como utilizar 
la función Math.random() de Java.

 */
package estructuras.de.control.extra;
import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int)(Math.random()*10+1);
        int num2 =(int)(Math.random()*10+1);
        int resultado = num1*num2;
        int respuesta;
        
        System.out.println("Adivine el resultado de multiplicar "+num1 +"y" + num2);
            System.out.println("Ingrese la respuesta");
            respuesta = leer.nextInt();
            
           while (resultado != respuesta) {
               System.out.println("Incorrecto, vuelva a ingresar");
               respuesta = leer.nextInt();
               
            
        }
           System.out.println("Correcto");
}

    }
    

