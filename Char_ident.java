
package group8.bmi;
import java.util.Scanner;

    public class Char_ident {
        public static void main(String[] args) {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.println("Enter Character");
                String character = scanner.next();
                
                if ((character.matches("[a-z]"))||(character.matches("[A-Z]"))){
                    System.out.println(character + " is a letter");}
                else if (character.matches("[0-9]")){
                    System.out.println(character + " is a digit");}
                else{System.out.println("Invalid Input");}
            }
            
        }
    
    
}
