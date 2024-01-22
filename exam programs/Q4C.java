import java.util.*;

class Even extends Thread{
    int n;
    void number1(int n){
        this.n=n;
        start();
    }
    public void run(){
        for(int i=0;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
}

class ODD extends Thread{
    int n;
    void number2(int n){
        this.n=n;
        start();
        
    }
    public void run(){

        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}

public class Q4C{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n=");
        n=sc.nextInt();
        Even n1=new Even();
        ODD n2=new ODD();
        n1.number1(n);
        n2.number2(n);
    }
}