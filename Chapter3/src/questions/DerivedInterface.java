package questions;

public interface DerivedInterface extends BaseInterface {
	default void foo() { System.out.println("DerivedInterface's foo"); }
}
