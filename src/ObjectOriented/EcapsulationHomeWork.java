package ObjectOriented;

public class EcapsulationHomeWork {

	public static void main(String[] args) {

		Door myDoor = new Door();

		myDoor.setCost(500);
		myDoor.setMaterial("wood");
		System.out.println(myDoor.getCost());
		System.out.println(myDoor.getMaterial());

	}

}

class Door {
	private int cost;

	private String brand;

	private int weigth;

	private int height;

	private Material material;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		if (cost >= 100 && cost <= 500) {
			this.cost = cost;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getWeigth() {
		return weigth;
	}

	public void setWeigth(int weigth) {
		this.weigth = weigth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getMaterial() {
		return material.getType();
	}

	public void setMaterial(String material) {
		Material m = new Material();
		m.setType(material);
		this.material = m;
	}
}

class Material {
	private int price;

	private String type;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
