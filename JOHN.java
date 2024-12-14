/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author John Fernand Bajador
 */
import java.util.Scanner;

public class JOHN
{
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        String Retry;    
     do{   
        System.out.print("Do you have fever: (Yes/No):");
        String fever = sc.next();
        System.out.print("Do you have cough: (Yes/No):");
        String cough = sc.next();  
        System.out.print("Do you have any symtoms: (Yes/No):");
        String symtoms = sc.next();  
        if(fever.equalsIgnoreCase("Yes") || cough.equalsIgnoreCase("Yes") || symtoms.equalsIgnoreCase("Yes")) {                
            System.out.println("Go to the nearest hospital");
            
        }else{
        System.out.println("You do not exhibit significant COVID-19 symtoms. Stay safe!");

        }
        
        System.out.println("Do you want to try again");
        Retry = sc.next();
        
    }while(Retry.equalsIgnoreCase("Yes"));
    sc.close();
    } 
}

