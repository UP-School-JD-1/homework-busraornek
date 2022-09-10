package hw2ch5q1;


public class Director extends Manager {
	
	protected double bonus;
	
	public Director(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
		
		super(no, name, year, workingDepartment, managingDepartment);
		this.bonus = bonus;
		
	}
	
	@Override
	public void work() {
		System.out.println("Director is working!");
	}

	@Override
	public String toString() {
		return "Director [bonus=" + bonus + "]";
	}
	public double calculateSalary() throws SalaryPaidOnBankException {
		return super.calculateSalary() + bonus;
	}
	

}
