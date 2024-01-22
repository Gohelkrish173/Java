public class AbstractDemo{
	public static void main(String[] args) {
		Tesla t = new TeslaImp();
		t.pullBreak();
	}
}

abstract class Tesla{
	abstract void turnRight();
	abstract void pullBreak();
	abstract void start();
}

abstract class TeslaImp extends Tesla{
	public void pullBreak(){
		System.out.println("Breaked");
	}
	public void turnRight(){
		System.out.println("Turn Right");
	}
}

class TeslaNewImp extends TeslaImp{
	
}