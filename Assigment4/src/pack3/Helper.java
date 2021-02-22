package pack3;

import java.util.ArrayList;
import java.util.List;

public class Helper {
	Helper(){}
	private int flag = 0;
	private int flag1 = 0;
	private int flag2 = 0;
	List<Student> students=new ArrayList<Student>();
	
	public List<Student> add(Student student,List<Student> studentList) {
		for(Student st : studentList) {
			if(st.getId()==student.getId()) {
				this.flag=1;
				st.setName(student.getName());
				st.setBranch((student.getBranch()));
				break;
			}
		}
		if(this.flag==0) {
			studentList.add(student);
		}
		return studentList;
	}
	public List<Student> update(Student student,List<Student> studentList) {
		//private int fg = 1;
		for(Student st : studentList) {
			if(st.getId()==student.getId()) {
				this.flag1=1;
				st.setName(student.getName());
				st.setBranch((student.getBranch()));
				break;
			}
		}
		if(this.flag1==0) {
			studentList.add(student);
		}
		return studentList;
	}
	public List<Student> delete(Student student,List<Student> studentList) {
		for(Student st : studentList) {
			if(st.getId()==student.getId()) {
				this.flag2=1;
				studentList.remove(student);
				break;
			}
		}
		if(this.flag2==0) {
			System.out.println("Student not exist");
		}
		return studentList;
	}
	
	

}
