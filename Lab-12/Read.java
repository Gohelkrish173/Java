import java.io.*;
public class Read {
    public static void main(String[] args){
        try{
            Reader reader=new FileReader("D:\\college work\\OOP\\practical\\Lab-12\\OUTPUT.txt");
            int data=reader.read();
            while(data!=-1){
                char datachar=(char) data;
                data=reader.read();
                System.out.println(datachar);
                Thread.sleep(500);
            }
            reader.close();
        }catch(NoClassDefFoundError e1){
            System.out.println(e1);
        }catch(IOException e2){
            System.out.println(e2);
        }catch(InterruptedException e3){
            System.out.println(e3);
        }
    }
}