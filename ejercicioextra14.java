/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene 
una M cantidad de hijos. Escriba un programa que pida la cantidad de familias 
y para cada familia la cantidad de hijos para averiguar la media de edad de los 
hijos de todas las familias.

 */
package estructuras.de.control.extra;
import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       int Nfamilias , Mhijos=0, edad, totalEdad=0;
        System.out.println("Ingrese la cantidad de familias");
        Nfamilias = leer.nextInt();
        
        
        for (int i = 0; i < Nfamilias; i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i+1));
            Mhijos = leer.nextInt();
            for (int j = 0; j < Mhijos; j++) {
                System.out.println("Ingrese la edad del " +(j+1)+ "° hijo de la familia N° " +(i+1) );
                edad=leer.nextInt();
               totalEdad+=edad;
                
            }
        }
        int hijos = Nfamilias*Mhijos;
        
        System.out.println("La media de las edades de los hijos de todas las familias es " + totalEdad/hijos + "años");
    }
    
}
