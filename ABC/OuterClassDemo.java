class OuterClass{
	private int a = 10;
	class InnerClass{
		int b = 20;
		void printB(){
			System.out.println("From inner class "+a);
		}
	}
}
public class OuterClassDemo{
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.printB();
	}
}