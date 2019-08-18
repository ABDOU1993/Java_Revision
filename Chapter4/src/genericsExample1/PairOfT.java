package genericsExample1;

public class PairOfT<T> {

	private T one;
	private T two;

	public PairOfT(T one, T two) {
		this.one = one;
		this.two = two;
	}

	public T getFirst() {
		return one;
	}

	public T getSecond() {
		return two;
	}
	
	public static void main(String[] args) {
		PairOfT<String> worldCup = new PairOfT<String>("Pair", "Of T");
		System.out.println("Test PairOfT : " + worldCup.getFirst() + 
				" -- " + worldCup.getSecond());
	}
}
