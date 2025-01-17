package ParallelStreams;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.LongStream;

public class PrimeNumbers {

	private static boolean isPrime(long val) {
		for (long i = 2; i <= val / 2; i++) {
			if ((val % i) == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		long numOfPrimes = LongStream.rangeClosed(2, 100_000)
				.parallel()
				.filter(PrimeNumbers::isPrime)
				.count();
		System.out.println(numOfPrimes);
		
		System.out.println(ForkJoinPool.commonPool().getParallelism());

	}

}
