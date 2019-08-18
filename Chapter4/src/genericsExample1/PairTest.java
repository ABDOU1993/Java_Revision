package genericsExample1;

public class PairTest<T1, T2> {

	T1 object1;
	T2 object2;

	PairTest(T1 one, T2 two) {
		object1 = one;
		object2 = two;
	}

	public T1 getFirst() {
		return object1;
	}

	public T2 getSecond() {
		return object2;
	}

	public static void main(String[] args) {
		
		// Diamond Syntax
		
		PairTest<Integer, String> worldCup = new PairTest<>(2018, "Russiaa");
		System.out.println("World cup " + worldCup.getFirst() + 
				" in " + worldCup.getSecond());
	}

}
