import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 0;

        while (attempt < 5) {
            System.out.println("Enter your username: ");
            String username = sc.nextLine();
            System.out.println("Enter your password: ");
            String password = sc.nextLine();

            String status = loginValidation(username, password);
            if (status.equals("success")) {
                System.out.println("Login Successful");
                break;
            } else if (status.equals("failed")) {
                System.out.println("Login failed! Please Try Again");
                attempt++;
                System.out.println("Attempt: " + attempt);
            }
        }
        
        if (attempt == 5) {
            System.out.println("You've reached 5 attempts. Please try again later.");
        }
        sc.close();
    }

    private static String loginValidation(String username, String password) {
        String Username = "Rich";
        String Password = "1234";
        
        if (username.equals(Username) && password.equals(Password)) {
            return "success";
        } else {
            return "failed";
        }
    }
}