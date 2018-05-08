import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = s.next();
		s.nextLine();
		System.out.println("Enter your address");
		String address = s.nextLine();
		System.out.println("Enter your company name");
		String companyName = s.nextLine();
		System.out.println(name + " " + address + " " + companyName);
	}
}
