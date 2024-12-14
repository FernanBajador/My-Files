import java. util. Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("I type ang una nga number:");
	double n1 = input.nextDouble();
	
		System.out.println("I type ang ika duha nga number:");
	double n2 = input.nextDouble();
	
	System.out.println("Pili ka unsa imong gamiton (+,-,*,/): ");
	char operator = input.next().charAt(0);
	
	double result;
	
	switch(operator){
	    case '+':
	        result = n1 + n2;
	        break;
	     case '-':
	         result = n1 - n2;
	         break;
	     case '*':
	         result = n1 * n2;  
	         break;
	      case '/':
	          result = n1 / n2;
	          break;
	     default:
	     System.out.println("pataka raka oi ayaw kog atika");
	     return;
	     
	}     
	     
	    System.out.println("Ang result kay: " + result);                 
	       
	}
}		
						

         
		
	

		
	
