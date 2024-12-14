import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

String Q1, Q2, Q3, again;

	do {
		System.out.println("Do you have a fever?");
	Q1 = sc.next ();
	System.out.println("Do you have cough?");
	Q2 = sc.next ();
	System.out.println("Do you have difficulty in breathing?");
	Q3 = sc.next ();

	if (Q1. equalsIgnoreCase("Yes") || Q2. equalsIgnoreCase ("Yes") || Q3. equalsIgnoreCase ("Yes")) {
				System.out.println("You may have COVID-19 symptoms. Please Consult a healthcare professional");
			
	}else{
				System.out.println("You do not exhibit significant COVID-19 symptoms. Stay safe!");	
	}
     System.out.println("Do you want to check symptoms again (Yes/No)");
		    again = sc.next();

	}while (again.equalsIgnoreCase("Yes"));
	
	}
}
	