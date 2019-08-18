package questions;

public interface DoNothing {

	default void doNothing() { System.out.println("doNothing"); }
}
