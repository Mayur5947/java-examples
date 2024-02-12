package lambda_function;

public class lambda_function_demo1 implements Demo {

	public static void main(String[] args) {
		Demo demo = () -> System.out.println("this is lambda function");
		demo.m1();
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	



	// public static void m1() {
	// System.out.println("simple m1 method");
	// }
	// now we will above method in lambda function
	// we must have functional interface to call lambda function
	// rules of lambda function
	// it does not have method name
	// 2 it does not have return type
	// 3 it does not contain return type
	// 4 noo need of data type declaration

}
