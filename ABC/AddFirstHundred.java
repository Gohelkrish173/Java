public class AddFirstHundred{
	public static void main(String[] args) {
		// FirstFifty ff = new FirstFifty();
		// ff.start();


		for(int i=0;i<10;i++){
			System.out.println("AddFirstHundred "+i);
			try{
				Thread.sleep(500);
			}catch(Exception ie){
				ie.printStackTrace();
			}
		}
		
	}
}

class FirstFifty extends Thread{
	@Override
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("FirstFifty "+i);
			try{
				sleep(500);
			}catch(Exception ie){
				ie.printStackTrace();
			}
		}
	}
}

class SecondFifty implements Runnable{
	Thread tObj;
	public SecondFifty(){
		tObj = new Thread(this);
		tObj.start();
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("SecondFifty "+i);
			try{
				Thread.sleep(500);
			}catch(Exception ie){
				ie.printStackTrace();
			}
		}
	}
}
