
public class Employee {
	private int EmpId;
	private double Sal = 0;
	private double Basic;
	private double Allowance;
	private double Deductions;
	private String FirstName;
	private String LastName;
	private String Address;
	private String Pincode;

	public Employee() {
	}

	public Employee(double Basic, double Allowance, double Deductions) {
		this.Basic = Basic;
		this.Allowance = Allowance;
		this.Deductions = Deductions;

	}

//	public String getFirstName() {
//		return FirstName;
//	}
//
//	public void setFirstName(String firstName) {
//		this.FirstName = firstName;
//	}
//
//	public String getLastName() {
//		return LastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.LastName = lastName;
//	}

	public String getRealName(String firstName,String lastName) {
		return firstName + lastName;
	}

	public double CalcSalary() {
		return this.Sal = this.Basic + this.Allowance - this.Deductions;
	}

}
