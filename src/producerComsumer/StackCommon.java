package producerComsumer;

import java.util.Random;

public class StackCommon {
	private int top=-1;
	private int []stack = new int[5];
	private Random r = new Random();
	
	public int getTop() {
		return top;
	}
	public synchronized void consume() {
		System.out.print("\nconsuming items : ");
		while(top>-1) {
			System.out.print(stack[top--]+" ");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.notify();
	}
	public synchronized void produce() {
		System.out.print("\nproducing items : ");
		while(top < 4) {
			stack[++top]  = r.nextInt(10)+1;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(stack[top]+" ");
		}
		this.notify();
	}
}
