package examples;

public class Counter1 implements Runnable {

	public void IncrementBallAfterRun() {
		synchronized (Runs.class) {
			synchronized (Balls.class) {
				Runs.runs++;
				Balls.balls++;
			}
		}
	}

	public void IncrementRunAfterBall() {
		synchronized (Balls.class) {
			synchronized (Runs.class) {
				Balls.balls++;
				Runs.runs++;
			}
		}
	}

	@Override
	public void run() {

		IncrementBallAfterRun();
		IncrementRunAfterBall();
	}

}
