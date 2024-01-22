import java.util.*;
public class Game
{ 
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int score=0;
		int cscore=0;
		System.out.println("Play until either yours or Computer score hits -10");
		while(score>=(-10)||cscore>=(-10)){
		System.out.print("Enter your Number from 0 to 100=");
		int n=s.nextInt();
		int cn=(int)(Math.random()*100);
		double avg=(n+cn)/2;
		if((n-avg)>(cn-avg)){
		    System.out.println("You Lost this match");
            score--;
		    System.out.println("Your Number="+(n)+"\nComputer Number="+(cn)+"\nAverage="+(avg)+"\nYoue Score="+(score)+"\nComputer Score="+(cscore));
		}
		else{
		    System.out.println("You Win this match");
            cscore--;
		    System.out.println("Your Number="+(n)+"\nComputer Number="+(cn)+"\nAverage="+(avg)+"\nYoue Score="+(score)+"\nComputer Score="+(cscore));
		    }
	    }
	    
	}
}