import java.util.Scanner;

public class StudentScores {
    public static void main(String[] args) {
        String[] students = {"Willy", "Chaby", "Mico", "Fritch"};
        int[] scores = {85, 92, 78, 88};

        System.out.println("Student List:");
        displayScores(students, scores);

        Scanner scanner = new Scanner(System.in);
        
       
        int index = -1;
        while (true) {
            System.out.print("Enter the index of the student to update (0 to " + (students.length - 1) + "): ");
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
                if (index >= 0 && index < students.length) {
                    break;
                } else {
                    System.out.println("Invalid index. Please enter a number between 0 and " + (students.length - 1) + ".");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }

       
        int newScore = -1;
        while (true) {
            System.out.print("Enter the new score for " + students[index] + ": ");
            if (scanner.hasNextInt()) {
                newScore = scanner.nextInt();
                if (newScore >= 0 && newScore <= 100) {
                    break;
                } else {
                    System.out.println("Invalid score. Please enter a number between 0 and 100.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); 
            }
        }

        scores[index] = newScore;

        System.out.println("\nUpdated Student List:");
        displayScores(students, scores);
    }

    public static void displayScores(String[] students, int[] scores) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " - " + scores[i]);
        }
    }
}