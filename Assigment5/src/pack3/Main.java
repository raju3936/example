package pack3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		Helper h=new Helper();
		
		//List<Student> sts = new ArrayList<Student>();
		
		for(int i = 0; i < 5; i++) {
			Depatment d = new Depatment(i,"cse"+i,60);
			Student s=new Student(i,"abc"+i,d);
			h.add(s);
		}
		h.print();
		for(int i=10;i<15;i++) {
			Depatment d = new Depatment(i,"eee"+i,60);
			Student s=new Student(i,"xyz"+i,d);
			h.update(s);
		}
		h.print();
		for(int i=0;i<5;i++) {
			Depatment d = new Depatment(i,"eee"+i,60);
			Student s=new Student(i,"xyz"+i,d);
			h.update(s);
		}
		h.print();
		Depatment d = new Depatment(7,"eee",60);
		Student s=new Student(7,"xyz",d);
		h.delete(s);
		h.print();
		Student s1=new Student(10,"xyz",d);
		h.delete(s1);
		h.print();
	}

}
