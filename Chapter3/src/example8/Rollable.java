package example8;

public interface Rollable {
	
	void roll(float degree);
	
	default void test() {
		System.out.println("test default method");
	}

}
