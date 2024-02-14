package static_methods;

import java.security.PublicKey;

public class StaticMethods implements Demo{

	public static void main(String[] args) {
		StaticMethods methods =  new StaticMethods();
		methods.m3();
		Demo.m2();///we can call static mehtods of interface by using interface name only
		//we can't inherit static methods of interface
		//we cant call using class name and cant call them object refrence
	}
	
	@Override
	public void m1() {
		System.out.println("m1 method implementation");
	}
}
