class Project extends Thread{
    public String name;
    public Project(String s){
        name=s;
    }    
}

class MyThread_1 implements Runnable{
    public void run(){
        Project p1=new Project("Project-1");
        try{
            for(int i=0;i<=5;i++){
            System.out.println(p1.name+" First Thread-"+i);
            Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());    
        
        }
    }    
}

class MyThread_2 implements Runnable{
    public void run(){
        Project p2=new Project("Project-2");
            try{
                for(int i=0;i<=5;i++){
                System.out.println(p2.name+" Second Thread-"+i);
                Thread.sleep(1000);
                }
            }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }    
    }
}

public class Twoth{
    public static void main(String[] args){
    MyThread_1 m1=new MyThread_1();
    MyThread_2 m2=new MyThread_2();
    Thread t1=new Thread(m1);
    Thread t2=new Thread(m2);
    t1.start();
    t1.setPriority(1);
    t2.start();
    t2.setPriority(10);
    }
}