
package deberexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DeberExcepciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
        System.out.println("EXCEPCIONES DE UNA DIVISION\n");
       
        float numerador =0;
        float denominador= 0;
        float cociente;
        
        
        try{
        //int numerador,denominador, cociente;
            System.out.println("Ingrese el primer numero");
            numerador = scan.nextInt();
            System.out.println("Ingrese el segundo numero");
            denominador = scan.nextInt();
            cociente = numerador/denominador;
            
            if (denominador ==0) {
                System.out.println("Error, no existe division para cero");  
            }else{
            System.out.println("El resultado es: "+ cociente);
            }
        
        }catch(ArithmeticException e1){
           
            if (denominador==0) {
            System.out.println("Excepcion1 La division para cero no existe");
            System.out.println("Error: "+ e1.getMessage()+ "  Ubicacion:  "+e1.getStackTrace());
            }
            
        }catch(NullPointerException e2){//esta excepcion sera cunado una variable se le inicialice con 'null'
            System.out.println("Excepcion2  cuando el denominador es null");
            System.out.println("Error: "+ e2.getMessage()+ "  Ubicacion:  "+ e2.getStackTrace());
           
        }catch(InputMismatchException e3){
            System.out.println("Excepcion3  cuando se ha ingresado una letra "); 
            System.out.println("Error lo ingresado no ecorresponde a un numero: "+ e3.getMessage()+ "  Ubicacion:  "+ e3.getStackTrace());
         
        }finally{
            System.out.println("");
            System.out.println("El programa sigue ejecutandse");
    }
        
        
    
    }
    
}
