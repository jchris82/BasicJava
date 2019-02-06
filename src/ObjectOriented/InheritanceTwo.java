package ObjectOriented;

public class InheritanceTwo {

	public static void main(String[] args) {
		Size3DD t = new Size3DD(12, 3, 4);
		
		System.out.println(t.z);
	}

}

class Size1DD {
	int x;
	
	public Size1DD(int x) {
		this.x = x;
	}
}

class Size2DD extends Size1DD{
	int y;
	
	public Size2DD(int x, int y) {
		super(x);
		this.y = y;
	}
}

class Size3DD extends Size2DD{
	int z;
	
	public Size3DD(int x, int y, int z) {
		super(x,y);
		this.z = z;
	}	
}

/*

class Table{
	// table "has a" size 3D
	private Size3D tableSize;

	public Size3D getTableSize() {
		return tableSize;
	}

	public void setTableSize(Size3D tableSize) {
		this.tableSize = tableSize;
	}
	
}

*/
