package group8.activity;
import java.util.Scanner;
public class Activity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String firstname = sc.nextLine();
        System.out.println("Firtname:");
        String middlename = sc.nextLine();
        System.out.println("Middle In:");
        String lastname = sc.nextLine();
        System.out.println("Lastname");
        
        System.out.println(Name(firstname, middlename, lastname));
    }
    
    public static String Name(String firstname, String middlename,
            String lastname){
        return "My name is" + firstname + " "+ middlename + " " +lastname ;
    }

}