package default_methods;
@FunctionalInterface
public interface Demo_ineterface {

	void m1();
	default void m2() {
		System.out.println("it is an default method");
	}
}
