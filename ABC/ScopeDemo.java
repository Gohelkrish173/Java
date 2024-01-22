public class ScopeDemo{
	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.printA(25);
		System.out.println(obj1.b);

	}
	static{
		System.out.println("Static block of ScopeDemo");
	}
}

class Abc{
	int a = 10;
	int b;
	public void printA(int a){
		
		for(int i=0;i<10;i++){
			b = 10;
		}
		
	}

	public void newA(){
		a  = 88;
		System.out.println("b = "+b);
	}
}