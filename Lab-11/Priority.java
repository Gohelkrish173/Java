class ThPriority extends Thread{
    public ThPriority(String s){
        super(s);
    }
    public void run(){
        try{
            for(int i=0;i<11;i++){
            sleep(500);
            System.out.println("call of "+this.getName()+" "+i);
            }
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}

public class Priority{
    public static void main(String[] args){
        ThPriority o1=new ThPriority("Low");
        o1.setPriority(Thread.MIN_PRIORITY);
        ThPriority o2=new ThPriority("High");
        o2.setPriority(Thread.MAX_PRIORITY);
        o1.start();
        o2.start();
    }
}