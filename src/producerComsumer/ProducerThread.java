package producerComsumer;

public class ProducerThread extends Thread {
	StackCommon s;

	public ProducerThread(StackCommon s) {
		this.s = s;
	}

	public void run() {

		synchronized (s) {
			while (true) {
				if (s.getTop() == 4) {
					try {
						s.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				} else {
					s.produce();
				}
			}
		}
	}
}
