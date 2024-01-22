import java.util.*;

public class p3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("value of a:");
		int a=sc.nextInt();
		System.out.println("value of b:");
		int b=sc.nextInt();

		try{
			int c=(a/b);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}