
public class PartTimeEmployee extends Employee {
	
	private double Sal = 0;
	private double Basic;
	private double Allowance;
	private double Deductions;

	public PartTimeEmployee(double Basic, double Allowance, double Deductions) {
		this.Basic = Basic;
		this.Allowance = Allowance;
		this.Deductions = Deductions;
	}

	public double CalcSalary() {
		double Sal = 0;
		return Sal = this.Basic + this.Allowance - this.Deductions;
	}
}
