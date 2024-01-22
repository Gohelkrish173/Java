public class DemoInheritance{
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
	}
}
class Vehicle{
	int noOfPassanger;
	void start(){
		System.out.print("Key entered, ");
		System.out.println("Started");
	}
	void stop(){
		System.out.println("Stopped");
	}
}
class Car extends Vehicle{
	int noOfAirBags;
}

