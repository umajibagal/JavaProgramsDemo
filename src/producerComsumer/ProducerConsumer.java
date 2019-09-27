package producerComsumer;

public class ProducerConsumer {

	public static void main(String[] args) {
		StackCommon s = new StackCommon();
		Runnable r1 = () -> {
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
		};

		Runnable r2 = () -> {
			synchronized (s) {
				while (true) {
					if (s.getTop() == 4) {
						try {
							s.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}else
						s.produce();
				}
			}
		};

		Thread c = new Thread(r1);
		Thread p = new Thread(r2);

		c.start();
		p.start();
	}

}
