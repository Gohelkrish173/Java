import java.util.Scanner;
public class MutableDemo{
	public static void main(String[] args) {
		MyClass m1 = new MyClass();
		m1.a = 10;
		int d = m1.addNumber2(25);
		System.out.println(d);
	}
}

class MyClass{
	int a;

	public int addNumber1(int b){
		a = a + b;
		return a;
	}
	public int addNumber2(int b){
		return a+b;
	}
}