package ObjectOriented;

public class AbstractionHomeWork {

	public static void main(String[] args) {
		// Create an abstract class Animal and two more classes that will implement that class.
		Lion myLion = new Lion();
		
		myLion.setAmountOfFood(10);
		myLion.setName("Billy");
		myLion.SetDiet("Zebra");
		
		System.out.println(myLion.getDiet());

	}

}

abstract class Animal{
	protected int age;
	
	protected String name;
	
	protected boolean isCarnivore;
	
	protected String diet;
	
	protected int hoursSleept;
	
	protected int amountOfFood;
	
	public abstract void SetDiet(String diet);
	
	public abstract String getDiet();
	
	public abstract void setHoursSleept(int hoursSleept);
	
	public abstract int getHoursSleept();
	
	public abstract void setName(String name);
	
	public String getName() {
		return name;
	}
	
	public abstract void setAmountOfFood(int amountOfFood);
	
	public abstract int getAmountOfFood();
	
	public abstract void setIsCarnivore(boolean isCarnivore);
	
	public abstract boolean getIsCarnivore();
}

class Lion extends Animal{

	@Override
	public void SetDiet(String diet) {
		this.diet = diet;
		
	}

	@Override
	public void setHoursSleept(int hoursSleept) {
		this.hoursSleept = hoursSleept;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void setAmountOfFood(int amountOfFood) {
		this.amountOfFood = amountOfFood;
	}

	@Override
	public void setIsCarnivore(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
		
	}

	@Override
	public String getDiet() {
		return this.diet;
		
	}

	@Override
	public int getHoursSleept() {
		return this.hoursSleept;
		
	}

	@Override
	public String getName() {
		return this.name;
		
	}

	@Override
	public int getAmountOfFood() {
		return this.amountOfFood;
		
	}

	@Override
	public boolean getIsCarnivore() {
		return this.isCarnivore;
		
	}
}

class zebra extends Animal{

	@Override
	public void SetDiet(String diet) {
		this.diet = diet;
		
	}

	@Override
	public void setHoursSleept(int hoursSleept) {
		this.hoursSleept = hoursSleept;
		
	}

	@Override
	public void setName(String name) {
		this.name = name;
		
	}

	@Override
	public void setAmountOfFood(int amountOfFood) {
		this.amountOfFood = amountOfFood;
		
	}

	@Override
	public void setIsCarnivore(boolean isCarnivore) {
		this.isCarnivore = isCarnivore;
		
	}

	@Override
	public String getDiet() {
		return this.diet;
		
	}

	@Override
	public int getHoursSleept() {
		return hoursSleept;
	}

	@Override
	public String getName() {
		return this.name;
		
	}

	@Override
	public int getAmountOfFood() {
		return this.amountOfFood;
		
	}

	@Override
	public boolean getIsCarnivore() {
		return this.isCarnivore;
		
	}
	
}