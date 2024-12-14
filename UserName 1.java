/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Username;

/**
 *
 * @author John Fernand Bajador
 */
import java.util.Scanner;
public class UserName {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;
                
    while(attempt > 5){
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter you password: ");
        String password = sc.nextLine();
        String status = validator(username, password);
        
        if (status.equals("successfully")){
           System.out.println("Login successfully");
            break; 
        }else if (status.equals("Failed")){
            System.out.println("Wrong username or password");
            attempt++;
            System.out.println("attempt" + attempt);
            System.out.println();
        }
    }
        if (attempt==5){
            System.out.println("You've out of attempts");
            sc.close();
        }    
    }
    private static String validator(String username, String password){
        String defaultUsername = "Fernand";
        String defaultPassword = "1234";

        if (username.equals(defaultUsername) && password.equals(defaultPassword)){
            return "succcessfully";
       }else{
            return "failed";    
                
    }
    
  }    
}
