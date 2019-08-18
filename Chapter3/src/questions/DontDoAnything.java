package questions;

@FunctionalInterface
public interface DontDoAnything extends DoNothing {
	@Override
	abstract void doNothing();
}
