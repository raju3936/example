package pack3;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		Helper h=new Helper();
		
		List<Student> sts = new ArrayList<Student>();
		
		for(int i = 0; i < 5; i++) {
			Student s=new Student(i,"abc"+i,"cse"+i);
			sts = h.add(s, sts);
		}
		System.out.println(sts);
		for(int i=10;i<15;i++) {
			Student s=new Student(i,"xyz"+i,"eee"+i);
			sts = h.update(s, sts);
		}
		System.out.println(sts);
		for(int i=0;i<5;i++) {
			Student s=new Student(i,"xyz"+i,"eee"+i);
			sts = h.update(s, sts);
		}
		System.out.println(sts);
		Student s=new Student(7,"xyz","eee");
		sts = h.delete(s, sts);
		System.out.println(sts);
		Student s1=new Student(10,"xyz","eee");
		sts = h.delete(s1, sts);
		System.out.println(sts);
	}

}
