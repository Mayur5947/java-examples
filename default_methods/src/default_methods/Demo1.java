package default_methods;

public class Demo1 implements Demo_ineterface {

	public static void main(String[] args) {
		Demo_ineterface d = ()->System.out.println("Lambda function implementation");
		d.m1();
		Demo1 demo1 =  new Demo1();
		demo1.m2();
	}
}
