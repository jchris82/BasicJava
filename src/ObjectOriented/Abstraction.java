package ObjectOriented;

public class Abstraction {

	public static void main(String[] args) {
		
		MonthlyEmployee m = new MonthlyEmployee();
		
		m.setSalary(1500);
		System.out.println(m.getSalary());
		
		HourlyEmployee e = new HourlyEmployee();
		e.setSalary(15);
		e.setHoursWorked(15);
		System.out.println(e.getSalary());
	}

}

abstract class employee{
	protected int salary;
	
	public abstract void setSalary(int salary);
	
	public abstract int getSalary();
}

class MonthlyEmployee extends employee {
	int a = salary;
	
	@Override
	public void setSalary(int salary) {
		this.salary = salary;
		
	}

	@Override
	public int getSalary() {
		return salary;

	}
}

class HourlyEmployee extends employee {
	
	private int hoursWorked;
	
	
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public void setSalary(int salary) {
		 this.salary = salary;
	}

	@Override
	public int getSalary() {
		return hoursWorked * salary;
		
	}

}
