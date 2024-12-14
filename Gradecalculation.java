/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group8.activity;

/**
 *
 * @author John Fernand Bajador
 */
import java.util.Scanner;
public class Gradecalculation {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first grade: ");
        int firstgrade = sc.nextInt();
        System.out.println("Enter you second grade: ");
        int secondgrade = sc.nextInt();
        System.out.println("Enter you third grade: ");
        int thirdgrade = sc.nextInt();
        int grade = calculateAverage(firstgrade, secondgrade, thirdgrade);
        
        System.out.println("Your average is " + grade);
    if(grade >= 75){
        System.out.println("You passed");
   }else{
        System.out.println("You failed");
    }    
        
  }
    public static int calculateAverage(int firstgrade, int secondgrade, int thirdgrade) {
        return(firstgrade + secondgrade + thirdgrade) / 3;
    }
}
