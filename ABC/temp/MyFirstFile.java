public class MyFirstFile
{
	public static void main(String[] args) {
		Abc a1 = new Abc();
		a1.area(5,7.0);
	}
}

class Abc{
	public void area(int temp){
		int a = temp * temp;
		System.out.println("Area of square = "+a);
	}
	public void area(double temp1, int temp2){
		System.out.println("First Method");
	}
	public void area(int temp1, double temp2){
		System.out.println("Second Method");
	}

	public void area(double temp){
		double a = Math.PI * Math.pow(temp,2);
		System.out.println("Area of circle = "+a);
	}
}