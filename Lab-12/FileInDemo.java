import java.io.FileInputStream;

public class FileInDemo {
    public static void main(String[] args){
        try{
            int i=0;
            FileInputStream f1=new FileInputStream("abc.txt");
            while((i=f1.read())!=-1){
                System.out.print((char)i);
                Thread.sleep(500);
            }
            f1.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
