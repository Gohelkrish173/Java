import java.io.FileOutputStream;

public class FileOutDemo{
    public static void main(String[] args){
        try{
        FileOutputStream f1=new FileOutputStream("abc.txt");
        String s="Krish Gohel Is A Good Player\n Shyam Gohel Is A Good All Rounder.";
        byte b[]=s.getBytes();
        f1.write(b);
        f1.close();
        System.out.println("Success..");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}