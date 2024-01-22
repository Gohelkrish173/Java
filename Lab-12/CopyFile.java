import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args){
        try{
            FileInputStream IN=new FileInputStream("INPUT.txt");;
            FileOutputStream OUT=new FileOutputStream("OUTPUT.txt");;
            int c;
            while((c=IN.read())!=-1){
                OUT.write(c);
            }
            System.out.println("Success..");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
