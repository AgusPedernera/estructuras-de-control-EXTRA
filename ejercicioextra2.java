/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente
a cada una. A continuación, realizar las instrucciones necesarias para que: 
B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. 
Utilizar sólo una variable auxiliar.

 */
package estructuras.de.control.extra;

/**
 *
 * @author tinap
 */
public class ejercicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int A,B,C,D, aux;
        A= 1;
        B= 2;
        C= 3;
        D= 4;
        System.out.println("Los valores iniciales son");
        System.out.println("A = " + A + " B = " + B + " C = "+C+" D = "+D);
        
       aux = B;
       
        B = C;
        C= A;
        A =D;
        D= aux;
        System.out.println("Los valores cambiados son");
        System.out.println("A = " + A + " B = " + B + " C = "+C+" D = "+D);
    }
    
}