public class AbstractDemo2{
	public static void main(String[] args) {
	}
}

interface Tesla{
	int a = 10;
	void turnLeft();
	void turnRight();
	void acc();
	void dec();
	void breakCar();
}

interface Car{
	void printAverage();
}

abstract class TeslaImpTurn implements Tesla, Car{
	public void turnRight(){

	}
	public void turnLeft(){

	}
}

abstract class TeslaImplSpeed extends TeslaImpTurn{
	public void dec(){

	}
	public void acc(){

	}
}

class TeslaImpl extends TeslaImplSpeed{
	public void breakCar(){

	}
}