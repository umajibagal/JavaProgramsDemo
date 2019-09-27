package collectionsFramework.ComparableComprator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class ComparatorDemo implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getRoll() - o2.getRoll();
				
	}
	
}

class Student {
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

	public Student(int roll, String name) {

		this.setName(name);
		this.setRoll(roll);
	}

	
//	public int compareTo(Student o) {
//		return this.roll - o.roll;
//	}

}


public class ComparableDemo {
	public static void main(String[] args) {
		Student[] s = new Student[3];
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < s.length; i++) {
			System.out.println("Enter roll and name of student");
			s[i] = new Student(Integer.parseInt(sc.next()), sc.next());
			list.add(s[i]);
		}
		
		Collections.sort(list,new ComparatorDemo());
		for (Student student : list) {
			System.out.println(student.getRoll()+"  : "+student.getName());
		}
		System.out.println("Java 8");
		list.forEach(System.out::print);
	}

}
