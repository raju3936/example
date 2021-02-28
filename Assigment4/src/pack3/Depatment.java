package pack3;

public class Depatment {
	private int id;
	private String name;
	private int strength;
	
	Depatment(){}
	Depatment(int id,String name,int strength){
		this.id = id;
		this.name = name;
		this.strength = strength;
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
	@Override
	public String toString() {
		return "Depatment [id=" + id + ", name=" + name + ", strength=" + strength + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	

}
