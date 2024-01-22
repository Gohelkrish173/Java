import java.util.*;
public class DemoArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> names = new LinkedList<Student>();
		names.add(new Student("arjun",101,2.5));
		names.add(new Student("darshan",102,3.5));
		names.add(new Student("rajkot",103,1.5));
		names.add(new Student("Gujarat",104,0.8));
		names.add(new Student("INDIA",105,9.3));


		Iterator<Student> myIte = names.listIterator();

	}
}

class Student{
	String name;
	int rollNo;
	double spi;

	public Student(String name, int rollNo, double spi){
		this.name = name;
		this.rollNo = rollNo;
		this.spi = spi;
	}

	public void printStudent(){
		System.out.println("Name = "+name+", rollNo = "+rollNo+", SPI = "+spi);
	}
}