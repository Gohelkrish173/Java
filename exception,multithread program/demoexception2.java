import java.util.*;
class MyException extends Exception{
    public MyException(String s){
        super(s);
    }
}

public class demoexception2{
    static int balance;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Current Balance In Account :");
        balance=sc.nextInt();
        try{
            System.out.println("Enter Withdraw Amount=");
            int amount=sc.nextInt();
            withdraw(amount);
        }catch(Exception ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
    public static void withdraw(int amount) throws Exception{
        int newBalance=balance-amount;
        System.out.println("New Current Balance="+newBalance);
        if(newBalance<1000){
            throw new MyException("Krish Exception.");
        }
    }
}