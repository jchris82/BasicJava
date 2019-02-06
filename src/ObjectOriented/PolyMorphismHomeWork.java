package ObjectOriented;

public class PolyMorphismHomeWork {

	public static void main(String[] args) {
		Elk mike = new Elk();
		
		mike.setAge(30);
		mike.setAntlerSize(20);
		mike.setWeight(500);
		System.out.println(mike.toString());

	}

}

class Deer extends Vegetarian {
	protected int age;
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

class Vegetarian{
	protected int years;
	
	public void setYear(int years) {
		this.years = years;
	}
	
	public int getYears() {
		return years;
	}
}

class Elk extends Deer{
	private int weight;
	
	private int antlerSize;	
	
	@Override
	public String toString() {
		return "Age is: " + age+ " AntlerSize = "+antlerSize+" Weight = " +weight+" Hp = "+getHp();
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAntlerSize() {
		return antlerSize;
	}

	public void setAntlerSize(int antlerSize) {
		this.antlerSize = antlerSize;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHp() {
		return ((this.weight * this.antlerSize) / this.age) * 100;
	}
}
