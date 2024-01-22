import java.util.Scanner;
public class ExceptionDemo{
	public static void main(String[] args) {
		try{
			vote();	
		}
		catch(AgeException e){
			System.out.println(e);
		}
		
	}

	public static void vote() throws AgeException{
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if(age<18){
			throw new AgeException("Age must be grater than 18");
		}
		else{
			System.out.println("Please Vote");
		}

	}
	
}

class AgeException extends Exception{
	public AgeException(String msg){
		super(msg);
	}

	public String toString(){
		return "Nathi kevu kyu exception che";
	}
}