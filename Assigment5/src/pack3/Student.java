package pack3;

public class Student {
	private int id;
	private String name;
	Depatment dpt = new Depatment();
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dpt=" + dpt + "]";
	}
	public Depatment getDpt() {
		return dpt;
	}
	public void setDpt(Depatment dpt) {
		this.dpt = dpt;
	}
	Student(){}
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
	
	public Student(int id, String name, Depatment dpt) {
		this.id = id;
		this.name = name;
		this.dpt = dpt;
	}
	

}
