class MyThread extends Thread{
	public MyThread(){
		super("New Thread");
		System.out.println("Child thread:"+this);
		start();
	}
	public void run(){
		try{
			for(int i=5;i>0;i--){
				System.out.println("Child Thread:");
				Thread.sleep(500);
			}
		}catch(InterruptedException e){
				System.out.println("Child interrupted.");
			}
			System.out.println("Exiting child thread.");
	}
}
class Extending{
	public static void main(String[] args){
		new MyThread();
		try{
			for(int i=5;i>0;i--){
				System.out.println("Main Thread:"+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e){
			System.out.println("Main Thread Interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}