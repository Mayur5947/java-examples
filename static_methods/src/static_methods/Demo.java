package static_methods;

public interface Demo {

	void m1();
	static void m2() {
		System.out.println("static method of interface");
	}
	default  void m3() {
		System.out.println("default method of interface");
	}
}
