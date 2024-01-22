import java.util.*;
public class demoexception{
    public static void main(String[] args){
        int balance=5000;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount to Withdraw :");
        int withdraw=sc.nextInt();

        try{
            if(balance-withdraw<1000){
                throw new Exception("Balance must be greater than 1000");
            }
            else{
                balance=balance-withdraw;
                System.out.println("New Balance = "+ balance);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}