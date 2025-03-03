 

package com.mycompany.bucles;

import java.util.Scanner;

 

 
public class CalculadoraSimple {
    
     public static void main(String[] args) {
       
 int num1, num2;
 char operacion;
boolean bandera = true;
 
 Scanner sc = new Scanner (System.in);
 
   System.out.println("-------BIENVENIDO A LA CALCULADORA SIMPLE----------------- ");
  
 
 do {
 
           System.out.println("¿Qué operación quieres realizar?");
           System.out.println("[+] Para realizar una suma");
           System.out.println("[-] Para realizar una resta"); 
           System.out.println("[x] Para realizar una multiplicación");
           System.out.println("[1] Para salir de la calculadora");
           
               operacion = sc.next().charAt(0);
               
             
          
           if ( operacion == '1' ) {
               
               bandera = false;
               
               break;  }
               
            if (operacion != '+' && operacion != '-' && operacion != 'x' && operacion != 'X') {
                
        System.out.println("Error: Operación no válida. Inténtalo de nuevo.");
        
        continue;
        
            }
          
 
            System.out.println("Escribe un número");
         
         num1 = sc.nextInt();
         
         System.out.println("Escribe otro número");
         
         num2 = sc.nextInt();
                
   
        
            switch (operacion) { 
                
                case '+' : num1+=num2;   
                
                    System.out.println("El reusultado de la operación fue " +num1);
                    
                    break;
                    
                case '-' : num1-=num2;
                
                    System.out.println("El resultado de la operación fue " +num1);
                
                break;
                    
                case 'x' : num1*=num2;
                
                  System.out.println("El resultado de la operación fue " +num1);
                  
                  break;
                  
                    case 'X' : num1*=num2;
                
                  System.out.println("El resultado de la operación fue " +num1);
          
                  break;
                  
                   
            }
            
           
             
     
        } while ( bandera != false );{
     
         System.out.println("Hasta la próxima :) ");
     
     }
 
        
        
        
        
    }
}
        
        
   
 
