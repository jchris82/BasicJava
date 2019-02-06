package ObjectOriented;

public class InheritanceHomeWork {

	public static void main(String[] args) {
		MetalTable ironTable = new MetalTable(new Size3D(1,2,3), "Iron");
		WoodenTable oakTable = new WoodenTable(new Size3D(2,3,4),"Oak");
		
		System.out.println(ironTable.getMetalType());
		System.out.println(ironTable.getTableSize().z);

	}

}

class Size1D {
	int x;
	
	public Size1D(int x) {
		this.x = x;
	}
}

class Size2D extends Size1DD{
	int y;
	
	public Size2D(int x, int y) {
		super(x);
		this.y = y;
	}
}

class Size3D extends Size2DD{
	int z;
	
	public Size3D(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}	
}


class Table{
	// table "has a" size 3D
	private Size3D tableSize;
	
	public Table(Size3D tableSize) {
		this.tableSize = tableSize;
	}

	public Size3D getTableSize() {
		return tableSize;
	}

	public void setTableSize(Size3D tableSize) {
		this.tableSize = tableSize;
	}
	
}

class WoodenTable extends Table{
	private String woodType;
	
	
	public String getWoodType() {
		return woodType;
	}


	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}


	public WoodenTable(Size3D tableSize, String woodType) {
		super(tableSize);
		this.woodType = woodType;
		
		
	}
	
}

class MetalTable extends Table{
	private String metalType;
	
	
	public String getMetalType() {
		return metalType;
	}


	public void setMetalType(String metalType) {
		this.metalType = metalType;
	}


	public MetalTable(Size3D tableSize, String metalType) {
		super(tableSize);
		this.metalType = metalType;
	}
}
