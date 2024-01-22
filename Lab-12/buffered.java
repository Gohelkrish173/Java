import java.io.*;

public class buffered{
    public static void main(String[] args){
        try{
        FileReader fr=new FileReader("INPUT.txt");
        BufferedReader br=new BufferedReader(fr);
        char c[]=new char[20];
        br.skip(8);
        if(br.ready()){
            System.out.println(br.readLine());
            br.read(c);
            for(int i=0;i<=20;i++){
                System.out.print(c[i]);
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}