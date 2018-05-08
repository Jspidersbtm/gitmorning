import java.util.Scanner;

public class Employee {
	String name;
	int age;
	String department;
	String address;
	double salary;
	String empId;

	void show() {
		System.out.println(this.name + " " + this.age + " " + this.address + " " + this.salary + " " + this.empId + " "
				+ this.department);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your employee Id");
		e.empId = s.next();
		s.nextLine();
		System.out.println("Enter your name");
		e.name = s.nextLine();
		System.out.println("Enter your age");
		e.age = s.nextInt();
		System.out.println("Enter your address");
		s.nextLine();
		e.address = s.nextLine();
		System.out.println("Enter your salary");
		e.salary = s.nextDouble();
		System.out.println("Enter your department");
		e.department = s.next();
		e.show();
	}

}
