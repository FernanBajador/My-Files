import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER LETTER OR NUMBER!");
		System.out.println();
		char m = sc.next().charAt(0);
		
		if ((m >= 'A' && m <= 'Z') || (m >= 'a'&& m <= 'z')) {
			System.out.print("You entered a Letter");
		} else if ((m >= '0' && m <= '9')) { System.out.print(" You entered a Number");
		} else { 
		System.out.print(" INPUT IS INVALID");
		}			
	}
}