import java.util.Date;
public class StaticDemo{
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()-100));
	}
}
