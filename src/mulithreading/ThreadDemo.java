package mulithreading;

public class ThreadDemo {
	public static void main(String[] args) {

	}
}

class Abc implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}