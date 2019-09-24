package polymorphism;

import java.io.IOException;

class Abc {

	public static void demo() {
		System.out.println("demo");
	}

	public static void demo(int x) {
		System.out.println("demo1");
	}

	public void demo3() {
		System.out.println("abc demo2");
	}
}

class Xyz extends Abc {
	public static void demo() {
		System.out.println("xyz demo1");
	}

	public static void demo1() {
		System.out.println("abc demo1");
	}

	public void demo2() {
		System.out.println("xyz demo2");
	}
}

public class OverloadingOverriding {
	public static void main(String[] args) {
		Xyz x = new Xyz();
		x.demo2();
		
		Abc a = new Xyz();
		a.demo3();
		
	}
}
