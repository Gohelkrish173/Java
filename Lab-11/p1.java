class Mythread implements Runnable{
	public void run(){
		for(int i=5;i>0;i--){
			System.out.println("Hello :"+i);
		}
	}
}

public class p1{
	public static void main(String[] args){
		try{
		Mythread a=new Mythread();
		Thread t=new Thread(a);
		t.start();
		t.sleep(1000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
	}
}