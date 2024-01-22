import java.util.Scanner;

class Negative extends Exception{
    public Negative(String s){
        super(s);
    }
}

public class Negative1{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value X=");
        int x=sc.nextInt();
        try{
            Exception2(x);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("input is taken");
    }
    public static void Exception2(int x) throws Exception{
        if(x<0){
            System.out.println("Given input is negative");
            throw new Negative("Given input is Negative and that is error.");
        }
    }
}