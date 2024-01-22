class OuterClass{
	private int a = 10;
	static class NestedClass{
		int b = 20;
		void printB(){
			System.out.println("From inner class ");
		}
	}
}
public class OuterClassDemo{
	public static void main(String[] args) {
		OuterClass.NestedClass ic = new OuterClass.NestedClass();
		ic.printB();
	}
}