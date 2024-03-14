//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.m1();
        main.m1(10);
    }

    public void m1() {
        System.out.println("this is non parameterized m1 method");
    }

    public void m1(int a) {
        System.out.println("this is m1 parameterized method");
    }
}