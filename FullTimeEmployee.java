import java.util.Scanner;

public class FullTimeEmployee extends Employee {
	private double Basic;
	private double Allowance;
	private double Deductions;

	public FullTimeEmployee(double basic, double allowance, double deductions) {
		Basic = basic;
		Allowance = allowance;
		Deductions = deductions;
	}

	public double CalcSalary() {
		double Sal = 0;
		return Sal = this.Basic + this.Allowance - this.Deductions;
	}
	public static void main(String[] arr){
		String firstName;
		String lastName;
		double Sal = 0;
		//Employee emp3 = new Employee();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("----------------------------");
			System.out.println("|     Employees      |");
			System.out.println("----------------------------");
			System.out.println("|  1. FUll TIME EMPLOYEE     |");
			System.out.println("|  2. PART TIME EMPLOYEE    |");
			System.out.println("|  3. EXIT                 |");
			System.out.println("----------------------------");
			System.out.println("Enter Your Choice ?");
			int choice = sc.nextInt();
	             firstName = sc.next();
	             lastName = sc.next();
			switch (choice) {
			case 1:
				PartTimeEmployee pte = new PartTimeEmployee(10000,5000,2000);
				System.out.println("Enter Your Course ?");
				Sal = pte.CalcSalary();
				Employee emp = new Employee();
				System.out.println("Your part time salary is :" + Sal);
				System.out.println("Your full name is :"+emp.getRealName(firstName,lastName));
				break;
			case 2:
			FullTimeEmployee fte = new FullTimeEmployee(20000,6000,1000);
				System.out.println("Enter Your Course ?");
				Employee emp1 = new Employee();
				Sal = fte.CalcSalary();
				System.out.println("Your full time salary is :" + Sal);
				System.out.println("Your full name is :"+emp1.getRealName(firstName,lastName));	
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Please select your choice range 1- 3 only");

	}
		}
	}
}
