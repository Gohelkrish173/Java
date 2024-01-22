public class ThreadDemo{
	public static void main(String[] args) {
		SPIAddition sp1 = new SPIAddition();
		sp1.start();

		for(int i=0;i<1000;i++){
			System.out.println("Main = "+i);	
		}
	}
}

class SPIAddition extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("Thread = "+i);	
		}
	}
}