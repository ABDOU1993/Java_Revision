package examples;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long N=20;
		
		Callable<Long> task = new Factorial(N);
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		Future<Long> future = es.submit(task);
		System.out.printf("factorial of %d is %d", N, future.get());
		es.shutdown();
		
	}

}
