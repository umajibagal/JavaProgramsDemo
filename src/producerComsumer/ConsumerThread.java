package producerComsumer;

public class ConsumerThread extends Thread {
	StackCommon s;

	public ConsumerThread(StackCommon s) {
		this.s = s;
	}

	public void run() {
		synchronized (s) {
			while (true) {
				if (s.getTop() == -1) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					s.consume();
				}
			}
		}
	}
}
