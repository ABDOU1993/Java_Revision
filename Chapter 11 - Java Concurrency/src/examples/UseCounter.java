package examples;

public class UseCounter implements Runnable {
	
	public synchronized void increment() {
		Counter.count++;
		System.out.print(Counter.count + " ");
	}

	@Override
	public void run() {
		increment();
		increment();
		increment();		
	}

}
