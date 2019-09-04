package examples;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Long> {

	long n;

	public Factorial(long n) {
		this.n = n;
	}

	@Override
	public Long call() throws Exception {
		if (n <= 0) {
			throw new Exception("for finding factorial, N should be > 0");
		}
		long fact = 1;
		for (long longVal = 1; longVal <= n; longVal++) {
			fact *= longVal;
		}
		return fact;
	}

}
