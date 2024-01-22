import java.util.Scanner;
public class InheritanceDemo{
	public static void main(String[] args) {
		Game g = new Game();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for game");
		System.out.println("Enter 2 for cricket");
		System.out.println("Enter 3 for chess");
		System.out.println("Enter 4 for badminton");
		System.out.println("Enter 5 for football");
		int temp = sc.nextInt();

		if(temp==2){
			g = new Cricket();
		}
		else if(temp==3){
			g = new Chess();
		}
		else if(temp==4){
			g = new Badminton();
		}
		else if(temp==5){
			g = new Football();
		}
		g.type();

		if(g instanceof Cricket){
			System.out.println("Cricket object");
		}
		else{
			System.out.println("Not a Cricket object");	
		}
	}
}

class Game{
	void type(){
		System.out.println("Indoor/Outdoor");
	}
}

class Cricket extends Game{
	void type(){
		System.out.println("Outdoor");
	}	
}

class Chess extends Game{
	void type(){
		System.out.println("Indoor");
	}	
}

class Football extends Game{
	void type(){
		System.out.println("Outdoor");
	}	
}

class Badminton extends Game{
	void type(){
		System.out.println("Indoor");
	}	
}