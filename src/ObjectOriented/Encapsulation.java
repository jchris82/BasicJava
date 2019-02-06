package ObjectOriented;

import javax.script.ScriptEngineManager;

public class Encapsulation {

	public static void main(String[] args) {
		// Encapsulation 
		// have the ability to make a attribute to read only or write only
		
		Tv myTv = new Tv();
		
		myTv.setScreenSize(20);
		System.out.println(myTv.getScreenSize());
		

	}

}

class Tv {
	private ScreenSize ScreenSize;
	
	private int id;
	
	private float cost;
	
	private String processorName;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getProcessorName() {
		return processorName;
	}

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	public int getPixelCount() {
		return pixelCount;
	}

	public void setPixelCount(int pixelCount) {
		this.pixelCount = pixelCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private int pixelCount;

	private String name;

	public void setScreenSize(int screenSize) {
		ScreenSize t = new ScreenSize();
		t.setSize(screenSize); 
		if(screenSize < 100 && screenSize !=50) { 
			this.ScreenSize = t;
		}	
	}	

	public int getScreenSize() {
		return ScreenSize.getSize();
	}
}

class ScreenSize {
	private int size = 0;
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	String dateOfCreation;
}