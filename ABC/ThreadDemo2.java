public class ThreadDemo2{
	public static void main(String[] args) {
		Table t = new Table();
		MyThread1 mt1 = new MyThread1(t);
		MyThread2 mt2 = new MyThread2(t);

		mt2.start();
		mt1.start();

	}
}

class Table{
	synchronized void printTable(int n){
		for(int i=1;i<11;i++){
			System.out.println(n +" X "+ i + " = "+ (n*i));
		}
	}
}

class MyThread1 extends Thread{
	Table t;
	public MyThread1(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(5);
	}
}

class MyThread2 extends Thread{
	Table t;
	public MyThread2(Table t){
		this.t = t;
	}
	public void run(){
		t.printTable(7);
	}
}