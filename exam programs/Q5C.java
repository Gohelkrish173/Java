import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Q5C{
    public static void main(String[] args){
        try{
        FileInputStream in1=new FileInputStream("INPUT1.txt");
        FileInputStream in2=new FileInputStream("INPUT2.txt");
        FileOutputStream out=new FileOutputStream("OUTPUT.txt");
        int c=0,d=0;
        while((c=in1.read())!=-1){
            out.write(c);
        }
        while((d=in2.read())!=-1){
            out.write(d);
        }out.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
