package DiamondProblem;

// @FunctionalInterface annotation (only one abstract method)

@FunctionalInterface
public interface Interface2 {

	// this interface is a functional interface though it declares 
	//two abstract methods:
	// test() and equals() methods. 
	//how is it a functional interface when it has two abstract methods?
	// Because equals() method signature matches from Object, and
	// the test() method is the only remaining abstract method,
	// and hence the Comparator interface is a functional interface

	void test();

	@Override
	boolean equals(Object arg0);

	default public void foo() {
		System.out.println("Interface2's foo");
	}
}
