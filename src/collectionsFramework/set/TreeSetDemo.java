package collectionsFramework.set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		Student[]s = new Student[5];
		s[0] = new Student(2, "bbb");
		s[1] = new Student(1, "ccc");
		s[2] = new Student(3, "aaa");
		s[3] = new Student(5, "zzz");
		s[4] = new Student(4, "rrr");
		
		TreeSet<Student> ts = new TreeSet<Student>(new RollComparator());
		ts.add(s[0]);
		ts.add(s[1]);
		ts.add(s[2]);
		ts.add(s[3]);
		ts.add(s[4]);
		NavigableSet<Student> tt = ts.descendingSet();
		System.out.println("*************");
		for (Student student : tt) {
			System.out.println(student.getRoll()+"  "+student.getName());
		}
		System.out.println("*************");
		Iterator<Student> stud = ts.iterator();
		System.out.println("Data of student : ");
		while(stud.hasNext()) {
			Student t = stud.next();
			System.out.println(t.getRoll()+"  "+t.getName());
		}
		System.out.println("-----------------"+ts.first().getName()+"  "+ts.first().getRoll());
		
		
	}
}
class RollComparator implements Comparator<Student>{
	
	public int compare(Student s1,Student s2) {
		return s1.getRoll() - s2.getRoll();
	}
}

class NameComparator implements Comparator<Student>{
	
	public int compare(Student s1,Student s2) {
		return s2.getName().compareTo(s1.getName());
	}
}
class Student{
	private int roll;
	private String name;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int r,String n) {
		this.setRoll(r);
		this.setName(n);
	}
}