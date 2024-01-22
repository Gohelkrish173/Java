package p1;
import p1.student.*;
import p1.exam.*;

public class p1 {
    public static void main(String[] args){
        Student A=new Student();
        A.show();
        System.out.println("\nMarksheet OF Students:\n");
        Exam B=new Exam();
        B.marksheet();
    }
}