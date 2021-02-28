package pack3;

import java.util.ArrayList;
import java.util.List;

public class Helper {
	Helper(){}
	private int flag = 0;
	private int flag1 = 0;
	private int flag2 = 0;
	List<Student> students=new ArrayList<Student>();
	
	public void add(Student student) {
		for(Student st : students) {
			if(st.getId()==student.getId()) {
				this.flag=1;
				st.setName(student.getName());
				st.setDpt((student.getDpt()));
				break;
			}
		}
		if(this.flag==0) {
			students.add(student);
		}
	}
	public void update(Student student) {
		//private int fg = 1;
		for(Student st : students) {
			if(st.getId()==student.getId()) {
				this.flag1=1;
				st.setName(student.getName());
				st.setDpt((student.getDpt()));
				break;
			}
		}
		if(this.flag1==0) {
			students.add(student);
		}
	}
	public void delete(Student student) {
		for(Student st : students) {
			if(st.getId()==student.getId()) {
				this.flag2=1;
				students.remove(student);
				break;
			}
		}
		if(this.flag2==0) {
			System.out.println("Student not exist");
		}
	}
	
	public void print() {
			System.out.println(students);
		
	}
	
	

}
