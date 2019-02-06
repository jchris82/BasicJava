package ObjectOriented;

public class Polymorphism {

	public static void main(String[] args) {
		//deer bill = new deer();
		
		//bill.setAge(13);
	//	bill.setColor("brown");
	//	bill.setYear(13);
		
		//System.out.println("age = " + bill.getAge() + " color = " + bill.getColor() + " years vegetarian " + bill.getYears());
	//	System.out.println(bill.toString());
		
		// bill is a deer, bill is a vegetarian and bill is an Object
		//System.out.println(bill instanceof vegetarian);
		
	}

}
/*
class deer extends vegetarian {
	private int age;
	private String color;
	
	@Override
	public String toString() {
		return "Deer age= " + age + " color = "+color+" years vegetarian: "+years;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
}

class vegetarian{
	protected int years;
	
	public void setYear(int years) {
		this.years = years;
	}
	
	public int getYears() {
		return years;
	}
}

*/
