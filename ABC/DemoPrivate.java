import java.util.Scanner;
import java.io.*;
class BankAccount{
	private int balance;
	private String name;
	public BankAccount(){
		try{
			Scanner sc = new Scanner(new File("balance.txt"));
			name = sc.nextLine();
			balance = sc.nextInt();
		}catch(Exception e){
			// Never left blank
		}
	}
	void withdraw(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount to withdraw = ");
		int amountToWithDraw = sc.nextInt();
		if(amountToWithDraw<balance){
			balance = balance - amountToWithDraw;
			try{
				PrintWriter pw = new PrintWriter(new File("balance.txt"));
				pw.println(name);
				pw.println(balance);
				pw.close();
			}catch(Exception e){
				// Never left blank
			}	
		}else{
			System.out.println("Insufficient Balance");
		}

		
	}
	void printBalance(){
		System.out.println("Current Balance of "+ name+" = "+balance);
	}
}
public class DemoPrivate{
	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		ba.printBalance();
		ba.withdraw();
		ba.printBalance();
	}
}