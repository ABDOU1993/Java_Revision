package questions;

public interface BaseInterface {
	default void foo() { System.out.println("BaseInterface's foo"); }
}
