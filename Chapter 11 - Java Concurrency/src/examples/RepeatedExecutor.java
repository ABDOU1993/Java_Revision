package examples;

import java.util.concurrent.Executor;

public class RepeatedExecutor implements Executor {

	@Override
	public void execute(Runnable runnable) {
		new Thread(runnable).start();

	}

	public void execute(Runnable runnable, int times) {
		System.out.printf("Calling Task.run() %d times thro' "
				+ "Executor.execute() %n", times);
		for (int i = 0; i < times; i++) {
			execute(runnable);
		}
	}

}
