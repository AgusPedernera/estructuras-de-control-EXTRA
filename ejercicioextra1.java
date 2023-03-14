/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema 
debe calcular su equivalente: 1 día, 2 horas.
 */
package estructuras.de.control.extra;

import java.util.Scanner;

/**
 *
 * @author tinap
 */
public class ejercicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int minutos, dias, horas;
        System.out.println("Ingrese la cantidad de minutos");
        minutos = leer.nextInt();
        dias = minutos / (24*60);
        horas = (minutos % (24*60))/60;
     
        
        System.out.println(minutos+" minutos equivalen a " + dias + " dias y "+ horas + " horas");
    }
    
}
