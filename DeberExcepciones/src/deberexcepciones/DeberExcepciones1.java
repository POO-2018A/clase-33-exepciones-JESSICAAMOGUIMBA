
package deberexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeberExcepciones1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        System.out.println("EXCEPCIONES DE NUMEROS\n");
        System.out.print("Ingrese el tamaño de el arreglo de numeros:  ");
      
        int tamanio = scan.nextInt();
        System.out.println("Ingrese los " + tamanio + "  numeros del arreglo\n");
        int numero[] = new int[tamanio];
       
        
        try{
            for (int i = 0; i < tamanio; i++) {
                System.out.print("Ingrese los Valores numericos en la posicion"+ (i+1)+" :" + " NUMERO--->  ");
                numero[i] = scan.nextInt();
            }
            
            System.out.print("Escoja la posicion de un numero que desee");
            int posicionNumero = scan.nextInt();
            
            System.out.println("La posicion que seleciono es : " + numero[posicionNumero-1]);
            
            
        }catch(InputMismatchException e){
            System.out.println("Excepcion,  cuando se ha ingresado una letra "); 
            System.out.println("Error lo ingresado no es un numero: "+ e.getMessage()+ "  Ubicacion:  "+ e.getStackTrace());
         
        }finally{
            System.out.println("");
            System.out.println("El programa sigue ejecutandse");
    }
        
        
    
    }
    
}
