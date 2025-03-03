 

package ejercicio;
 
import java.util.Scanner;




 
public class Ejercicio {

 
 

    public static void main(String[] args) {
       
   
   Scanner sc = new Scanner(System.in);
   
   
        System.out.println("Ingresa el número de filas");
   
        int fila = sc.nextInt();
        
        System.out.println("Ingresa el caracter a usar");
        
        String caracter = sc.next();
  
        
        for (int i = 1; i<=fila; i++ ){
            
           
          
         for (int j = 1; j<i; j++)   {
             
                  
               System.out.print(caracter);                    
             
         
         } System.out.println(caracter);
         
            
        }
        
 
        
}   

 
}           
            
      
           
 