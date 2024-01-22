import java.util.concurrent.*;
class Task implements Runnable{
    int i=0;
    public String name;
    public Task(String s){
        name=s;
    }
    public void run(){
        try{
            for(i=5;i>0;i--){
                System.out.println(name+"Task Number -"+i);
                Thread.sleep(500);
            }
            System.out.println("name completed.");
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}

public class Framework{
    public static void main(String[] args){
        Runnable r1=new Task("task-1");
        Runnable r2=new Task("task-2"); 
        Runnable r3=new Task("task-3");
        Runnable r4=new Task("task-4");
        Runnable r5=new Task("task-5");
        ExecutorService pool=Executors.newFixedThreadPool(3);
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5);
        pool.shutdown();
    }
}