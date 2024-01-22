import java.util.*;
class myexception extends Exception{
	public myexception(String s){
		super(s);
	}
}

public class p4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Current Balance in Acount:");
		int balance=sc.nextInt();
		try{
			System.out.println("Enter Withdraw Amount : ");
			int amount =sc.nextInt();
			p4 a=new p4();
			a.withdraw(balance,amount);
		}catch(Exception ex){
			System.out.println("Exception Caught.");
			System.out.println(ex.getMessage());
		}
	}
		public void withdraw(int balance,int amount) throws Exception{
		int Balance=(balance - amount);
		if(Balance<1000){
			throw new myexception("here balance is going to less than 1000.");
		}
		else{
			System.out.println("new Current Balance:"+Balance);
		}
	}
}