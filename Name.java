import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("First Name");
		String firstname = sc.nextLine();
		System.out.println("Last Name");
		String lastname = sc.nextLine();

		System.out.println(Name(firstname, lastname));

	}

	public static String Name(String firstname, String lastname) {
		return "My name is " + firstname + " " + lastname;
	}
}