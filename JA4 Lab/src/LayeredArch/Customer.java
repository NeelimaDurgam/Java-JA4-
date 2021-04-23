package LayeredArch;

public class Customer {

	private int id;
	private String name;
	private String loc;
	
	public Customer(int id, String name, String loc) {
		this.id = id;
		this.name = name;
		this.loc = loc;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
