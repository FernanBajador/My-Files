import java.util.Scanner;

public class NewClass {
   
    
    public static void main(String[] args) {
        try (Scanner console = new Scanner(System.in)) {
            System.out.println("Login System");
            String user, pass, code;
            System.out.println("Enter User Name: ");
            user = console.nextLine();
            System.out.println("Enter Password: ");
            pass = console.nextLine();
            System.out.println("Enter Code");
            code = console.nextLine();
            
            if (pass.equals("John") && user.equals("Personal") && code.equals("060806")) {
                System.out.println("Welcome to Calculator");
                
                System.out.println("Enter first number: ");
                double n1 = console.nextDouble();
                System.out.println("Enter second number: ");
                double n2 = console.nextDouble();
                
                System.out.println("Choose arithmetic operation (+, -, *, /): ");
                char operator = console.next().charAt(0);
                
                double result;
                
                switch (operator) {
                    case '+' -> {
                        result = n1 + n2;
                        System.out.println("Result: " + result);
                    }
                    case '-' -> {
                        result = n1 - n2;
                        System.out.println("Result: " + result);
                           System.out.println("Operation Successful");
                    }
                    case '*' -> {
                        result = n1 * n2;
                        System.out.println("Result: " + result);
                           System.out.println("Operation Successful");
                    }
                    case '/' -> {
                        if (n2 != 0) {
                            result = n1 / n2;
                            System.out.println("Result: " + result);
                            System.out.println("Operation Successful");
                        } else {
                            System.out.println("Error");
                        }
                    }
                    default -> System.out.println("Invalid operator. Please choose +, -, *, or /.");
                }
            } else {
                System.out.println("Review your U,P,C");
            }
        }
    }
}
