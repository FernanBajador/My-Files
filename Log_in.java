import java.util.Scanner;
public class UserPass {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		String user, pass;
		
		System.out.print("Enter username: ");
		user = input.nextLine();
		System.out.print("Enter your password: ");
		pass = input.nextLine();
		
		if(user.equals("John") && (pass.equals ("Gwapo"))){
		    System.out.println("Welcome!!");
		}else{
		    System.out.println("Wrong username or password! ");
		    
		}
	}
}