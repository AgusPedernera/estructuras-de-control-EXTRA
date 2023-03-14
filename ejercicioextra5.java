/*
Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de 
tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los 
mismos tratamientos que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, 
y luego un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.



 */
package estructuras.de.control.extra;

import java.util.Scanner;
/**
 *
 * @author tinap
 */
public class ejercicioextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese que tipo de socio es: A,B o C");
        String socio = leer.next();
        System.out.println("Ingrese el valor del tratamiento que desea realizarse");
        double importe = leer.nextDouble();
        
        
        switch (socio.toUpperCase()) {
            case "A" :
                System.out.println("Corresponde un descuento del 50%, el tratamiento le quedaria en : $" +importe/2);
                break;
             case "B" :
                 System.out.println("Corresponde un descuento del 35%, el tratamiento le quedaria en : $"+(importe - (importe*0.35)));
                break;
             case "C" :
                 System.out.println("No corresponde descuento, el valor quedaria en : $" +importe);
                break;
            default:
                System.out.println("Opcion incorrecta, vuelva a ingresar al sistema");;
        }
        
    }
    
}
