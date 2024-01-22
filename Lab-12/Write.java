import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;

public class Write {
    public static void main(String[] args){
        try{
        Writer w=new FileWriter("write.txt");
        w.write("Rohit Sharma Scored 264 vs sri-lanka in 2014.");
        w.close();
        System.out.println("write successfull.");
        }catch(FileNotFoundException e2){
            System.out.println(e2);
        }catch(Exception e){
            System.out.println(e);
        }
    }    
}
